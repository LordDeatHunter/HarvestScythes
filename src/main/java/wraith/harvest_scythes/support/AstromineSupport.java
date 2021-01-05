package wraith.harvest_scythes.support;

import com.github.chainmailstudios.astromine.foundations.registry.AstromineFoundationsToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.HarvestScythes;
import wraith.harvest_scythes.ItemGroup;
import wraith.harvest_scythes.ItemRegistry;
import wraith.harvest_scythes.ScytheTool;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class AstromineSupport {

    private AstromineSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("copper_scythe", new ScytheTool(AstromineFoundationsToolMaterials.COPPER, 1, -2.75f, 1, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("tin_scythe", new ScytheTool(AstromineFoundationsToolMaterials.TIN, 1, -2.75f, 1, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("silver_scythe", new ScytheTool(AstromineFoundationsToolMaterials.SILVER, 1, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("lead_scythe", new ScytheTool(AstromineFoundationsToolMaterials.LEAD, 1, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));

        ItemRegistry.ITEMS.put("bronze_scythe", new ScytheTool(AstromineFoundationsToolMaterials.BRONZE, 2, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("steel_scythe", new ScytheTool(AstromineFoundationsToolMaterials.STEEL, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("electrum_scythe", new ScytheTool(AstromineFoundationsToolMaterials.ELECTRUM, 1, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("rose_gold_scythe", new ScytheTool(AstromineFoundationsToolMaterials.ROSE_GOLD, 1, -2.75f, 1, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("sterling_silver_scythe", new ScytheTool(AstromineFoundationsToolMaterials.STERLING_SILVER, 2, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("fools_gold_scythe", new ScytheTool(AstromineFoundationsToolMaterials.FOOLS_GOLD, 3, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));

        ItemRegistry.ITEMS.put("metite_scythe", new ScytheTool(AstromineFoundationsToolMaterials.METITE, 4, -2.75f, 1, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("asterite_scythe", new ScytheTool(AstromineFoundationsToolMaterials.ASTERITE, 5, -2.75f, 4, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("stellum_scythe", new ScytheTool(AstromineFoundationsToolMaterials.STELLUM, 6, -2.75f, 4, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("galaxium_scythe", new ScytheTool(AstromineFoundationsToolMaterials.GALAXIUM, 5, -2.75f, 4, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("univite_scythe", new ScytheTool(AstromineFoundationsToolMaterials.UNIVITE, 6, -2.75f, 5, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("lunum_scythe", new ScytheTool(AstromineFoundationsToolMaterials.LUNUM, 5, -2.75f, 3, false, new Item.Settings().group(ItemGroup.SCYTHES)));

        ItemRegistry.ITEMS.put("meteoric_steel_scythe", new ScytheTool(AstromineFoundationsToolMaterials.METEORIC_STEEL, 3, -2.75f, 3, true, new Item.Settings().group(ItemGroup.SCYTHES)));

        HarvestScythes.STICK = new Identifier("c", "wood_sticks");
        HarvestScythes.STICK_TYPE = "tag";
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("copper_scythe", new ShapedRecipeMaterials(new Identifier("c", "copper_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "copper_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("tin_scythe", new ShapedRecipeMaterials(new Identifier("c", "tin_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "tin_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("silver_scythe", new ShapedRecipeMaterials(new Identifier("c", "silver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "silver_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("lead_scythe", new ShapedRecipeMaterials(new Identifier("c", "lead_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "lead_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("bronze_scythe", new ShapedRecipeMaterials(new Identifier("c", "bronze_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "bronze_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("steel_scythe", new ShapedRecipeMaterials(new Identifier("c", "steel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "steel_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("electrum_scythe", new ShapedRecipeMaterials(new Identifier("c", "electrum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "electrum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("rose_gold_scythe", new ShapedRecipeMaterials(new Identifier("c", "rose_gold_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "rose_gold_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("sterling_silver_scythe", new ShapedRecipeMaterials(new Identifier("c", "sterling_silver_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "sterling_silver_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("fools_gold_scythe", new ShapedRecipeMaterials(new Identifier("c", "fools_gold_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "fools_gold_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("metite_scythe", new ShapedRecipeMaterials(new Identifier("c", "metite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "metite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("asterite_scythe", new ShapedRecipeMaterials(new Identifier("c", "asterites"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "asterite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("stellum_scythe", new ShapedRecipeMaterials(new Identifier("c", "stellum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "stellum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("galaxium_scythe", new ShapedRecipeMaterials(new Identifier("c", "galaxiums"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "galaxium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("univite_scythe", new ShapedRecipeMaterials(new Identifier("c", "univite_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "univite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("lunum_scythe", new ShapedRecipeMaterials(new Identifier("c", "lunum_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "lunum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("meteoric_steel_scythe", new ShapedRecipeMaterials(new Identifier("c", "meteoric_steel_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "meteoric_steel_scythe")));
    }

}
