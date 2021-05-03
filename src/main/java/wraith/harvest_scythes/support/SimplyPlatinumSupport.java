package wraith.harvest_scythes.support;

import com.github.theintfox.tools.PlatinumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class SimplyPlatinumSupport {

    private SimplyPlatinumSupport() {}

    public static void loadItems() {
        PlatinumToolMaterial material = new PlatinumToolMaterial();
        ItemRegistry.ITEMS.put("platinum_scythe", new ScytheTool(material, new Item.Settings().group(ItemGroup.SCYTHES)));

        ItemRegistry.ITEMS.put("platinum_machete", new MacheteItem(material, new Item.Settings().group(ItemGroup.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("platinum_scythe", new ShapedRecipeMaterials(new Identifier("simplyplatinum", "platinum_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("tungsten_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("platinum_machete", new ShapedRecipeMaterials(new Identifier("simplyplatinum", "platinum_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("platinum_machete")));
    }

}
