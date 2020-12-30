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

    public static int loadItems() {
        ItemRegistry.ITEMS.put("adamantite_scythe", new ScytheTool(MythicMetalsToolMaterials.ADAMANTITE, 3, -2.75f, 3, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("aetherium_scythe", new ScytheTool(MythicMetalsToolMaterials.AETHERIUM, 3, -2.75f, 3, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("aquarium_scythe", new ScytheTool(MythicMetalsToolMaterials.AQUARIUM, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("argonium_scythe", new ScytheTool(MythicMetalsToolMaterials.ARGONIUM, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("banglum_scythe", new ScytheTool(MythicMetalsToolMaterials.BANGLUM, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("brass_scythe", new ScytheTool(MythicMetalsToolMaterials.BRASS, 3, -2.75f, 3, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("carmot_scythe", new ScytheTool(MythicMetalsToolMaterials.CARMOT, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("celestium_scythe", new ScytheTool(MythicMetalsToolMaterials.CELESTIUM, 3, -2.75f, 3, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("discordium_scythe", new ScytheTool(MythicMetalsToolMaterials.DISCORDIUM, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("durasteel_scythe", new ScytheTool(MythicMetalsToolMaterials.DURASTEEL, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("etherite_scythe", new ScytheTool(MythicMetalsToolMaterials.ETHERITE, 3, -2.75f, 3, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("kyber_scythe", new ScytheTool(MythicMetalsToolMaterials.KYBER, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("metallurgium_scythe", new ScytheTool(MythicMetalsToolMaterials.METALLURGIUM, 3, -2.75f, 4, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("midas_gold_scythe", new ScytheTool(MythicMetalsToolMaterials.MIDAS_GOLD, 3, -2.75f, 1, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("mythril_scythe", new ScytheTool(MythicMetalsToolMaterials.MYTHRIL, 3, -2.75f, 3, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("orichalcum_scythe", new ScytheTool(MythicMetalsToolMaterials.ORICHALCUM, 3, -2.75f, 4, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("osmium_scythe", new ScytheTool(MythicMetalsToolMaterials.OSMIUM, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("prometheum_scythe", new ScytheTool(MythicMetalsToolMaterials.PROMETHEUM, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("platinum_scythe", new ScytheTool(MythicMetalsToolMaterials.PLATINUM, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("quadrillum_scythe", new ScytheTool(MythicMetalsToolMaterials.QUADRILLUM, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("quicksilver_scythe", new ScytheTool(MythicMetalsToolMaterials.QUICKSILVER, 3, -2.75f, 3, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("runite_scythe", new ScytheTool(MythicMetalsToolMaterials.RUNITE, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("slowsilver_scythe", new ScytheTool(MythicMetalsToolMaterials.SLOWSILVER, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("starrite_scythe", new ScytheTool(MythicMetalsToolMaterials.STARRITE, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("stormyx_scythe", new ScytheTool(MythicMetalsToolMaterials.STORMYX, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("tantalite_scythe", new ScytheTool(MythicMetalsToolMaterials.TANTALITE, 3, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("truesilver_scythe", new ScytheTool(MythicMetalsToolMaterials.TRUESILVER, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("ur_scythe", new ScytheTool(MythicMetalsToolMaterials.UR, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        return 28;
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("adamantite_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "adamantite_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "adamantite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("aetherium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "aetherium_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "aetherium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("aquarium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "aquarium_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "aquarium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("argonium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "argonium_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "argonium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("banglum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "banglum_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "banglum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("brass_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "brass_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "brass_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("carmot_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "carmot_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "carmot_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("celestium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "celestium_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "celestium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("discordium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "discordium_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "discordium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("durasteel_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "durasteel_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "durasteel_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("etherite_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "etherite_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "etherite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("kyber_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "kyber_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "kyber_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("metallurgium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "metallurgium_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "metallurgium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("midas_gold_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "midas_gold_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "midas_gold_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("mythril_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "mythril_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "mythril_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("orichalcum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "orichalcum_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "orichalcum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("osmium_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "osmium_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "osmium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("prometheum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "prometheum_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "prometheum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("platinum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "platinum_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "platinum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("quadrillum_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "quadrillum_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "quadrillum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("quicksilver_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "quicksilver_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "quicksilver_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("runite_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "runite_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "runite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("slowsilver_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "slowsilver_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "slowsilver_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("starrite_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "starrite_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "starrite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("stormyx_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "stormyx_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "stormyx_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("tantalite_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "tantalite_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "tantalite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("truesilver_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "truesilver_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "truesilver_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("ur_scythe", new ShapedRecipeMaterials(new Identifier("mythicmetals", "ur_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "ur_scythe")));
    }

}
