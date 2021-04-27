package wraith.harvest_scythes.support;

import com.kwpugh.gobber2.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class GobberSupport {

    private GobberSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("gobber2_scythe", new ScytheTool(ItemInit.GOBBER_TOOL_MATERIAL, 3, -2.75f, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("gobber2_scythe_nether", new ScytheTool(ItemInit.GOBBER_NETHER_TOOL_MATERIAL, 4, -2.75f, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("gobber2_scythe_end", new ScytheTool(ItemInit.GOBBER_END_TOOL_MATERIAL, 5, -2.75f, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("gobber2_scythe", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot"), new Identifier("gobber2", "gobber2_rod"), "item", "item", Utils.ID("gobber2_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("gobber2_scythe_nether", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot_nether"), new Identifier("gobber2", "gobber2_rod_nether"), "item", "item", Utils.ID("gobber2_scythe_nether")));
        RecipesGenerator.SHAPED_RECIPES.put("gobber2_scythe_end", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot_end"), new Identifier("gobber2", "gobber2_rod_end"), "item", "item", Utils.ID("gobber2_scythe_end")));
    }

}
