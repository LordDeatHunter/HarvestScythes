/*
package wraith.harvest_scythes.support;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import nourl.mythicmetals.tools.ToolMaterials;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public final class MythicMetalsSupport {

    private MythicMetalsSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("adamantite_scythe", new ScytheTool(ToolMaterials.ADAMANTITE, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("aquarium_scythe", new ScytheTool(ToolMaterials.AQUARIUM, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("banglum_scythe", new ScytheTool(ToolMaterials.BANGLUM, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("bronze_scythe", new ScytheTool(ToolMaterials.BRONZE, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("carmot_scythe", new ScytheTool(ToolMaterials.CARMOT, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("celestium_scythe", new ScytheTool(ToolMaterials.CELESTIUM, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("copper_scythe", new ScytheTool(ToolMaterials.COPPER, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("durasteel_scythe", new ScytheTool(ToolMaterials.DURASTEEL, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("hallowed_scythe", new ScytheTool(ToolMaterials.HALLOWED, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("kyber_scythe", new ScytheTool(ToolMaterials.KYBER, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("metallurgium_scythe", new ScytheTool(ToolMaterials.METALLURGIUM, new FabricItemSettings().group(HSItemGroups.SCYTHES).fireproof()));
        ItemRegistry.registerItem("mythril_scythe", new ScytheTool(ToolMaterials.MYTHRIL, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("orichalcum_scythe", new ScytheTool(ToolMaterials.ORICHALCUM, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("osmium_scythe", new ScytheTool(ToolMaterials.OSMIUM, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("palladium_scythe", new ScytheTool(ToolMaterials.PALLADIUM, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("prometheum_scythe", new ScytheTool(ToolMaterials.PROMETHEUM, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("quadrillum_scythe", new ScytheTool(ToolMaterials.QUADRILLUM, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("runite_scythe", new ScytheTool(ToolMaterials.RUNITE, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("star_platinum_scythe", new ScytheTool(ToolMaterials.STAR_PLATINUM, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("steel_scythe", new ScytheTool(ToolMaterials.STEEL, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("stormyx_scythe", new ScytheTool(ToolMaterials.STORMYX, new FabricItemSettings().group(HSItemGroups.SCYTHES)));

        ItemRegistry.registerItem("adamantite_machete", new MacheteItem(ToolMaterials.ADAMANTITE, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("aquarium_machete", new MacheteItem(ToolMaterials.AQUARIUM, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("banglum_machete", new MacheteItem(ToolMaterials.BANGLUM, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("bronze_machete", new MacheteItem(ToolMaterials.BRONZE, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("carmot_machete", new MacheteItem(ToolMaterials.CARMOT, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("celestium_machete", new MacheteItem(ToolMaterials.CELESTIUM, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("copper_machete", new MacheteItem(ToolMaterials.COPPER, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("durasteel_machete", new MacheteItem(ToolMaterials.DURASTEEL, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("hallowed_machete", new MacheteItem(ToolMaterials.HALLOWED, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("kyber_machete", new MacheteItem(ToolMaterials.KYBER, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("metallurgium_machete", new MacheteItem(ToolMaterials.METALLURGIUM, new FabricItemSettings().group(HSItemGroups.MACHETES).fireproof()));
        ItemRegistry.registerItem("mythril_machete", new MacheteItem(ToolMaterials.MYTHRIL, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("orichalcum_machete", new MacheteItem(ToolMaterials.ORICHALCUM, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("osmium_machete", new MacheteItem(ToolMaterials.OSMIUM, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("palladium_machete", new MacheteItem(ToolMaterials.PALLADIUM, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("prometheum_machete", new MacheteItem(ToolMaterials.PROMETHEUM, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("quadrillum_machete", new MacheteItem(ToolMaterials.QUADRILLUM, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("runite_machete", new MacheteItem(ToolMaterials.RUNITE, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("star_platinum_machete", new MacheteItem(ToolMaterials.STAR_PLATINUM, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("steel_machete", new MacheteItem(ToolMaterials.STEEL, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("stormyx_machete", new MacheteItem(ToolMaterials.STORMYX, new FabricItemSettings().group(HSItemGroups.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("adamantite_scythe", new ShapedRecipeMaterials(new Identifier("c", "adamantite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("adamantite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("aquarium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "aquarium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("aquarium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("banglum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "banglum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("banglum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("bronze_scythe", new ShapedRecipeMaterials(new Identifier("c", "bronze_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("bronze_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("carmot_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "carmot_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("carmot_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("celestium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "celestium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("celestium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("copper_scythe", new ShapedRecipeMaterials(new Identifier("c", "copper_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("copper_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("durasteel_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "durasteel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("durasteel_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("hallowed_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "hallowed_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("hallowed_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("kyber_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "kyber_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("kyber_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("metallurgium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "metallurgium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("metallurgium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("mythril_scythe", new ShapedRecipeMaterials(new Identifier("c", "mythril_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("mythril_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("orichalcum_scythe", new ShapedRecipeMaterials(new Identifier("c", "orichalcum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("orichalcum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("osmium_scythe", new ShapedRecipeMaterials(new Identifier("c", "osmium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("osmium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("palladium_scythe", new ShapedRecipeMaterials(new Identifier("c", "palladium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("palladium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("prometheum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "prometheum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("prometheum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("quadrillum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "quadrillum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("quadrillum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("runite_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "runite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("runite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("star_platinum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "star_platinum"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("star_platinum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("steel_scythe", new ShapedRecipeMaterials(new Identifier("c", "steel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("steel_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("stormyx_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "stormyx_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("stormyx_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("adamantite_machete", new ShapedRecipeMaterials(new Identifier("c", "adamantite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("adamantite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("aquarium_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "aquarium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("aquarium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("banglum_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "banglum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("banglum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("bronze_machete", new ShapedRecipeMaterials(new Identifier("c", "bronze_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("bronze_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("carmot_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "carmot_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("carmot_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("celestium_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "celestium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("celestium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("copper_machete", new ShapedRecipeMaterials(new Identifier("c", "copper_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("copper_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("durasteel_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "durasteel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("durasteel_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("hallowed_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "hallowed_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("hallowed_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("kyber_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "kyber_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("kyber_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("metallurgium_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "metallurgium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("metallurgium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("mythril_machete", new ShapedRecipeMaterials(new Identifier("c", "mythril_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("mythril_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("orichalcum_machete", new ShapedRecipeMaterials(new Identifier("c", "orichalcum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("orichalcum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("osmium_machete", new ShapedRecipeMaterials(new Identifier("c", "osmium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("osmium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("palladium_machete", new ShapedRecipeMaterials(new Identifier("c", "palladium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("palladium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("prometheum_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "prometheum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("prometheum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("quadrillum_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "quadrillum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("quadrillum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("runite_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "runite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("runite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("star_platinum_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "star_platinum"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("star_platinum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("steel_machete", new ShapedRecipeMaterials(new Identifier("c", "steel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("steel_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("stormyx_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "stormyx_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("stormyx_machete")));
    }

}
 */