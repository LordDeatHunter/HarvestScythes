package wraith.harvest_scythes.support;

import corgiaoc.byg.common.properties.items.itemtiers.BYGItemTiers;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;

public class BYGSupport {

    private BYGSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("pendorite_scythe", new ScytheTool(BYGItemTiers.PENDORITE, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SMITHING_RECIPES.put("pendorite_scythe", new SmithingRecipeMaterials(Utils.ID("netherite_scythe"), new Identifier("byg", "pendorite_scraps"), "item", "item", Utils.ID("pendorite_scythe")));
    }

}
