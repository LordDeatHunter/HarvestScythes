package wraith.harvest_scythes.support;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import paulevs.betternether.items.materials.BNItemMaterials;
import wraith.harvest_scythes.HarvestScythes;
import wraith.harvest_scythes.ItemGroup;
import wraith.harvest_scythes.ItemRegistry;
import wraith.harvest_scythes.ScytheTool;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class BetterNetherSupport {

    private BetterNetherSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("nether_ruby_scythe", new ScytheTool(BNItemMaterials.NETHER_RUBY_TOOLS, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("cincinnasite_scythe", new ScytheTool(BNItemMaterials.CINCINNASITE_TOOLS, 2, -2.75f, 3, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("cincinnasite_scythe_diamond", new ScytheTool(BNItemMaterials.CINCINNASITE_DIAMOND_TOOLS, 3, -2.75f, 3, true, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("nether_ruby_scythe", new ShapedRecipeMaterials(new Identifier("betternether", "nether_ruby"), new Identifier("betternether", "nether_reed"), "item", "item", new Identifier(HarvestScythes.MOD_ID, "nether_ruby_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("cincinnasite_scythe", new ShapedRecipeMaterials(new Identifier("betternether", "cincinnasite_ingot"), new Identifier("betternether", "nether_reed"), "item", "item", new Identifier(HarvestScythes.MOD_ID, "cincinnasite_scythe")));
    }

}
