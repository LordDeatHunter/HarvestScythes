package wraith.harvest_scythes.support;

import jayceecreates.earlygame.item.CopperToolBase;
import jayceecreates.earlygame.item.FlintToolBase;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class EarlyGameSupport {

    private EarlyGameSupport(){}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("flint_scythe", new ScytheTool(new FlintToolBase(), new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("copper_scythe", new ScytheTool(new CopperToolBase(), new Item.Settings().group(ItemGroup.SCYTHES)));

        ItemRegistry.ITEMS.put("flint_machete", new MacheteItem(new FlintToolBase(), new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("copper_machete", new MacheteItem(new CopperToolBase(), new Item.Settings().group(ItemGroup.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("copper_scythe", new ShapedRecipeMaterials(new Identifier("c", "copper_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("copper_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("copper_machete", new ShapedRecipeMaterials(new Identifier("c", "copper_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("copper_machete")));
    }

}
