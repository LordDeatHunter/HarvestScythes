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
        ItemRegistry.ITEMS.put("alexandrite_scythe", new ScytheTool(ItemInit.ALEXANDRITE_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("amethyst_scythe", new ScytheTool(ItemInit.AMETHYST_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("carbonado_scythe", new ScytheTool(ItemInit.CARBONADO_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("citrine_scythe", new ScytheTool(ItemInit.CITRINE_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("corundum_scythe", new ScytheTool(ItemInit.CORUNDUM_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("emerald_scythe", new ScytheTool(ItemInit.EMERALD_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("ruby_scythe", new ScytheTool(ItemInit.RUBY_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("sapphire_scythe", new ScytheTool(ItemInit.SAPPHIRE_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("topaz_scythe", new ScytheTool(ItemInit.TOPAZ_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("tourmaline_scythe", new ScytheTool(ItemInit.TOURMALINE_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.SCYTHES)));

        ItemRegistry.ITEMS.put("alexandrite_machete", new MacheteItem(ItemInit.ALEXANDRITE_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("amethyst_machete", new MacheteItem(ItemInit.AMETHYST_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("carbonado_machete", new MacheteItem(ItemInit.CARBONADO_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("citrine_machete", new MacheteItem(ItemInit.CITRINE_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("corundum_machete", new MacheteItem(ItemInit.CORUNDUM_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("emerald_machete", new MacheteItem(ItemInit.EMERALD_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("ruby_machete", new MacheteItem(ItemInit.RUBY_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("sapphire_machete", new MacheteItem(ItemInit.SAPPHIRE_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("topaz_machete", new MacheteItem(ItemInit.TOPAZ_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("tourmaline_machete", new MacheteItem(ItemInit.TOURMALINE_TOOL_MATERIAL, new Item.Settings().group(ItemGroup.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("alexandrite_scythe", new ShapedRecipeMaterials(new Identifier("c", "alexandrite"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("alexandrite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("amethyst_scythe", new ShapedRecipeMaterials(new Identifier("c", "amethyst"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("amethyst_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("carbonado_scythe", new ShapedRecipeMaterials(new Identifier("c", "carbonado"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("carbonado_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("citrine_scythe", new ShapedRecipeMaterials(new Identifier("c", "citrine"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("citrine_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("corundum_scythe", new ShapedRecipeMaterials(new Identifier("c", "corundum"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("corundum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("emerald_scythe", new ShapedRecipeMaterials(new Identifier("emerald"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("emerald_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("ruby_scythe", new ShapedRecipeMaterials(new Identifier("c", "rubies"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("ruby_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("sapphire_scythe", new ShapedRecipeMaterials(new Identifier("c", "sapphire"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("sapphire_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("topaz_scythe", new ShapedRecipeMaterials(new Identifier("c", "topaz"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("topaz_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("tourmaline_scythe", new ShapedRecipeMaterials(new Identifier("c", "tourmaline"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("tourmaline_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("alexandrite_machete", new ShapedRecipeMaterials(new Identifier("c", "alexandrite"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("alexandrite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("amethyst_machete", new ShapedRecipeMaterials(new Identifier("c", "amethyst"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("amethyst_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("carbonado_machete", new ShapedRecipeMaterials(new Identifier("c", "carbonado"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("carbonado_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("citrine_machete", new ShapedRecipeMaterials(new Identifier("c", "citrine"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("citrine_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("corundum_machete", new ShapedRecipeMaterials(new Identifier("c", "corundum"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("corundum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("emerald_machete", new ShapedRecipeMaterials(new Identifier("emerald"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("emerald_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("ruby_machete", new ShapedRecipeMaterials(new Identifier("c", "rubies"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("ruby_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("sapphire_machete", new ShapedRecipeMaterials(new Identifier("c", "sapphire"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("sapphire_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("topaz_machete", new ShapedRecipeMaterials(new Identifier("c", "topaz"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("topaz_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("tourmaline_machete", new ShapedRecipeMaterials(new Identifier("c", "tourmaline"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("tourmaline_machete")));
    }

}
