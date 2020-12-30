package wraith.harvest_scythes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.support.*;

public class HarvestScythes implements ModInitializer {

    public static final String MOD_ID = "harvest_scythes";
    public static final Logger LOGGER = LogManager.getLogger();
    public static Identifier STICK = Registry.ITEM.getId(Items.STICK);
    public static String STICK_TYPE = "item";

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
        if (FabricLoader.getInstance().isModLoaded("more_gems")) {
            LOGGER.info("[More Gems] detected. Loading supported items.");
            moddedItems += MoreGemsSupport.loadItems();
            MoreGemsSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("hellish-materials")) {
            LOGGER.info("[Hellish Materials] detected. Loading supported items.");
            moddedItems += HellishMaterialsSupport.loadItems();
            HellishMaterialsSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("diamold")) {
            LOGGER.info("[Diamold] detected. Loading supported items.");
            moddedItems += DiamoldSupport.loadItems();
            DiamoldSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            LOGGER.info("[Better Nether] detected. Loading supported items.");
            moddedItems += BetterNetherSupport.loadItems();
            BetterNetherSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            LOGGER.info("[Better End] detected. Loading supported items.");
            moddedItems += BetterEndSupport.loadItems();
            BetterEndSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("byg")) {
            LOGGER.info("[Better End] detected. Loading supported items.");
            moddedItems += BYGSupport.loadItems();
            BYGSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            LOGGER.info("[Mythic Metals] detected. Loading supported items.");
            moddedItems += MythicMetalsSupport.loadItems();
            MythicMetalsSupport.loadRecipes();
            ++compatibleMods;
        }

        LOGGER.info("Loaded " + moddedItems + " items from " + compatibleMods + " compatible mod" + (compatibleMods != 1 ? "s" : "") + ", for a total of " + ItemRegistry.registerItems() + " items.");

        RecipesGenerator.addRecipes();

        LOGGER.info("[Harvest Scythes] has successfully been loaded!");

    }

}
