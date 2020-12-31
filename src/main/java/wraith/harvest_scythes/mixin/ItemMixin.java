package wraith.harvest_scythes.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import wraith.harvest_scythes.ScytheTool;
import wraith.harvest_scythes.Utils;

@Mixin(Item.class)
public abstract class ItemMixin {

    @Shadow public abstract Item asItem();

    @Inject(method = "use", at = @At("HEAD"), cancellable = true)
    void use(World world, PlayerEntity user, Hand hand, CallbackInfoReturnable<TypedActionResult<ItemStack>> cir){
        CompoundTag tag = user.getStackInHand(hand).getTag();
        boolean isScythe = asItem() instanceof ScytheTool;
        boolean hasTag = tag != null && tag.contains("HarvestScytheProperties");
        if (isScythe || hasTag) {
            int harvestRadius = 0;
            boolean circleHarvest = false;
            if (isScythe) {
                harvestRadius = ((ScytheTool) asItem()).getHarvestRadius();
                circleHarvest = ((ScytheTool) asItem()).hasCircleHarvset();
            }
            else {
                tag = tag.getCompound("HarvestScytheProperties");
                if (tag.contains("HarvestRadius")) {
                    harvestRadius = tag.getInt("HarvestRadius");
                }
                if (tag.contains("CircleHarvest")) {
                    circleHarvest = tag.getBoolean("CircleHarvest");
                }
            }

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
                                cir.setReturnValue(TypedActionResult.pass(user.getStackInHand(hand)));
                                cir.cancel();
                            }
                        }
                    }
                }
            }
            cir.setReturnValue(TypedActionResult.pass(user.getStackInHand(hand)));
            cir.cancel();
        }
    }

}
