package wraith.harvest_scythes.api.event;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public record SingleHarvestEvent(World world, PlayerEntity user, ItemStack stack,
                                 BlockState blockState, BlockPos cropPos, int currentBlockAmount, int totalBlocks,
                                 boolean gotDamaged) {

}
