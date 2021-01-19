package wraith.harvest_scythes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ScytheTool extends HoeItem {

    protected int harvestRadius;
    protected boolean circleHarvest;

    public ScytheTool(ToolMaterial material, int attackDamage, float attackSpeed, int harvestRadius, boolean circleHarvest, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.harvestRadius = harvestRadius;
        this.circleHarvest = circleHarvest;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return harvest(this.harvestRadius, this.circleHarvest, world, user, hand);
    }

    public static TypedActionResult<ItemStack> harvest(int harvestRadius, boolean circleHarvest, World world, PlayerEntity user, Hand hand) {
        Vec3d pos = user.getPos();
        BlockPos blockPos = new BlockPos(Utils.round(pos.x), Utils.round(pos.y), Utils.round(pos.z));
        Item item = user.getStackInHand(hand).getItem();
        for (int x = -harvestRadius; x <= harvestRadius; ++x){
            for (int y = -1; y <= 1; ++y){
                for (int z = -harvestRadius; z <= harvestRadius; ++z){
                    BlockPos newBlockPos = new BlockPos(blockPos.getX() + x, blockPos.getY() + y, blockPos.getZ() + z);
                    if (circleHarvest &&
                            ((y == -1 && newBlockPos.getManhattanDistance(blockPos.up()) > harvestRadius) ||
                                    (y == 0 && newBlockPos.getManhattanDistance(blockPos) > harvestRadius) ||
                                    (y == 1 && newBlockPos.getManhattanDistance(blockPos.down()) > harvestRadius))) {
                        continue;
                    }
                    BlockState blockState = world.getBlockState(newBlockPos);
                    Block block = blockState.getBlock();
                    int damageTool = 0;
                    if (block instanceof CropBlock && ((CropBlock)block).isMature(blockState)) {
                        CropBlock cropBlock = (CropBlock) block;
                        Block.dropStacks(blockState, world, newBlockPos);
                        world.setBlockState(newBlockPos, cropBlock.withAge(0));
                        damageTool = 2;
                    }
                    else if (block.equals(Blocks.GRASS) || block.equals(Blocks.TALL_GRASS) || block.equals(Blocks.FERN) || block.equals(Blocks.LARGE_FERN)){
                        world.breakBlock(newBlockPos, true, user);
                        damageTool = 1;
                    }
                    if (damageTool > 0){
                        user.getStackInHand(hand).damage(damageTool, (LivingEntity) user, ((e) -> {e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);}));
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
