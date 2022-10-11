package wraith.harvest_scythes.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import wraith.harvest_scythes.item.ScytheItem;

@Mixin(Item.class)
public class ItemMixin {

    @Inject(method = "use", at = @At("HEAD"), cancellable = true)
    void use(World world, PlayerEntity user, Hand hand, CallbackInfoReturnable<TypedActionResult<ItemStack>> cir){
        NbtCompound tag = user.getStackInHand(hand).getSubNbt("HarvestScytheProperties");
        if (tag != null) {
            int radius = tag.getInt("HarvestRadius");
            int miningLevel = tag.getInt("MiningLevel");
            cir.setReturnValue(ScytheItem.harvest(radius, miningLevel, world, user, hand));
            cir.cancel();
        }
    }

}
