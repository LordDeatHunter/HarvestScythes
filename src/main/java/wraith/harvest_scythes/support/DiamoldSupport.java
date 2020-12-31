package wraith.harvest_scythes.support;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import pl.vemu.diamold.material.DiamoldMaterial;
import wraith.harvest_scythes.HarvestScythes;
import wraith.harvest_scythes.ItemGroup;
import wraith.harvest_scythes.ItemRegistry;
import wraith.harvest_scythes.ScytheTool;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class DiamoldSupport {

    private DiamoldSupport() {}

    public static int loadItems() {
        ItemRegistry.ITEMS.put("diamold_scythe", new ScytheTool(DiamoldMaterial.INSTANCE, 3, -2.75f, 3, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        return 1;
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("diamold_scythe", new ShapedRecipeMaterials(new Identifier("diamold", "diamold_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "diamold_scythe")));
    }

}
