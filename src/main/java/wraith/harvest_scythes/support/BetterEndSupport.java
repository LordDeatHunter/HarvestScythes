package wraith.harvest_scythes.support;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import ru.betterend.item.EndToolMaterial;
import wraith.harvest_scythes.HarvestScythes;
import wraith.harvest_scythes.ItemGroup;
import wraith.harvest_scythes.ItemRegistry;
import wraith.harvest_scythes.ScytheTool;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class BetterEndSupport {

    public static int loadItems() {
        ItemRegistry.ITEMS.put("terminite_scythe", new ScytheTool(EndToolMaterial.TERMINITE, 3, -2.75f, 3, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("aeternium_scythe", new ScytheTool(EndToolMaterial.AETERNIUM, 3, -2.75f, 4, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        return 2;
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("terminite_scythe", new ShapedRecipeMaterials(new Identifier("betterend", "terminite_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "terminite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("aeternium_scythe", new ShapedRecipeMaterials(new Identifier("betterend", "aeternium_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "aeternium_scythe")));
    }

}
