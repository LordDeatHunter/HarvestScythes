package wraith.harvest_scythes.support;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import paulevs.betternether.items.materials.BNItemMaterials;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class BetterNetherSupport {

    private BetterNetherSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("nether_ruby_scythe", new ScytheTool(BNItemMaterials.NETHER_RUBY_TOOLS, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("cincinnasite_scythe", new ScytheTool(BNItemMaterials.CINCINNASITE_TOOLS, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("cincinnasite_scythe_diamond", new ScytheTool(BNItemMaterials.CINCINNASITE_DIAMOND_TOOLS, new Item.Settings().group(ItemGroup.SCYTHES)));

        ItemRegistry.ITEMS.put("nether_ruby_machete", new MacheteItem(BNItemMaterials.NETHER_RUBY_TOOLS, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("cincinnasite_machete", new MacheteItem(BNItemMaterials.CINCINNASITE_TOOLS, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("cincinnasite_machete_diamond", new MacheteItem(BNItemMaterials.CINCINNASITE_DIAMOND_TOOLS, new Item.Settings().group(ItemGroup.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("nether_ruby_scythe", new ShapedRecipeMaterials(new Identifier("betternether", "nether_ruby"), new Identifier("betternether", "nether_reed"), "item", "item", Utils.ID("nether_ruby_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("cincinnasite_scythe", new ShapedRecipeMaterials(new Identifier("betternether", "cincinnasite_ingot"), new Identifier("betternether", "nether_reed"), "item", "item", Utils.ID("cincinnasite_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("nether_ruby_machete", new ShapedRecipeMaterials(new Identifier("betternether", "nether_ruby"), new Identifier("betternether", "nether_reed"), "item", "item", Utils.ID("nether_ruby_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("cincinnasite_machete", new ShapedRecipeMaterials(new Identifier("betternether", "cincinnasite_ingot"), new Identifier("betternether", "nether_reed"), "item", "item", Utils.ID("cincinnasite_machete")));
    }

}
