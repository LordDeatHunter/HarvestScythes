package wraith.harvest_scythes.support;

import com.kwpugh.gobber2.init.ItemInit;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;
import wraith.harvest_scythes.registry.ItemRegistry;
import wraith.harvest_scythes.util.HSUtils;

public final class GobberSupport {

    private GobberSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("gobber2_scythe", new ScytheItem(ItemInit.GOBBER_TOOL_MATERIAL, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("gobber2_scythe_nether", new ScytheItem(ItemInit.GOBBER_NETHER_TOOL_MATERIAL, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("gobber2_scythe_end", new ScytheItem(ItemInit.GOBBER_END_TOOL_MATERIAL, ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("gobber2_machete", new MacheteItem(ItemInit.GOBBER_TOOL_MATERIAL, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("gobber2_machete_nether", new MacheteItem(ItemInit.GOBBER_NETHER_TOOL_MATERIAL, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("gobber2_machete_end", new MacheteItem(ItemInit.GOBBER_END_TOOL_MATERIAL, ItemRegistry.getMacheteSettings()));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("gobber2_scythe", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot"), new Identifier("gobber2", "gobber2_rod"), "item", "item", HSUtils.ID("gobber2_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("gobber2_scythe_nether", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot_nether"), new Identifier("gobber2", "gobber2_rod_nether"), "item", "item", HSUtils.ID("gobber2_scythe_nether")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("gobber2_scythe_end", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot_end"), new Identifier("gobber2", "gobber2_rod_end"), "item", "item", HSUtils.ID("gobber2_scythe_end")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("gobber2_machete", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot"), new Identifier("gobber2", "gobber2_rod"), "item", "item", HSUtils.ID("gobber2_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("gobber2_machete_nether", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot_nether"), new Identifier("gobber2", "gobber2_rod_nether"), "item", "item", HSUtils.ID("gobber2_machete_nether")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("gobber2_machete_end", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot_end"), new Identifier("gobber2", "gobber2_rod_end"), "item", "item", HSUtils.ID("gobber2_machete_end")));
    }

}
