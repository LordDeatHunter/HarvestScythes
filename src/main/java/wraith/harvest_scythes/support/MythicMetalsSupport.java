/*
package wraith.harvest_scythes.support;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import nourl.mythicmetals.tools.MythicMetalsToolMaterials;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class MythicMetalsSupport {

    private MythicMetalsSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("adamantite_scythe", new ScytheTool(MythicMetalsToolMaterials.ADAMANTITE, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("aetherium_scythe", new ScytheTool(MythicMetalsToolMaterials.AETHERIUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("aquarium_scythe", new ScytheTool(MythicMetalsToolMaterials.AQUARIUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("argonium_scythe", new ScytheTool(MythicMetalsToolMaterials.ARGONIUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("banglum_scythe", new ScytheTool(MythicMetalsToolMaterials.BANGLUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("brass_scythe", new ScytheTool(MythicMetalsToolMaterials.BRASS, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("bronze_scythe", new ScytheTool(MythicMetalsToolMaterials.BRONZE, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("carmot_scythe", new ScytheTool(MythicMetalsToolMaterials.CARMOT, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("celestium_scythe", new ScytheTool(MythicMetalsToolMaterials.CELESTIUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("copper_scythe", new ScytheTool(MythicMetalsToolMaterials.COPPER, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("discordium_scythe", new ScytheTool(MythicMetalsToolMaterials.DISCORDIUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("durasteel_scythe", new ScytheTool(MythicMetalsToolMaterials.DURASTEEL, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("electrum_scythe", new ScytheTool(MythicMetalsToolMaterials.ELECTRUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("etherite_scythe", new ScytheTool(MythicMetalsToolMaterials.ETHERITE, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("hallowed_scythe", new ScytheTool(MythicMetalsToolMaterials.HALLOWED, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("kyber_scythe", new ScytheTool(MythicMetalsToolMaterials.KYBER, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("metallurgium_scythe", new ScytheTool(MythicMetalsToolMaterials.METALLURGIUM, new Item.Settings().group(ItemGroup.SCYTHES).fireproof()));
        ItemRegistry.ITEMS.put("midas_gold_scythe", new ScytheTool(MythicMetalsToolMaterials.MIDAS_GOLD, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("mythril_scythe", new ScytheTool(MythicMetalsToolMaterials.MYTHRIL, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("orichalcum_scythe", new ScytheTool(MythicMetalsToolMaterials.ORICHALCUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("osmium_scythe", new ScytheTool(MythicMetalsToolMaterials.OSMIUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("prometheum_scythe", new ScytheTool(MythicMetalsToolMaterials.PROMETHEUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("platinum_scythe", new ScytheTool(MythicMetalsToolMaterials.PLATINUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("quadrillum_scythe", new ScytheTool(MythicMetalsToolMaterials.QUADRILLUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("quicksilver_scythe", new ScytheTool(MythicMetalsToolMaterials.QUICKSILVER, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("runite_scythe", new ScytheTool(MythicMetalsToolMaterials.RUNITE, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("silver_scythe", new ScytheTool(MythicMetalsToolMaterials.SILVER, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("slowsilver_scythe", new ScytheTool(MythicMetalsToolMaterials.SLOWSILVER, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("starrite_scythe", new ScytheTool(MythicMetalsToolMaterials.STARRITE, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("steel_scythe", new ScytheTool(MythicMetalsToolMaterials.STEEL, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("stormyx_scythe", new ScytheTool(MythicMetalsToolMaterials.STORMYX, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("tantalite_scythe", new ScytheTool(MythicMetalsToolMaterials.TANTALITE, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("tin_scythe", new ScytheTool(MythicMetalsToolMaterials.TIN, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("truesilver_scythe", new ScytheTool(MythicMetalsToolMaterials.TRUESILVER, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("ur_scythe", new ScytheTool(MythicMetalsToolMaterials.UR, new Item.Settings().group(ItemGroup.SCYTHES)));

        ItemRegistry.ITEMS.put("adamantite_machete", new MacheteItem(MythicMetalsToolMaterials.ADAMANTITE, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("aetherium_machete", new MacheteItem(MythicMetalsToolMaterials.AETHERIUM, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("aquarium_machete", new MacheteItem(MythicMetalsToolMaterials.AQUARIUM, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("argonium_machete", new MacheteItem(MythicMetalsToolMaterials.ARGONIUM, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("banglum_machete", new MacheteItem(MythicMetalsToolMaterials.BANGLUM, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("brass_machete", new MacheteItem(MythicMetalsToolMaterials.BRASS, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("bronze_machete", new MacheteItem(MythicMetalsToolMaterials.BRONZE, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("carmot_machete", new MacheteItem(MythicMetalsToolMaterials.CARMOT, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("celestium_machete", new MacheteItem(MythicMetalsToolMaterials.CELESTIUM, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("copper_machete", new MacheteItem(MythicMetalsToolMaterials.COPPER, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("discordium_machete", new MacheteItem(MythicMetalsToolMaterials.DISCORDIUM, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("durasteel_machete", new MacheteItem(MythicMetalsToolMaterials.DURASTEEL, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("electrum_machete", new MacheteItem(MythicMetalsToolMaterials.ELECTRUM, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("etherite_machete", new MacheteItem(MythicMetalsToolMaterials.ETHERITE, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("hallowed_machete", new MacheteItem(MythicMetalsToolMaterials.HALLOWED, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("kyber_machete", new MacheteItem(MythicMetalsToolMaterials.KYBER, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("metallurgium_machete", new MacheteItem(MythicMetalsToolMaterials.METALLURGIUM, new Item.Settings().group(ItemGroup.MACHETES).fireproof()));
        ItemRegistry.ITEMS.put("midas_gold_machete", new MacheteItem(MythicMetalsToolMaterials.MIDAS_GOLD, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("mythril_machete", new MacheteItem(MythicMetalsToolMaterials.MYTHRIL, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("orichalcum_machete", new MacheteItem(MythicMetalsToolMaterials.ORICHALCUM, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("osmium_machete", new MacheteItem(MythicMetalsToolMaterials.OSMIUM, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("prometheum_machete", new MacheteItem(MythicMetalsToolMaterials.PROMETHEUM, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("platinum_machete", new MacheteItem(MythicMetalsToolMaterials.PLATINUM, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("quadrillum_machete", new MacheteItem(MythicMetalsToolMaterials.QUADRILLUM, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("quicksilver_machete", new MacheteItem(MythicMetalsToolMaterials.QUICKSILVER, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("runite_machete", new MacheteItem(MythicMetalsToolMaterials.RUNITE, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("silver_machete", new MacheteItem(MythicMetalsToolMaterials.SILVER, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("slowsilver_machete", new MacheteItem(MythicMetalsToolMaterials.SLOWSILVER, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("starrite_machete", new MacheteItem(MythicMetalsToolMaterials.STARRITE, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("steel_machete", new MacheteItem(MythicMetalsToolMaterials.STEEL, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("stormyx_machete", new MacheteItem(MythicMetalsToolMaterials.STORMYX, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("tantalite_machete", new MacheteItem(MythicMetalsToolMaterials.TANTALITE, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("tin_machete", new MacheteItem(MythicMetalsToolMaterials.TIN, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("truesilver_machete", new MacheteItem(MythicMetalsToolMaterials.TRUESILVER, new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("ur_machete", new MacheteItem(MythicMetalsToolMaterials.UR, new Item.Settings().group(ItemGroup.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("adamantite_scythe", new ShapedRecipeMaterials(new Identifier("c", "adamantite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("adamantite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("aetherium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "aetherium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("aetherium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("aquarium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "aquarium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("aquarium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("argonium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "argonium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("argonium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("banglum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "banglum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("banglum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("brass_scythe", new ShapedRecipeMaterials(new Identifier("c", "brass_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("brass_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("bronze_scythe", new ShapedRecipeMaterials(new Identifier("c", "bronze_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("bronze_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("carmot_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "carmot_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("carmot_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("celestium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "celestium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("celestium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("copper_scythe", new ShapedRecipeMaterials(new Identifier("c", "copper_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("copper_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("electrum_scythe", new ShapedRecipeMaterials(new Identifier("c", "electrum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("electrum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("discordium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "discordium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("discordium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("durasteel_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "durasteel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("durasteel_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("etherite_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "etherite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("etherite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("hallowed_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "hallowed_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("hallowed_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("kyber_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "kyber_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("kyber_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("metallurgium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "metallurgium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("metallurgium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("midas_gold_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "midas_gold_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("midas_gold_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("mythril_scythe", new ShapedRecipeMaterials(new Identifier("c", "mythril_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("mythril_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("orichalcum_scythe", new ShapedRecipeMaterials(new Identifier("c", "orichalcum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("orichalcum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("osmium_scythe", new ShapedRecipeMaterials(new Identifier("c", "osmium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("osmium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("prometheum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "prometheum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("prometheum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("platinum_scythe", new ShapedRecipeMaterials(new Identifier("c", "platinum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("platinum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("quadrillum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "quadrillum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("quadrillum_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("quicksilver_scythe", new ShapedRecipeMaterials(new Identifier("c", "quicksilver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("quicksilver_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("runite_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "runite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("runite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("silver_scythe", new ShapedRecipeMaterials(new Identifier("c", "silver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("silver_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("slowsilver_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "slowsilver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("slowsilver_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("steel_scythe", new ShapedRecipeMaterials(new Identifier("c", "steel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("steel_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("starrite_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "starrite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("starrite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("stormyx_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "stormyx_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("stormyx_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("tantalite_scythe", new ShapedRecipeMaterials(new Identifier("c", "tantalite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("tantalite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("tin_scythe", new ShapedRecipeMaterials(new Identifier("c", "tin_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("tin_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("truesilver_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "truesilver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("truesilver_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("ur_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "ur_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("ur_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("adamantite_machete", new ShapedRecipeMaterials(new Identifier("c", "adamantite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("adamantite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("aetherium_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "aetherium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("aetherium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("aquarium_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "aquarium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("aquarium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("argonium_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "argonium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("argonium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("banglum_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "banglum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("banglum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("brass_machete", new ShapedRecipeMaterials(new Identifier("c", "brass_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("brass_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("bronze_machete", new ShapedRecipeMaterials(new Identifier("c", "bronze_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("bronze_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("carmot_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "carmot_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("carmot_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("celestium_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "celestium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("celestium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("copper_machete", new ShapedRecipeMaterials(new Identifier("c", "copper_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("copper_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("electrum_machete", new ShapedRecipeMaterials(new Identifier("c", "electrum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("electrum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("discordium_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "discordium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("discordium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("durasteel_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "durasteel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("durasteel_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("etherite_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "etherite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("etherite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("hallowed_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "hallowed_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("hallowed_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("kyber_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "kyber_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("kyber_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("metallurgium_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "metallurgium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("metallurgium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("midas_gold_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "midas_gold_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("midas_gold_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("mythril_machete", new ShapedRecipeMaterials(new Identifier("c", "mythril_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("mythril_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("orichalcum_machete", new ShapedRecipeMaterials(new Identifier("c", "orichalcum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("orichalcum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("osmium_machete", new ShapedRecipeMaterials(new Identifier("c", "osmium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("osmium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("prometheum_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "prometheum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("prometheum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("platinum_machete", new ShapedRecipeMaterials(new Identifier("c", "platinum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("platinum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("quadrillum_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "quadrillum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("quadrillum_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("quicksilver_machete", new ShapedRecipeMaterials(new Identifier("c", "quicksilver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("quicksilver_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("runite_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "runite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("runite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("silver_machete", new ShapedRecipeMaterials(new Identifier("c", "silver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("silver_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("slowsilver_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "slowsilver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("slowsilver_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("steel_machete", new ShapedRecipeMaterials(new Identifier("c", "steel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("steel_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("starrite_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "starrite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("starrite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("stormyx_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "stormyx_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("stormyx_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("tantalite_machete", new ShapedRecipeMaterials(new Identifier("c", "tantalite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("tantalite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("tin_machete", new ShapedRecipeMaterials(new Identifier("c", "tin_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("tin_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("truesilver_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "truesilver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("truesilver_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("ur_machete", new ShapedRecipeMaterials(new Identifier("mythicmetals", "ur_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("ur_machete")));
    }

}
 */
