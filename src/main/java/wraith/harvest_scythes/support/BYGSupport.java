package wraith.harvest_scythes.support;

import corgiaoc.byg.common.properties.items.itemtiers.BYGItemTiers;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.HarvestScythes;
import wraith.harvest_scythes.ItemGroup;
import wraith.harvest_scythes.ItemRegistry;
import wraith.harvest_scythes.ScytheTool;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;

public class BYGSupport {

    private BYGSupport() {}

    public static int loadItems() {
        ItemRegistry.ITEMS.put("pendorite_scythe", new ScytheTool(BYGItemTiers.PENDORITE, 5, -2.75f, 4, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        return 1;
    }

    public static void loadRecipes() {
        RecipesGenerator.SMITHING_RECIPES.put("pendorite_scythe", new SmithingRecipeMaterials(new Identifier(HarvestScythes.MOD_ID, "netherite_scythe"), new Identifier("byg", "pendorite_scraps"), "item", "item", new Identifier(HarvestScythes.MOD_ID, "pendorite_scythe")));
    }

}
