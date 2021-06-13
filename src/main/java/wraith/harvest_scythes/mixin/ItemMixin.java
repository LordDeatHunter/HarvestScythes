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
import wraith.harvest_scythes.ScytheTool;

@Mixin(Item.class)
public class ItemMixin {

    @Inject(method = "use", at = @At("HEAD"), cancellable = true)
    void use(World world, PlayerEntity user, Hand hand, CallbackInfoReturnable<TypedActionResult<ItemStack>> cir){
        NbtCompound tag = user.getStackInHand(hand).getSubTag("HarvestScytheProperties");
        if (tag != null) {
            int radius = tag.getInt("HarvestRadius");
            cir.setReturnValue(ScytheTool.harvest(radius, world, user, hand));
            cir.cancel();
        }
    }

}
