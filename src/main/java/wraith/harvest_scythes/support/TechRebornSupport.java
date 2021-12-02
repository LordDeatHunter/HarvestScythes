package wraith.harvest_scythes.support;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import techreborn.init.TRToolTier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class TechRebornSupport {

    private TechRebornSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("peridot_scythe", new ScytheItem(TRToolTier.PERIDOT, ItemRegistry.SCYTHE_SETTINGS));
        ItemRegistry.registerItem("sapphire_scythe", new ScytheItem(TRToolTier.SAPPHIRE, ItemRegistry.SCYTHE_SETTINGS));
        ItemRegistry.registerItem("ruby_scythe", new ScytheItem(TRToolTier.RUBY, ItemRegistry.SCYTHE_SETTINGS));
        ItemRegistry.registerItem("bronze_scythe", new ScytheItem(TRToolTier.BRONZE, ItemRegistry.SCYTHE_SETTINGS));

        ItemRegistry.registerItem("peridot_machete", new MacheteItem(TRToolTier.PERIDOT, ItemRegistry.MACHETE_SETTINGS));
        ItemRegistry.registerItem("sapphire_machete", new MacheteItem(TRToolTier.SAPPHIRE, ItemRegistry.MACHETE_SETTINGS));
        ItemRegistry.registerItem("ruby_machete", new MacheteItem(TRToolTier.RUBY, ItemRegistry.MACHETE_SETTINGS));
        ItemRegistry.registerItem("bronze_machete", new MacheteItem(TRToolTier.BRONZE, ItemRegistry.MACHETE_SETTINGS));
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
