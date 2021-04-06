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

        int compatibleMods = 0;

        RecipesGenerator.createShapedRecipes();

        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            LOGGER.info("[Mythic Metals] detected. Loading supported items.");
            MythicMetalsSupport.loadItems();
            MythicMetalsSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("astromine-foundations")) {
            LOGGER.info("[Astromine Foundations] detected. Loading supported items.");
            AstromineSupport.loadItems();
            AstromineSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("more_gems")) {
            LOGGER.info("[More Gems] detected. Loading supported items.");
            MoreGemsSupport.loadItems();
            MoreGemsSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("hellish-materials")) {
            LOGGER.info("[Hellish Materials] detected. Loading supported items.");
            HellishMaterialsSupport.loadItems();
            HellishMaterialsSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("diamold")) {
            LOGGER.info("[Diamold] detected. Loading supported items.");
            DiamoldSupport.loadItems();
            DiamoldSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            LOGGER.info("[Better Nether] detected. Loading supported items.");
            BetterNetherSupport.loadItems();
            BetterNetherSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            LOGGER.info("[Better End] detected. Loading supported items.");
            BetterEndSupport.loadItems();
            BetterEndSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("byg")) {
            LOGGER.info("[Better End] detected. Loading supported items.");
            BYGSupport.loadItems();
            BYGSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            LOGGER.info("[Tech Reborn] detected. Loading supported items.");
            TechRebornSupport.loadItems();
            TechRebornSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("dragonloot")) {
            LOGGER.info("[DragonLoot] detected. Loading supported items.");
            DragonLootSupport.loadItems();
            DragonLootSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("tungstenmod")) {
            LOGGER.info("[Tungsten Mod] detected. Loading supported items.");
            TungstenModSupport.loadItems();
            TungstenModSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("fantasycraft")) {
            LOGGER.info("[Fantasycraft] detected. Loading supported items.");
            FantasycraftSupport.loadItems();
            FantasycraftSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("pigsteel")) {
            LOGGER.info("[PigSteel] detected. Loading supported items.");
            PigSteelSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("luxore")) {
            LOGGER.info("[Luxore] detected. Loading supported items.");
            LuxoreSupport.loadItems();
            LuxoreSupport.loadRecipes();
            ++compatibleMods;
        }

        int registeredItems = ItemRegistry.registerItems();
        LOGGER.info("Loaded " + (registeredItems - 6) + " items from " + compatibleMods + " compatible mod" + (compatibleMods != 1 ? "s" : "") + ", for a total of " + registeredItems + " items.");

        EnchantsRegistry.registerEnchantments();

        RecipesGenerator.addRecipes();

        LOGGER.info("[Harvest Scythes] has successfully been loaded!");

    }

}
