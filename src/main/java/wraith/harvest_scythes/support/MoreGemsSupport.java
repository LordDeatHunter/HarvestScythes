package wraith.harvest_scythes.support;

import com.kwpugh.more_gems.init.ItemInit;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class MoreGemsSupport {

    private MoreGemsSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("alexandrite_scythe", new ScytheItem(ItemInit.ALEXANDRITE_TOOL_MATERIAL, ItemRegistry.SCYTHE_SETTINGS));
        ItemRegistry.registerItem("kunzite_scythe", new ScytheItem(ItemInit.KUNZITE_TOOL_MATERIAL, ItemRegistry.SCYTHE_SETTINGS));
        ItemRegistry.registerItem("carbonado_scythe", new ScytheItem(ItemInit.CARBONADO_TOOL_MATERIAL, ItemRegistry.SCYTHE_SETTINGS));
        ItemRegistry.registerItem("citrine_scythe", new ScytheItem(ItemInit.CITRINE_TOOL_MATERIAL, ItemRegistry.SCYTHE_SETTINGS));
        ItemRegistry.registerItem("corundum_scythe", new ScytheItem(ItemInit.CORUNDUM_TOOL_MATERIAL, ItemRegistry.SCYTHE_SETTINGS));
        ItemRegistry.registerItem("moissanite_scythe", new ScytheItem(ItemInit.MOISSANITE_TOOL_MATERIAL, ItemRegistry.SCYTHE_SETTINGS));
        ItemRegistry.registerItem("spinel_scythe", new ScytheItem(ItemInit.SPINEL_TOOL_MATERIAL, ItemRegistry.SCYTHE_SETTINGS));
        ItemRegistry.registerItem("sapphire_scythe", new ScytheItem(ItemInit.SAPPHIRE_TOOL_MATERIAL, ItemRegistry.SCYTHE_SETTINGS));
        ItemRegistry.registerItem("topaz_scythe", new ScytheItem(ItemInit.TOPAZ_TOOL_MATERIAL, ItemRegistry.SCYTHE_SETTINGS));
        ItemRegistry.registerItem("tourmaline_scythe", new ScytheItem(ItemInit.TOURMALINE_TOOL_MATERIAL, ItemRegistry.SCYTHE_SETTINGS));

        ItemRegistry.registerItem("alexandrite_machete", new MacheteItem(ItemInit.ALEXANDRITE_TOOL_MATERIAL, ItemRegistry.MACHETE_SETTINGS));
        ItemRegistry.registerItem("kunzite_machete", new MacheteItem(ItemInit.KUNZITE_TOOL_MATERIAL, ItemRegistry.MACHETE_SETTINGS));
        ItemRegistry.registerItem("carbonado_machete", new MacheteItem(ItemInit.CARBONADO_TOOL_MATERIAL, ItemRegistry.MACHETE_SETTINGS));
        ItemRegistry.registerItem("citrine_machete", new MacheteItem(ItemInit.CITRINE_TOOL_MATERIAL, ItemRegistry.MACHETE_SETTINGS));
        ItemRegistry.registerItem("corundum_machete", new MacheteItem(ItemInit.CORUNDUM_TOOL_MATERIAL, ItemRegistry.MACHETE_SETTINGS));
        ItemRegistry.registerItem("moissanite_machete", new MacheteItem(ItemInit.MOISSANITE_TOOL_MATERIAL, ItemRegistry.MACHETE_SETTINGS));
        ItemRegistry.registerItem("spinel_machete", new MacheteItem(ItemInit.SPINEL_TOOL_MATERIAL, ItemRegistry.MACHETE_SETTINGS));
        ItemRegistry.registerItem("sapphire_machete", new MacheteItem(ItemInit.SAPPHIRE_TOOL_MATERIAL, ItemRegistry.MACHETE_SETTINGS));
        ItemRegistry.registerItem("topaz_machete", new MacheteItem(ItemInit.TOPAZ_TOOL_MATERIAL, ItemRegistry.MACHETE_SETTINGS));
        ItemRegistry.registerItem("tourmaline_machete", new MacheteItem(ItemInit.TOURMALINE_TOOL_MATERIAL, ItemRegistry.MACHETE_SETTINGS));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("alexandrite_scythe", new ShapedRecipeMaterials(new Identifier("c", "alexandrite"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("alexandrite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("kunzite_scythe", new ShapedRecipeMaterials(new Identifier("c", "kunzite"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("kunzite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("carbonado_scythe", new ShapedRecipeMaterials(new Identifier("c", "carbonado"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("carbonado_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("citrine_scythe", new ShapedRecipeMaterials(new Identifier("c", "citrine"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("citrine_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("corundum_scythe", new ShapedRecipeMaterials(new Identifier("c", "corundum"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("corundum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("moissanite_scythe", new ShapedRecipeMaterials(new Identifier("c", "moissanite"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("moissanite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("spinel_scythe", new ShapedRecipeMaterials(new Identifier("c", "rubies"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("spinel_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("sapphire_scythe", new ShapedRecipeMaterials(new Identifier("c", "sapphire"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("sapphire_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("topaz_scythe", new ShapedRecipeMaterials(new Identifier("c", "topaz"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("topaz_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("tourmaline_scythe", new ShapedRecipeMaterials(new Identifier("c", "tourmaline"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("tourmaline_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("alexandrite_machete", new ShapedRecipeMaterials(new Identifier("c", "alexandrite"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("alexandrite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("kunzite_machete", new ShapedRecipeMaterials(new Identifier("c", "kunzite"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("kunzite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("carbonado_machete", new ShapedRecipeMaterials(new Identifier("c", "carbonado"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("carbonado_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("citrine_machete", new ShapedRecipeMaterials(new Identifier("c", "citrine"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("citrine_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("corundum_machete", new ShapedRecipeMaterials(new Identifier("c", "corundum"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("corundum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("moissanite_machete", new ShapedRecipeMaterials(new Identifier("c", "moissanite"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("moissanite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("spinel_machete", new ShapedRecipeMaterials(new Identifier("c", "rubies"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("spinel_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("sapphire_machete", new ShapedRecipeMaterials(new Identifier("c", "sapphire"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("sapphire_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("topaz_machete", new ShapedRecipeMaterials(new Identifier("c", "topaz"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("topaz_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("tourmaline_machete", new ShapedRecipeMaterials(new Identifier("c", "tourmaline"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("tourmaline_machete")));
    }

}
