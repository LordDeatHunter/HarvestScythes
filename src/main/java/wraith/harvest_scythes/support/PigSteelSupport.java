package wraith.harvest_scythes.support;

import net.minecraft.util.Identifier;
import wraith.harvest_scythes.HarvestScythes;
import wraith.harvest_scythes.Utils;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class PigSteelSupport {

    private PigSteelSupport() {}

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("iron_scythe", new ShapedRecipeMaterials(new Identifier("pigsteel", "pigsteel_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("iron_scythe")));
    }

}
