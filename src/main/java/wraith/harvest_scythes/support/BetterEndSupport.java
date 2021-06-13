/*
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
        ItemRegistry.ITEMS.put("terminite_scythe", new ScytheTool(EndToolMaterial.TERMINITE, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("aeternium_scythe", new ScytheTool(EndToolMaterial.AETERNIUM, new Item.Settings().group(ItemGroup.SCYTHES)));

        ItemRegistry.ITEMS.put("terminite_machete", new MacheteItem(EndToolMaterial.TERMINITE, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("aeternium_machete", new MacheteItem(EndToolMaterial.AETERNIUM, new Item.Settings().group(ItemGroup.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("terminite_scythe", new ShapedRecipeMaterials(new Identifier("betterend", "terminite_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("terminite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("aeternium_scythe", new ShapedRecipeMaterials(new Identifier("betterend", "aeternium_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("aeternium_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("terminite_machete", new ShapedRecipeMaterials(new Identifier("betterend", "terminite_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("terminite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("aeternium_machete", new ShapedRecipeMaterials(new Identifier("betterend", "aeternium_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("aeternium_machete")));
    }

}
*/