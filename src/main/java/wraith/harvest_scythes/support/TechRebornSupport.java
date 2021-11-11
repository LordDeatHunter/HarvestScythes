package wraith.harvest_scythes.support;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import techreborn.init.TRToolTier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public final class TechRebornSupport {

    private TechRebornSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("peridot_scythe", new ScytheTool(TRToolTier.PERIDOT, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("sapphire_scythe", new ScytheTool(TRToolTier.SAPPHIRE, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("ruby_scythe", new ScytheTool(TRToolTier.RUBY, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("bronze_scythe", new ScytheTool(TRToolTier.BRONZE, new FabricItemSettings().group(HSItemGroups.SCYTHES)));

        ItemRegistry.registerItem("peridot_machete", new MacheteItem(TRToolTier.PERIDOT, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("sapphire_machete", new MacheteItem(TRToolTier.SAPPHIRE, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("ruby_machete", new MacheteItem(TRToolTier.RUBY, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("bronze_machete", new MacheteItem(TRToolTier.BRONZE, new FabricItemSettings().group(HSItemGroups.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("peridot_scythe", new ShapedRecipeMaterials(new Identifier("c", "peridot_gems"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("peridot_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("tr_sapphire_scythe", new ShapedRecipeMaterials(new Identifier("c", "sapphires"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("sapphire_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("tr_ruby_scythe", new ShapedRecipeMaterials(new Identifier("c", "rubies"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("ruby_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("bronze_scythe", new ShapedRecipeMaterials(new Identifier("c", "bronze_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("bronze_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("peridot_machete", new ShapedRecipeMaterials(new Identifier("c", "peridot_gems"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("peridot_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("tr_sapphire_machete", new ShapedRecipeMaterials(new Identifier("c", "sapphires"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("sapphire_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("tr_ruby_machete", new ShapedRecipeMaterials(new Identifier("c", "rubies"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("ruby_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("bronze_machete", new ShapedRecipeMaterials(new Identifier("c", "bronze_ingots"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, Utils.ID("bronze_machete")));
    }

}
