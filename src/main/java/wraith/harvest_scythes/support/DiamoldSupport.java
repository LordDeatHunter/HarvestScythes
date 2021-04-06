package wraith.harvest_scythes.support;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import pl.vemu.diamold.material.DiamoldMaterial;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class DiamoldSupport {

    private DiamoldSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("diamold_scythe", new ScytheTool(DiamoldMaterial.INSTANCE, 3, -2.75f, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("diamold_scythe", new ShapedRecipeMaterials(new Identifier("diamold", "diamold_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("diamold_scythe")));
    }

}
