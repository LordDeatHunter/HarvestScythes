package wraith.harvest_scythes.mixin;

import net.minecraft.server.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import wraith.harvest_scythes.HarvestScythes;

@Mixin(Main.class)
public class ServerMixin {

    @Inject(method = "main", at = @At(target = "Lnet/minecraft/util/registry/DynamicRegistryManager;create()Lnet/minecraft/util/registry/DynamicRegistryManager$Impl;", value = "INVOKE_ASSIGN"))
    private static void inject(String[] args, CallbackInfo ci) {
        HarvestScythes.load();
    }

}
