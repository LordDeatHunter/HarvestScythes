package wraith.harvest_scythes.support;

import dev.luxmiyu.mc.luxore.luxore.LuxoreToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class LuxoreSupport {

    private LuxoreSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("luxore_scythe", new ScytheTool(LuxoreToolMaterial.INSTANCE, 2, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("luxore_scythe", new ShapedRecipeMaterials(new Identifier("luxore", "luxore_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("luxore_scythe")));
    }

}
