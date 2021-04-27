package wraith.harvest_scythes.support;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import techreborn.init.TRToolTier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class TechRebornSupport {

    private TechRebornSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("peridot_scythe", new ScytheTool(TRToolTier.PERIDOT, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("sapphire_scythe", new ScytheTool(TRToolTier.SAPPHIRE, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("ruby_scythe", new ScytheTool(TRToolTier.RUBY, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("bronze_scythe", new ScytheTool(TRToolTier.BRONZE, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("peridot_scythe", new ShapedRecipeMaterials(new Identifier("c", "peridot_gems"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("peridot_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("tr_sapphire_scythe", new ShapedRecipeMaterials(new Identifier("c", "sapphires"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("sapphire_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("tr_ruby_scythe", new ShapedRecipeMaterials(new Identifier("c", "rubies"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("ruby_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("bronze_scythe", new ShapedRecipeMaterials(new Identifier("c", "bronze_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("bronze_scythe")));
    }

}
