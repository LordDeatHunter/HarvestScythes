package wraith.harvest_scythes.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import wraith.harvest_scythes.HarvestScythes;

@Mixin(MinecraftClient.class)
public class ClientMixin {

    @Inject(method = "<init>", at = @At(target = "Ljava/lang/Thread;currentThread()Ljava/lang/Thread;", value = "INVOKE_ASSIGN"))
    public void inject(RunArgs args, CallbackInfo ci) {
        HarvestScythes.load();
    }

}
