package wraith.harvest_scythes.support;

import net.minecraft.util.Identifier;
import nourl.mythicmetals.tools.ToolMaterials;
import wraith.harvest_scythes.HarvestScythes;
import wraith.harvest_scythes.util.HSUtils;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class MythicMetalsSupport {

    private MythicMetalsSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("adamantite_scythe", new ScytheItem(ToolMaterials.ADAMANTITE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("aquarium_scythe", new ScytheItem(ToolMaterials.AQUARIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("banglum_scythe", new ScytheItem(ToolMaterials.BANGLUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("bronze_scythe", new ScytheItem(ToolMaterials.BRONZE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("carmot_scythe", new ScytheItem(ToolMaterials.CARMOT, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("celestium_scythe", new ScytheItem(ToolMaterials.CELESTIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("copper_scythe", new ScytheItem(ToolMaterials.COPPER, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("durasteel_scythe", new ScytheItem(ToolMaterials.DURASTEEL, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("hallowed_scythe", new ScytheItem(ToolMaterials.HALLOWED, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("kyber_scythe", new ScytheItem(ToolMaterials.KYBER, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("metallurgium_scythe", new ScytheItem(ToolMaterials.METALLURGIUM, ItemRegistry.getScytheSettings().fireproof()));
        ItemRegistry.registerItem("mythril_scythe", new ScytheItem(ToolMaterials.MYTHRIL, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("orichalcum_scythe", new ScytheItem(ToolMaterials.ORICHALCUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("osmium_scythe", new ScytheItem(ToolMaterials.OSMIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("palladium_scythe", new ScytheItem(ToolMaterials.PALLADIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("prometheum_scythe", new ScytheItem(ToolMaterials.PROMETHEUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("quadrillum_scythe", new ScytheItem(ToolMaterials.QUADRILLUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("runite_scythe", new ScytheItem(ToolMaterials.RUNITE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("star_platinum_scythe", new ScytheItem(ToolMaterials.STAR_PLATINUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("steel_scythe", new ScytheItem(ToolMaterials.STEEL, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("stormyx_scythe", new ScytheItem(ToolMaterials.STORMYX, ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("adamantite_machete", new MacheteItem(ToolMaterials.ADAMANTITE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("aquarium_machete", new MacheteItem(ToolMaterials.AQUARIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("banglum_machete", new MacheteItem(ToolMaterials.BANGLUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("bronze_machete", new MacheteItem(ToolMaterials.BRONZE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("carmot_machete", new MacheteItem(ToolMaterials.CARMOT, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("celestium_machete", new MacheteItem(ToolMaterials.CELESTIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("copper_machete", new MacheteItem(ToolMaterials.COPPER, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("durasteel_machete", new MacheteItem(ToolMaterials.DURASTEEL, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("hallowed_machete", new MacheteItem(ToolMaterials.HALLOWED, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("kyber_machete", new MacheteItem(ToolMaterials.KYBER, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("metallurgium_machete", new MacheteItem(ToolMaterials.METALLURGIUM, ItemRegistry.getMacheteSettings().fireproof()));
        ItemRegistry.registerItem("mythril_machete", new MacheteItem(ToolMaterials.MYTHRIL, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("orichalcum_machete", new MacheteItem(ToolMaterials.ORICHALCUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("osmium_machete", new MacheteItem(ToolMaterials.OSMIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("palladium_machete", new MacheteItem(ToolMaterials.PALLADIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("prometheum_machete", new MacheteItem(ToolMaterials.PROMETHEUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("quadrillum_machete", new MacheteItem(ToolMaterials.QUADRILLUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("runite_machete", new MacheteItem(ToolMaterials.RUNITE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("star_platinum_machete", new MacheteItem(ToolMaterials.STAR_PLATINUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("steel_machete", new MacheteItem(ToolMaterials.STEEL, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("stormyx_machete", new MacheteItem(ToolMaterials.STORMYX, ItemRegistry.getMacheteSettings()));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("adamantite_scythe", new ShapedRecipeMaterials(new Identifier("c", "adamantite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("adamantite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("aquarium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "aquarium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("aquarium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("banglum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "banglum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("banglum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("bronze_scythe", new ShapedRecipeMaterials(new Identifier("c", "bronze_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("bronze_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("carmot_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "carmot_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("carmot_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("celestium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "celestium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("celestium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("copper_scythe", new ShapedRecipeMaterials(new Identifier("c", "copper_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("copper_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("durasteel_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "durasteel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("durasteel_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("hallowed_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "hallowed_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, HSUtils.ID("hallowed_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("kyber_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "kyber_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("kyber_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("metallurgium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "metallurgium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("metallurgium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("mythril_scythe", new ShapedRecipeMaterials(new Identifier("c", "mythril_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("mythril_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("orichalcum_scythe", new ShapedRecipeMaterials(new Identifier("c", "orichalcum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("orichalcum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("osmium_scythe", new ShapedRecipeMaterials(new Identifier("c", "osmium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("osmium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("palladium_scythe", new ShapedRecipeMaterials(new Identifier("c", "palladium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("palladium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("prometheum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "prometheum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("prometheum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("quadrillum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "quadrillum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("quadrillum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("runite_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "runite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("runite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("star_platinum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "star_platinum"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("star_platinum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("steel_scythe", new ShapedRecipeMaterials(new Identifier("c", "steel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("steel_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("stormyx_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "stormyx_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("stormyx_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("adamantite_machete", new ShapedRecipeMaterials(new Identifier("c", "adamantite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("adamantite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("aquarium_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "aquarium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("aquarium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("banglum_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "banglum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("banglum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("bronze_machete", new ShapedRecipeMaterials(new Identifier("c", "bronze_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("bronze_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("carmot_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "carmot_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("carmot_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("celestium_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "celestium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("celestium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("copper_machete", new ShapedRecipeMaterials(new Identifier("c", "copper_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("copper_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("durasteel_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "durasteel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("durasteel_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("hallowed_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "hallowed_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, HSUtils.ID("hallowed_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("kyber_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "kyber_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("kyber_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("metallurgium_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "metallurgium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("metallurgium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("mythril_machete", new ShapedRecipeMaterials(new Identifier("c", "mythril_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("mythril_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("orichalcum_machete", new ShapedRecipeMaterials(new Identifier("c", "orichalcum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("orichalcum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("osmium_machete", new ShapedRecipeMaterials(new Identifier("c", "osmium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("osmium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("palladium_machete", new ShapedRecipeMaterials(new Identifier("c", "palladium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("palladium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("prometheum_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "prometheum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("prometheum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("quadrillum_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "quadrillum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("quadrillum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("runite_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "runite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("runite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("star_platinum_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "star_platinum"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("star_platinum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("steel_machete", new ShapedRecipeMaterials(new Identifier("c", "steel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("steel_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("stormyx_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "stormyx_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, HSUtils.ID("stormyx_machete")));
    }

}