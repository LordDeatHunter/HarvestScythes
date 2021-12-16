package wraith.harvest_scythes.support;

import net.minecraft.util.Identifier;
import techreborn.init.TRToolTier;
import wraith.harvest_scythes.HarvestScythes;
import wraith.harvest_scythes.Utils;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class TechRebornSupport {

    private TechRebornSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("peridot_scythe", new ScytheItem(TRToolTier.PERIDOT, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("sapphire_scythe", new ScytheItem(TRToolTier.SAPPHIRE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("ruby_scythe", new ScytheItem(TRToolTier.RUBY, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("bronze_scythe", new ScytheItem(TRToolTier.BRONZE, ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("peridot_machete", new MacheteItem(TRToolTier.PERIDOT, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("sapphire_machete", new MacheteItem(TRToolTier.SAPPHIRE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("ruby_machete", new MacheteItem(TRToolTier.RUBY, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("bronze_machete", new MacheteItem(TRToolTier.BRONZE, ItemRegistry.getMacheteSettings()));
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
