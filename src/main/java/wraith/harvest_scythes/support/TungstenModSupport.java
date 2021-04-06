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
        ItemRegistry.ITEMS.put("tungsten_scythe", new ScytheTool(TungstenToolMaterial.INSTANCE, 6, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("tungsten_scythe", new ShapedRecipeMaterials(new Identifier("tungstenmod", "tungsten_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("tungsten_scythe")));
    }

}
