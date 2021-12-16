/*
package wraith.harvest_scythes.support;

import dev.luxmiyu.luxore.LuxoreToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class LuxoreSupport {

    private LuxoreSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("luxore_scythe", new ScytheTool(LuxoreToolMaterial.INSTANCE, ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("luxore_machete", new MacheteItem(LuxoreToolMaterial.INSTANCE, ItemRegistry.getMacheteSettings()));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("luxore_scythe", new ShapedRecipeMaterials(new Identifier("luxore", "luxore_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("luxore_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("luxore_machete", new ShapedRecipeMaterials(new Identifier("luxore", "luxore_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("luxore_machete")));
    }

}
 */