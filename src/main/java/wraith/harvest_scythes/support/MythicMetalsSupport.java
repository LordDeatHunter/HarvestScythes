package wraith.harvest_scythes.support;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import nourl.mythicmetals.tools.MythicMetalsToolMaterials;
import wraith.harvest_scythes.HarvestScythes;
import wraith.harvest_scythes.ItemGroup;
import wraith.harvest_scythes.ItemRegistry;
import wraith.harvest_scythes.ScytheTool;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class MythicMetalsSupport {

    private MythicMetalsSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("adamantite_scythe", new ScytheTool(MythicMetalsToolMaterials.ADAMANTITE, 4, -2.75f, 3, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("aetherium_scythe", new ScytheTool(MythicMetalsToolMaterials.AETHERIUM, 4, -2.75f, 3, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("aquarium_scythe", new ScytheTool(MythicMetalsToolMaterials.AQUARIUM, 2, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("argonium_scythe", new ScytheTool(MythicMetalsToolMaterials.ARGONIUM, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("banglum_scythe", new ScytheTool(MythicMetalsToolMaterials.BANGLUM, 2, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("brass_scythe", new ScytheTool(MythicMetalsToolMaterials.BRASS, 1, -2.75f, 3, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("bronze_scythe", new ScytheTool(MythicMetalsToolMaterials.BRONZE, 2, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("carmot_scythe", new ScytheTool(MythicMetalsToolMaterials.CARMOT, 2, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("celestium_scythe", new ScytheTool(MythicMetalsToolMaterials.CELESTIUM, 4, -2.75f, 3, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("copper_scythe", new ScytheTool(MythicMetalsToolMaterials.COPPER, 1, -2.75f, 1, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("discordium_scythe", new ScytheTool(MythicMetalsToolMaterials.DISCORDIUM, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("durasteel_scythe", new ScytheTool(MythicMetalsToolMaterials.DURASTEEL, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("electrum_scythe", new ScytheTool(MythicMetalsToolMaterials.ELECTRUM, 1, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("etherite_scythe", new ScytheTool(MythicMetalsToolMaterials.ETHERITE, 4, -2.75f, 3, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("kyber_scythe", new ScytheTool(MythicMetalsToolMaterials.KYBER, 2, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("metallurgium_scythe", new ScytheTool(MythicMetalsToolMaterials.METALLURGIUM, 5, -2.75f, 4, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("midas_gold_scythe", new ScytheTool(MythicMetalsToolMaterials.MIDAS_GOLD, 1, -2.75f, 1, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("mythril_scythe", new ScytheTool(MythicMetalsToolMaterials.MYTHRIL, 4, -2.75f, 3, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("orichalcum_scythe", new ScytheTool(MythicMetalsToolMaterials.ORICHALCUM, 4, -2.75f, 4, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("osmium_scythe", new ScytheTool(MythicMetalsToolMaterials.OSMIUM, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("prometheum_scythe", new ScytheTool(MythicMetalsToolMaterials.PROMETHEUM, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("platinum_scythe", new ScytheTool(MythicMetalsToolMaterials.PLATINUM, 2, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("quadrillum_scythe", new ScytheTool(MythicMetalsToolMaterials.QUADRILLUM, 2, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("quicksilver_scythe", new ScytheTool(MythicMetalsToolMaterials.QUICKSILVER, 3, -2.75f, 3, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("runite_scythe", new ScytheTool(MythicMetalsToolMaterials.RUNITE, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("silver_scythe", new ScytheTool(MythicMetalsToolMaterials.SILVER, 1, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("slowsilver_scythe", new ScytheTool(MythicMetalsToolMaterials.SLOWSILVER, 2, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("starrite_scythe", new ScytheTool(MythicMetalsToolMaterials.STARRITE, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("steel_scythe", new ScytheTool(MythicMetalsToolMaterials.STEEL, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("stormyx_scythe", new ScytheTool(MythicMetalsToolMaterials.STORMYX, 2, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("tantalite_scythe", new ScytheTool(MythicMetalsToolMaterials.TANTALITE, 2, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("tin_scythe", new ScytheTool(MythicMetalsToolMaterials.TIN, 1, -2.75f, 1, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("truesilver_scythe", new ScytheTool(MythicMetalsToolMaterials.TRUESILVER, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("ur_scythe", new ScytheTool(MythicMetalsToolMaterials.UR, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("adamantite_scythe", new ShapedRecipeMaterials(new Identifier("c", "adamantite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "adamantite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("aetherium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "aetherium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "aetherium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("aquarium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "aquarium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "aquarium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("argonium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "argonium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "argonium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("banglum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "banglum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "banglum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("brass_scythe", new ShapedRecipeMaterials(new Identifier("c", "brass_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "brass_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("bronze_scythe", new ShapedRecipeMaterials(new Identifier("c", "bronze_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "bronze_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("carmot_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "carmot_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "carmot_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("celestium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "celestium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "celestium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("copper_scythe", new ShapedRecipeMaterials(new Identifier("c", "copper_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "copper_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("electrum_scythe", new ShapedRecipeMaterials(new Identifier("c", "electrum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "electrum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("discordium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "discordium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "discordium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("durasteel_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "durasteel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "durasteel_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("etherite_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "etherite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "etherite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("kyber_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "kyber_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "kyber_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("metallurgium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "metallurgium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "metallurgium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("midas_gold_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "midas_gold_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "midas_gold_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("mythril_scythe", new ShapedRecipeMaterials(new Identifier("c", "mythril_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "mythril_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("orichalcum_scythe", new ShapedRecipeMaterials(new Identifier("c", "orichalcum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "orichalcum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("osmium_scythe", new ShapedRecipeMaterials(new Identifier("c", "osmium_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "osmium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("prometheum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "prometheum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "prometheum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("platinum_scythe", new ShapedRecipeMaterials(new Identifier("c", "platinum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "platinum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("quadrillum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "quadrillum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "quadrillum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("quicksilver_scythe", new ShapedRecipeMaterials(new Identifier("c", "quicksilver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "quicksilver_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("runite_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "runite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "runite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("silver_scythe", new ShapedRecipeMaterials(new Identifier("c", "silver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "silver_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("slowsilver_scythe", new ShapedRecipeMaterials(new Identifier("c", "slowsilver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "slowsilver_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("steel_scythe", new ShapedRecipeMaterials(new Identifier("c", "steel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "steel_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("starrite_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "starrite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "starrite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("stormyx_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "stormyx_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "stormyx_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("tantalite_scythe", new ShapedRecipeMaterials(new Identifier("c", "tantalite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "tantalite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("tin_scythe", new ShapedRecipeMaterials(new Identifier("c", "tin_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "tin_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("truesilver_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "truesilver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "truesilver_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("ur_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "ur_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "ur_scythe")));
    }

}
