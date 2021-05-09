package wraith.harvest_scythes.support;

import amymialee.tungstenmod.equipment.TungstenToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class TungstenModSupport {

    private TungstenModSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("tungsten_scythe", new ScytheTool(TungstenToolMaterial.INSTANCE, new Item.Settings().group(ItemGroup.SCYTHES)));

        ItemRegistry.ITEMS.put("tungsten_machete", new MacheteItem(TungstenToolMaterial.INSTANCE, new Item.Settings().group(ItemGroup.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("tm_tungsten_scythe", new ShapedRecipeMaterials(new Identifier("tungstenmod", "tungsten_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("tungsten_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("tm_tungsten_machete", new ShapedRecipeMaterials(new Identifier("tungstenmod", "tungsten_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("tungsten_machete")));
    }

}
