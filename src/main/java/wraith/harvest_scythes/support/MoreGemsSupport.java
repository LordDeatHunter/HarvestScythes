package wraith.harvest_scythes.support;

import com.kwpugh.more_gems.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class MoreGemsSupport {

    private MoreGemsSupport() {}

    public static void loadItems() {

        ItemRegistry.ITEMS.put("alexandrite_scythe", new ScytheTool(ItemInit.ALEXANDRITE_TOOL_MATERIAL, 2, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("amethyst_scythe", new ScytheTool(ItemInit.AMETHYST_TOOL_MATERIAL, 2, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("carbonado_scythe", new ScytheTool(ItemInit.CARBONADO_TOOL_MATERIAL, 3, -2.75f, 3, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("citrine_scythe", new ScytheTool(ItemInit.CITRINE_TOOL_MATERIAL, 2, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("corundum_scythe", new ScytheTool(ItemInit.CORUNDUM_TOOL_MATERIAL, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("emerald_scythe", new ScytheTool(ItemInit.EMERALD_TOOL_MATERIAL, 2, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("ruby_scythe", new ScytheTool(ItemInit.RUBY_TOOL_MATERIAL, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("sapphire_scythe", new ScytheTool(ItemInit.SAPPHIRE_TOOL_MATERIAL, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("topaz_scythe", new ScytheTool(ItemInit.TOPAZ_TOOL_MATERIAL, 2, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("tourmaline_scythe", new ScytheTool(ItemInit.TOURMALINE_TOOL_MATERIAL, 2, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("alexandrite_scythe", new ShapedRecipeMaterials(new Identifier("c", "alexandrite"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("alexandrite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("amethyst_scythe", new ShapedRecipeMaterials(new Identifier("c", "amethyst"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("amethyst_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("carbonado_scythe", new ShapedRecipeMaterials(new Identifier("c", "carbonado"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("carbonado_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("citrine_scythe", new ShapedRecipeMaterials(new Identifier("c", "citrine"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("citrine_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("corundum_scythe", new ShapedRecipeMaterials(new Identifier("c", "corundum"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("corundum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("emerald_scythe", new ShapedRecipeMaterials(new Identifier("emerald"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("emerald_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("ruby_scythe", new ShapedRecipeMaterials(new Identifier("c", "rubies"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("ruby_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("sapphire_scythe", new ShapedRecipeMaterials(new Identifier("c", "sapphire"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("sapphire_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("topaz_scythe", new ShapedRecipeMaterials(new Identifier("c", "topaz"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("topaz_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("tourmaline_scythe", new ShapedRecipeMaterials(new Identifier("c", "tourmaline"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("tourmaline_scythe")));
    }

}
