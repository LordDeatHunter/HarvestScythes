package wraith.harvest_scythes;

import net.minecraft.block.*;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.HashSet;
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
        return (int) (Math.floor(material.getMiningLevel()/2.0) + 1);
    }

    private static boolean shouldBeCircle(int radius) {
        return radius % 2 == 0;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) {
            return TypedActionResult.fail(user.getStackInHand(hand));
        }
        return harvest(this.harvestRadius, world, user, hand);
    }

    public static TypedActionResult<ItemStack> harvest(int harvestRadius, World world, PlayerEntity user, Hand hand) {

        BlockPos blockPos = user.getBlockPos();

        Item item = user.getStackInHand(hand).getItem();

        int lvl = EnchantmentHelper.getLevel(EnchantsRegistry.ENCHANTMENTS.get("crop_reaper"), user.getStackInHand(hand));
        int radius = (int) (Math.floor(lvl/2.0) + harvestRadius);
        boolean circleHarvest = shouldBeCircle(harvestRadius + lvl);

        for (int x = -radius; x <= radius; ++x){
            for (int y = -1; y <= 1; ++y){
                for (int z = -radius; z <= radius; ++z){
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
                    if (block instanceof CropBlock && ((CropBlock)block).isMature(blockState)) {
                        CropBlock cropBlock = (CropBlock) block;
                        List<ItemStack> drops = Block.getDroppedStacks(blockState, (ServerWorld) world, blockPos, world.getBlockEntity(blockPos));
                        boolean removedExtraSeed = false;
                        for (ItemStack drop : drops) {
                            Item dropItem = drop.getItem();
                            if (!removedExtraSeed && dropItem instanceof BlockItem && ((BlockItem) dropItem).getBlock() == cropBlock) {
                                removedExtraSeed = true;
                                drop.decrement(1);
                            }
                            Block.dropStack(world, cropPos, drop);
                        }
                        world.setBlockState(cropPos, cropBlock.withAge(0));
                        damageTool = 1;
                    }
                    else if (block instanceof PlantBlock && !(block instanceof CropBlock)){
                        world.breakBlock(cropPos, true, user);
                        damageTool = 1;
                    }
                    if (damageTool > 0) {
                        int unbreaking = EnchantmentHelper.getLevel(Enchantments.UNBREAKING, user.getStackInHand(hand));
                        if (Utils.getRandomIntInRange(0, unbreaking) > 0) {
                            continue;
                        }
                        user.getStackInHand(hand).damage(damageTool, (LivingEntity) user, ((e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND)));
                        if (user.getStackInHand(hand).getItem() != item) {
                            return TypedActionResult.success(user.getStackInHand(hand));
                        }
                    }
                }
            }
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    public int getHarvestRadius() {
        return this.harvestRadius;
    }
    public boolean hasCircleHarvset() {
        return shouldBeCircle(this.harvestRadius);
    }

}
