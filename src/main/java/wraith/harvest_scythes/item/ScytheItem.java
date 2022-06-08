package wraith.harvest_scythes.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.PlantBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import wraith.harvest_scythes.api.event.HarvestEvent;
import wraith.harvest_scythes.api.event.SingleHarvestEvent;
import wraith.harvest_scythes.api.scythe.HSScythesEvents;
import wraith.harvest_scythes.registry.EnchantsRegistry;
import wraith.harvest_scythes.util.Config;
import wraith.harvest_scythes.util.HSUtils;

import java.util.List;

public class ScytheItem extends HoeItem {

    protected int harvestRadius;

    public ScytheItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        this(material, attackDamage, attackSpeed, getLowerRadius(material.getMiningLevel()), settings);
    }

    public ScytheItem(ToolMaterial material, int attackDamage, float attackSpeed, int harvestRadius, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.harvestRadius = harvestRadius;
    }

    public ScytheItem(ToolMaterial material, Settings settings) {
        this(material, 5, -3.3F, settings);
    }

    public ScytheItem(ToolMaterial material, int harvestRadius, Settings settings) {
        this(material, 5, -3.3F, harvestRadius, settings);
    }

    public static int getLowerRadius(int miningLevel) {
        return (int) (Math.floor(miningLevel / 2.0) + 1);
    }
    public static int getUpperRadius(int miningLevel) {
        return (int) (Math.ceil(miningLevel / 2.0) + 1);
    }

    protected static boolean shouldBeCircle(int miningLevel) {
        return getLowerRadius(miningLevel) == getUpperRadius(miningLevel);
    }

    public static TypedActionResult<ItemStack> harvest(int harvestRadius, int miningLevel, World world, PlayerEntity user, Hand hand) {
        var blockPos = user.getBlockPos();
        var stack = user.getStackInHand(hand);
        var item = stack.getItem();

        int lvl = EnchantmentHelper.getLevel(EnchantsRegistry.ENCHANTMENTS.get("crop_reaper"), stack);
        boolean prematureHarvest = EnchantmentHelper.getLevel(EnchantsRegistry.ENCHANTMENTS.get("blind_harvest_curse"), stack) > 0;
        int radius = (int) (Math.floor(lvl / 2.0) + harvestRadius);
        boolean circleHarvest = shouldBeCircle(miningLevel + lvl);

        int totalBlocks = 0;
        int totalDamage = 0;

        for (int x = -radius; x <= radius; ++x) {
            for (int y = -1; y <= 1; ++y) {
                for (int z = -radius; z <= radius; ++z) {
                    BlockPos cropPos = new BlockPos(blockPos.getX() + x, blockPos.getY() + y, blockPos.getZ() + z);
                    if (circleHarvest &&
                        ((y == -1 && cropPos.getManhattanDistance(blockPos.down()) > radius) ||
                            (y == 0 && cropPos.getManhattanDistance(blockPos) > radius) ||
                            (y == 1 && cropPos.getManhattanDistance(blockPos.up()) > radius))) {
                        continue;
                    }
                    BlockState blockState = world.getBlockState(cropPos);
                    Block block = blockState.getBlock();
                    int damageTool = 0;
                    boolean canHarvest = Config.getInstance().canScytheHarvest(Registry.BLOCK.getId(block));
                    if (block instanceof CropBlock cropBlock && (prematureHarvest || cropBlock.isMature(blockState)) && canHarvest) {
                        if (prematureHarvest) {
                            world.breakBlock(cropPos, true, user);
                        } else {
                            var drops = Block.getDroppedStacks(blockState, (ServerWorld) world, blockPos, world.getBlockEntity(blockPos), null, stack);
                            boolean removedExtraSeed = false;
                            for (var drop : drops) {
                                Item dropItem = drop.getItem();
                                if (!removedExtraSeed && dropItem instanceof BlockItem dropBlock && dropBlock.getBlock() == cropBlock) {
                                    removedExtraSeed = true;
                                    drop.decrement(1);
                                }
                                Block.dropStack(world, cropPos, drop);
                            }
                            world.setBlockState(cropPos, cropBlock.withAge(0));
                        }
                        damageTool = 1;
                    } else if (block instanceof PlantBlock && !(block instanceof CropBlock) && canHarvest) {
                        world.breakBlock(cropPos, true, user);
                        damageTool = 1;
                    }
                    if (damageTool > 0) {
                        totalBlocks += damageTool;
                        var takeDamage = HSUtils.getRandomIntInRange(0, EnchantmentHelper.getLevel(Enchantments.UNBREAKING, stack)) == 0;
                        HSScythesEvents.onSingleHarvest(new SingleHarvestEvent(world, user, stack, blockState, cropPos, damageTool, totalBlocks, takeDamage));
                        if (!takeDamage) {
                            continue;
                        }
                        totalDamage += damageTool;
                        stack.damage(damageTool, (LivingEntity) user, ((e) -> e.sendToolBreakStatus(hand)));
                        if (stack.getItem() != item) {
                            HSScythesEvents.onHarvest(new HarvestEvent(world, user, stack, totalBlocks, totalDamage));
                            return TypedActionResult.success(stack);
                        }
                    }
                }
            }
        }
        HSScythesEvents.onHarvest(new HarvestEvent(world, user, stack, totalBlocks, totalDamage));
        return totalBlocks > 0 ? TypedActionResult.success(stack) : TypedActionResult.fail(stack);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return world.isClient ? TypedActionResult.fail(user.getStackInHand(hand)) : harvest(this.harvestRadius, this.getMaterial().getMiningLevel(), world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        int lvl = EnchantmentHelper.getLevel(EnchantsRegistry.ENCHANTMENTS.get("crop_reaper"), stack);
        int radius = (int) (Math.floor(lvl / 2.0) + harvestRadius);
        boolean circleHarvest = shouldBeCircle(this.getMaterial().getMiningLevel() + lvl);
        tooltip.add(Text.translatable("harvest_scythes.scythe_tooltip.radius", Text.translatable("harvest_scythes.scythe_tooltip.radius.arg_color").append(String.valueOf(radius))));
        tooltip.add(Text.translatable("harvest_scythes.scythe_tooltip.circle", Text.translatable("harvest_scythes.scythe_tooltip.circle.arg_color").append(String.valueOf(circleHarvest))));
    }

    public int getHarvestRadius() {
        return this.harvestRadius;
    }

    public boolean hasCircleHarvset() {
        return shouldBeCircle(this.getMaterial().getMiningLevel());
    }

}
