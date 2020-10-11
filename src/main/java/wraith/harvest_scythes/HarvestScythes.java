package wraith.harvest_scythes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HarvestScythes implements ModInitializer {

    public static final String MOD_ID = "harvest_scythes";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        LOGGER.info("Loading [Harvest Scythes]");

        int moddedItems = 0;
        int compatibleMods = 0;

        RecipesGenerator.createShapedRecipes();

        if (FabricLoader.getInstance().isModLoaded("astromine-foundations")) {
            LOGGER.info("[Astromine Foundations] detected. Loading supported items.");
            moddedItems += AstromineSupport.loadItems();
            AstromineSupport.loadRecipes();
            ++compatibleMods;
        }
        LOGGER.info("Loaded " + moddedItems + " items from " + compatibleMods + " compatible mod" + (compatibleMods != 1 ? "s" : "") + ", for a total of " + ItemRegistry.registerItems() + " items.");

        RecipesGenerator.addRecipes();

        LOGGER.info("[Harvest Scythes] has successfully been loaded!");

    }

}
