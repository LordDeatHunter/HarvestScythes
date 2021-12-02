/*
package wraith.harvest_scythes.support;

import jayceecreates.earlygame.item.CopperToolBase;
import jayceecreates.earlygame.item.FlintToolBase;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public final class EarlyGameSupport {

    private EarlyGameSupport(){}

    public static void loadItems() {
        ItemRegistry.registerItem("flint_scythe", new ScytheTool(new FlintToolBase(), ItemRegistry.SCYTHE_SETTINGS));
        ItemRegistry.registerItem("copper_scythe", new ScytheTool(new CopperToolBase(), ItemRegistry.SCYTHE_SETTINGS));

        ItemRegistry.registerItem("flint_machete", new MacheteItem(new FlintToolBase(), ItemRegistry.MACHETE_SETTINGS));
        ItemRegistry.registerItem("copper_machete", new MacheteItem(new CopperToolBase(), ItemRegistry.MACHETE_SETTINGS));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("flint_scythe", new ShapedRecipeMaterials(new Identifier("earlygame", "flint_shard"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("flint_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("copper_scythe", new ShapedRecipeMaterials(new Identifier("c", "copper_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("copper_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("flint_machete", new ShapedRecipeMaterials(new Identifier("earlygame", "flint_shard"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("flint_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("copper_machete", new ShapedRecipeMaterials(new Identifier("c", "copper_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("copper_machete")));
    }

}
 */