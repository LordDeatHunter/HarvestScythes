package wraith.harvest_scythes.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import wraith.harvest_scythes.api.event.HarvestEvent;
import wraith.harvest_scythes.api.event.SingleHarvestEvent;
import wraith.harvest_scythes.api.machete.HSMacheteEvents;
import wraith.harvest_scythes.registry.EnchantsRegistry;
import wraith.harvest_scythes.registry.ItemRegistry;
import wraith.harvest_scythes.util.Config;
import wraith.harvest_scythes.util.HSUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MacheteItem extends SwordItem {

    protected int harvestDepth;

    public MacheteItem(ToolMaterial material, int attackDamage, float attackSpeed, int harvestDepth, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.harvestDepth = harvestDepth;
    }

    public MacheteItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        this(material, attackDamage, attackSpeed, getDepthFromMaterial(material), settings);
    }

    public MacheteItem(ToolMaterial material, Settings settings) {
        this(material, 2, -2.0F, settings);
    }

    public MacheteItem(ToolMaterial material, int harvestDepth, Settings settings) {
        this(material, 2, -2.0F, harvestDepth, settings);
    }

    private static int getDepthFromMaterial(ToolMaterial material) {
        return (Math.min(10, material.getMiningLevel() + 1)) * 18;
    }

    public static int getHarvestDepth(ItemStack stack) {
        if (!(stack.getItem() instanceof MacheteItem machete)) {
            return 0;
        }
        var enchantLevel = EnchantmentHelper.getLevel(EnchantsRegistry.ENCHANTMENTS.get("leaf_eater"), stack);
        return MathHelper.clamp(machete.getRegularHarvestDepth() + MathHelper.clamp(enchantLevel * 18, 0, 240), 0, 240);
    }

    public int getRegularHarvestDepth() {
        return MathHelper.clamp(this.harvestDepth, 0, 240);
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        return super.isSuitableFor(state) || state.getBlock() instanceof LeavesBlock;
    }

    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return super.canMine(state, world, pos, miner) || state.getBlock() instanceof LeavesBlock;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(new TranslatableText("harvest_scythes.machete_tooltip.depth", new TranslatableText("harvest_scythes.machete_tooltip.depth.arg_color").append(String.valueOf(getHarvestDepth(stack)))));
    }

    public static void tryHarvest(World world, PlayerEntity player, BlockPos pos, BlockState blockState, BlockEntity blockEntity) {
        if (world.isClient) {
            return;
        }
        ItemStack stack = player.getMainHandStack();
        if (!(stack.getItem() instanceof MacheteItem machete)) {
            return;
        }
        int blocksHarvested = 0;
        int damage = 0;
        boolean isCreative = machete == ItemRegistry.get("creative_machete");
        Queue<BlockPos> positions = new LinkedList<>();
        positions.add(pos);
        while (!positions.isEmpty() && blocksHarvested <= MacheteItem.getHarvestDepth(stack)) {
            var curPos = positions.remove();
            var curState = world.getBlockState(curPos);
            var block = curState.getBlock();
            if ((!(block instanceof LeavesBlock) && blocksHarvested > 0) || !Config.getInstance().canMacheteHarvest(Registry.BLOCK.getId(block))) {
                continue;
            }
            world.breakBlock(curPos, true);
            ++blocksHarvested;
            for (int x = -1; x <= 1; ++x) {
                for (int y = -1; y <= 1; ++y) {
                    for (int z = -1; z <= 1; ++z) {
                        if (x == 0 && y == 0 && z == 0) {
                            continue;
                        }
                        positions.add(curPos.add(x, y, z));
                    }
                }
            }
            var takeDamage = HSUtils.getRandomIntInRange(0, EnchantmentHelper.getLevel(Enchantments.UNBREAKING, stack)) == 0;
            HSMacheteEvents.onSingleHarvest(new SingleHarvestEvent(world, player, stack, curState, curPos, 1, blocksHarvested, takeDamage));
            if (!isCreative && takeDamage) {
                ++damage;
                stack.damage(1, player, (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
            }
        }
        HSMacheteEvents.onHarvest(new HarvestEvent(world, player, stack, blocksHarvested, damage));
    }

}
