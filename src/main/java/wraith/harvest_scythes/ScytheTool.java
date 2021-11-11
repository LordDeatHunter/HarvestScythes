package wraith.harvest_scythes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.PlantBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ScytheTool extends HoeItem {

    protected int harvestRadius;

    public ScytheTool(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        this(material, attackDamage, attackSpeed, getRadius(material), settings);
    }

    public ScytheTool(ToolMaterial material, int attackDamage, float attackSpeed, int harvestRadius, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.harvestRadius = harvestRadius;
    }

    public ScytheTool(ToolMaterial material, Settings settings) {
        this(material, 5, -3.3F, settings);
    }

    public ScytheTool(ToolMaterial material, int harvestRadius, Settings settings) {
        this(material, 5, -3.3F, harvestRadius, settings);
    }

    private static int getRadius(ToolMaterial material) {
        return (int) (Math.floor(material.getMiningLevel() / 2.0) + 1);
    }

    private static boolean shouldBeCircle(int radius) {
        return radius % 2 == 0;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return world.isClient ? TypedActionResult.fail(user.getStackInHand(hand)) : harvest(this.harvestRadius, world, user, hand);
    }

    public static TypedActionResult<ItemStack> harvest(int harvestRadius, World world, PlayerEntity user, Hand hand) {
        var blockPos = user.getBlockPos();
        var stack = user.getStackInHand(hand);
        var item = stack.getItem();

        int lvl = EnchantmentHelper.getLevel(EnchantsRegistry.ENCHANTMENTS.get("crop_reaper"), stack);
        int radius = (int) (Math.floor(lvl / 2.0) + harvestRadius);
        boolean circleHarvest = shouldBeCircle(harvestRadius + lvl);

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
                    if (block instanceof CropBlock cropBlock && cropBlock.isMature(blockState)) {
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
                        damageTool = 1;
                    } else if (block instanceof PlantBlock && !(block instanceof CropBlock)) {
                        world.breakBlock(cropPos, true, user);
                        damageTool = 1;
                    }
                    if (damageTool > 0) {
                        int unbreaking = EnchantmentHelper.getLevel(Enchantments.UNBREAKING, stack);
                        if (Utils.getRandomIntInRange(0, unbreaking) > 0) {
                            continue;
                        }
                        stack.damage(damageTool, (LivingEntity) user, ((e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND)));
                        if (stack.getItem() != item) {
                            return TypedActionResult.success(stack);
                        }
                    }
                }
            }
        }
        return TypedActionResult.success(stack);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        int lvl = EnchantmentHelper.getLevel(EnchantsRegistry.ENCHANTMENTS.get("crop_reaper"), stack);
        int radius = (int) (Math.floor(lvl / 2.0) + harvestRadius);
        boolean circleHarvest = shouldBeCircle(harvestRadius + lvl);
        tooltip.add(new TranslatableText("harvest_scythes.scythe_tooltip.radius", new TranslatableText("harvest_scythes.scythe_tooltip.radius.arg_color").append(String.valueOf(radius))));
        tooltip.add(new TranslatableText("harvest_scythes.scythe_tooltip.circle", new TranslatableText("harvest_scythes.scythe_tooltip.circle.arg_color").append(String.valueOf(circleHarvest))));
    }

    public int getHarvestRadius() {
        return this.harvestRadius;
    }

    public boolean hasCircleHarvset() {
        return shouldBeCircle(this.harvestRadius);
    }

}
