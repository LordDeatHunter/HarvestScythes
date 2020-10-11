package wraith.harvest_scythes.mixin;

import com.google.gson.JsonSyntaxException;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Map;

@Mixin(RecipeManager.class)
public abstract class RecipeManagerMixin {

    @Shadow @Final private static Logger LOGGER;

    @Shadow private Map<RecipeType<?>, Map<Identifier, Recipe<?>>> recipes;

    @Shadow private boolean errored;

    @ModifyVariable(method = "apply", at = @At("INVOKE_ASSIGN"))
    public void apply(Recipe<?> recipe) {
        String string = JsonHelper.getString(json, "type");
        return ((RecipeSerializer) Registry.RECIPE_SERIALIZER.getOrEmpty(new Identifier(string)).orElseThrow(() -> {
            return new JsonSyntaxException("Invalid or unsupported recipe type '" + string + "'");
        })).read(id, json);
    }

}
