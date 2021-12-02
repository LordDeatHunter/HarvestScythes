package wraith.harvest_scythes.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import wraith.harvest_scythes.registry.EnchantsRegistry;

import java.util.List;

public class MacheteItem extends SwordItem {

    protected int harvestDepth;

    public MacheteItem(ToolMaterial material, int attackDamage, float attackSpeed, int harvestDepth, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.harvestDepth = harvestDepth;
    }

    public MacheteItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        this(material, attackDamage, attackSpeed, getDepth(material), settings);
    }

    public MacheteItem(ToolMaterial material, Settings settings) {
        this(material, 2, -2.0F, settings);
    }

    public MacheteItem(ToolMaterial material, int harvestDepth, Settings settings) {
        this(material, 2, -2.0F, harvestDepth, settings);
    }

    private static int getDepth(ToolMaterial material) {
        return (Math.min(10, material.getMiningLevel() + 1)) * 18;
    }

    public static int getHarvestDepth(ItemStack stack) {
        if (!(stack.getItem() instanceof MacheteItem machete)) {
            return 0;
        }
        var enchantLevel = EnchantmentHelper.getLevel(EnchantsRegistry.ENCHANTMENTS.get("leaf_eater"), stack);
        return MathHelper.clamp(machete.getHarvestDepth() + MathHelper.clamp(enchantLevel * 18, 0, 240), 0, 240);
    }

    public int getHarvestDepth() {
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
        tooltip.add(new TranslatableText("harvest_scythes.machete_tooltip.depth", new TranslatableText("harvest_scythes.machete_tooltip.depth.arg_color").append(String.valueOf(harvestDepth))));
    }

}
