package wraith.harvest_scythes.support;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import ru.betterend.item.material.EndToolMaterial;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class BetterEndSupport {

    private BetterEndSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("terminite_scythe", new ScytheTool(EndToolMaterial.TERMINITE, 3, -2.75f, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("aeternium_scythe", new ScytheTool(EndToolMaterial.AETERNIUM, 5, -2.75f, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("terminite_scythe", new ShapedRecipeMaterials(new Identifier("betterend", "terminite_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("terminite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("aeternium_scythe", new ShapedRecipeMaterials(new Identifier("betterend", "aeternium_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("aeternium_scythe")));
    }

}
