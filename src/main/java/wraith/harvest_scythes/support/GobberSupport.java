package wraith.harvest_scythes.support;

import com.kwpugh.gobber2.init.ItemInit;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public final class GobberSupport {

    private GobberSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("gobber2_scythe", new ScytheTool(ItemInit.GOBBER_TOOL_MATERIAL, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("gobber2_scythe_nether", new ScytheTool(ItemInit.GOBBER_NETHER_TOOL_MATERIAL, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("gobber2_scythe_end", new ScytheTool(ItemInit.GOBBER_END_TOOL_MATERIAL, new FabricItemSettings().group(HSItemGroups.SCYTHES)));

        ItemRegistry.registerItem("gobber2_machete", new MacheteItem(ItemInit.GOBBER_TOOL_MATERIAL, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("gobber2_machete_nether", new MacheteItem(ItemInit.GOBBER_NETHER_TOOL_MATERIAL, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("gobber2_machete_end", new MacheteItem(ItemInit.GOBBER_END_TOOL_MATERIAL, new FabricItemSettings().group(HSItemGroups.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("gobber2_scythe", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot"), new Identifier("gobber2", "gobber2_rod"), "item", "item", Utils.ID("gobber2_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("gobber2_scythe_nether", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot_nether"), new Identifier("gobber2", "gobber2_rod_nether"), "item", "item", Utils.ID("gobber2_scythe_nether")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("gobber2_scythe_end", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot_end"), new Identifier("gobber2", "gobber2_rod_end"), "item", "item", Utils.ID("gobber2_scythe_end")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("gobber2_machete", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot"), new Identifier("gobber2", "gobber2_rod"), "item", "item", Utils.ID("gobber2_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("gobber2_machete_nether", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot_nether"), new Identifier("gobber2", "gobber2_rod_nether"), "item", "item", Utils.ID("gobber2_machete_nether")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("gobber2_machete_end", new ShapedRecipeMaterials(new Identifier("gobber2", "gobber2_ingot_end"), new Identifier("gobber2", "gobber2_rod_end"), "item", "item", Utils.ID("gobber2_machete_end")));
    }

}
