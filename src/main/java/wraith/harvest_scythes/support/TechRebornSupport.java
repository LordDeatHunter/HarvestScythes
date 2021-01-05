package wraith.harvest_scythes.support;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import techreborn.init.TRToolTier;
import wraith.harvest_scythes.HarvestScythes;
import wraith.harvest_scythes.ItemGroup;
import wraith.harvest_scythes.ItemRegistry;
import wraith.harvest_scythes.ScytheTool;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class TechRebornSupport {

    private TechRebornSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("peridot_scythe", new ScytheTool(TRToolTier.PERIDOT, 2, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("sapphire_scythe", new ScytheTool(TRToolTier.SAPPHIRE, 3, -2.75f, 3, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("ruby_scythe", new ScytheTool(TRToolTier.RUBY, 2, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("bronze_scythe", new ScytheTool(TRToolTier.BRONZE, 2, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("peridot_scythe", new ShapedRecipeMaterials(new Identifier("c", "peridot_gems"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "peridot_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("tr_sapphire_scythe", new ShapedRecipeMaterials(new Identifier("c", "sapphires"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "sapphire_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("tr_ruby_scythe", new ShapedRecipeMaterials(new Identifier("c", "rubies"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "ruby_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("bronze_scythe", new ShapedRecipeMaterials(new Identifier("c", "bronze_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "bronze_scythe")));
    }

}
