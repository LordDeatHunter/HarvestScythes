package wraith.harvest_scythes.api.event;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public record HarvestEvent(World world, PlayerEntity user,
                           ItemStack stack, int totalBlocksHarvested, int totalToolDamage) {
}
