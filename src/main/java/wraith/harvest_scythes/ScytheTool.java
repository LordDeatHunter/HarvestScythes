package wraith.harvest_scythes;

import net.minecraft.block.*;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.HashSet;

public class ScytheTool extends HoeItem {

    protected int harvestRadius;
    protected boolean circleHarvest;

    public ScytheTool(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        this(material, attackDamage, attackSpeed, getRadius(material), shouldBeCircle(material), settings);
    }

    public ScytheTool(ToolMaterial material, int attackDamage, float attackSpeed, int harvestRadius, boolean circleHarvest, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.harvestRadius = harvestRadius;
        this.circleHarvest = circleHarvest;
    }

    public ScytheTool(ToolMaterial material, Settings settings) {
        this(material, material.getMiningLevel() + 2, -3.0F, settings);
    }

    public ScytheTool(ToolMaterial material, int harvestRadius, boolean circleHarvest, Settings settings) {
        this(material, material.getMiningLevel() + 2, -3.0F, harvestRadius, circleHarvest, settings);
    }

    private static int getRadius(ToolMaterial material) {
        return (int) (Math.floor(material.getMiningLevel()/2.0) + 1);
    }

    private static boolean shouldBeCircle(ToolMaterial material) {
        return material.getMiningLevel() % 2 == 0;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return harvest(this.harvestRadius, this.circleHarvest, world, user, hand);
    }

    public static TypedActionResult<ItemStack> harvest(int harvestRadius, boolean circleHarvest, World world, PlayerEntity user, Hand hand) {

        BlockPos blockPos = user.getBlockPos();

        Item item = user.getStackInHand(hand).getItem();

        int lvl = EnchantmentHelper.getLevel(EnchantsRegistry.ENCHANTMENTS.get("crop_reaper"), user.getStackInHand(hand));
        int radius = (int) (Math.floor(lvl/2.0) + harvestRadius);
        circleHarvest = (harvestRadius + lvl) % 2 == 0;

        for (int x = -radius; x <= radius; ++x){
            for (int y = -1; y <= 1; ++y){
                for (int z = -radius; z <= radius; ++z){
                    BlockPos newBlockPos = new BlockPos(blockPos.getX() + x, blockPos.getY() + y, blockPos.getZ() + z);
                    if (circleHarvest &&
                            ((y == -1 && newBlockPos.getManhattanDistance(blockPos.down()) > radius) ||
                            (y == 0 && newBlockPos.getManhattanDistance(blockPos) > radius) ||
                            (y == 1 && newBlockPos.getManhattanDistance(blockPos.up()) > radius))) {
                        continue;
                    }
                    BlockState blockState = world.getBlockState(newBlockPos);
                    Block block = blockState.getBlock();
                    int damageTool = 0;
                    if (block instanceof CropBlock && ((CropBlock)block).isMature(blockState)) {
                        CropBlock cropBlock = (CropBlock) block;
                        Block.dropStacks(blockState, world, newBlockPos);
                        world.setBlockState(newBlockPos, cropBlock.withAge(0));
                        damageTool = 1;
                    }
                    else if (block instanceof PlantBlock && !(block instanceof CropBlock)){
                        world.breakBlock(newBlockPos, true, user);
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
        return TypedActionResult.pass(user.getStackInHand(hand));
    }

    public int getHarvestRadius() {
        return this.harvestRadius;
    }
    public boolean hasCircleHarvset() {
        return this.circleHarvest;
    }

}
