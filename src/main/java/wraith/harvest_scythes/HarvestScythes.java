package wraith.harvest_scythes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.CropBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.server.command.CommandManager;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wraith.harvest_scythes.api.scythe.HSScythesEvents;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.registry.EnchantsRegistry;
import wraith.harvest_scythes.registry.ItemRegistry;
import wraith.harvest_scythes.support.*;
import wraith.harvest_scythes.util.Config;

public class HarvestScythes implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "harvest_scythes";
    private static boolean loaded = false;

    public static void load() {
        if (loaded) {
            return;
        }
        loaded = true;
        LOGGER.info("Loading [Harvest Scythes]");

        ItemRegistry.init();

//        if (FabricLoader.getInstance().isModLoaded("simplyplatinum")) {
//            LOGGER.info("[Simply Platinum] detected. Loading supported items.");
//            SimplyPlatinumSupport.loadItems();
//        }
        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            LOGGER.info("[Mythic Metals] detected. Loading supported items.");
            MythicMetalsSupport.loadItems();
        }
        if (FabricLoader.getInstance().isModLoaded("naturesminerals")) {
            LOGGER.info("[Nature's Minerals] detected. Loading supported items.");
            NaturesMineralsSupport.loadItems();
        }
        if (FabricLoader.getInstance().isModLoaded("more_gems")) {
            LOGGER.info("[More Gems] detected. Loading supported items.");
            MoreGemsSupport.loadItems();
        }
        if (FabricLoader.getInstance().isModLoaded("hellish-materials")) {
            LOGGER.info("[Hellish Materials] detected. Loading supported items.");
            HellishMaterialsSupport.loadItems();
        }
        if (FabricLoader.getInstance().isModLoaded("diamold")) {
            LOGGER.info("[Diamold] detected. Loading supported items.");
            DiamoldSupport.loadItems();
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            LOGGER.info("[Tech Reborn] detected. Loading supported items.");
            TechRebornSupport.loadItems();
        }
        if (FabricLoader.getInstance().isModLoaded("dragonloot")) {
            LOGGER.info("[DragonLoot] detected. Loading supported items.");
            DragonLootSupport.loadItems();
        }
        if (FabricLoader.getInstance().isModLoaded("pigsteel")) {
            LOGGER.info("[PigSteel] detected. Loading supported recipes.");
        }
//        if (FabricLoader.getInstance().isModLoaded("luxore")) {
//            LOGGER.info("[Luxore] detected. Loading supported items.");
//            LuxoreSupport.loadItems();
//        }
        if (FabricLoader.getInstance().isModLoaded("gobber2")) {
            LOGGER.info("[Gobber] detected. Loading supported items.");
            GobberSupport.loadItems();
        }
        if (FabricLoader.getInstance().isModLoaded("adabraniummod")) {
            LOGGER.info("[Adabranium] detected. Loading supported items.");
            AdabraniumSupport.loadItems();
        }
        if (FabricLoader.getInstance().isModLoaded("winterly")) {
            LOGGER.info("[Winterly] detected. Loading supported items.");
            WinterlySupport.loadItems();
        }
//        if (FabricLoader.getInstance().isModLoaded("the_aether")) {
//            LOGGER.info("[Aether Reborn] detected. Loading supported items.");
//            AetherSupport.loadItems();
//        }
        EnchantsRegistry.registerEnchantments();

        LOGGER.info("[Harvest Scythes] has successfully been loaded!");
    }

    @Override
    public void onInitialize() {
        registerEvents();
        Config.getInstance();
        HSScythesEvents.addSingleHarvestListener(event -> {
            var state = event.blockState();
            if (!(state.getBlock() instanceof CropBlock) || EnchantmentHelper.getLevel(EnchantsRegistry.ENCHANTMENTS.get("blind_harvest_curse"), event.stack()) > 0) {
                return;
            }
            var sound = state.getSoundGroup();
            event.world().playSound(null, event.cropPos(), sound.getBreakSound(), SoundCategory.BLOCKS, sound.getVolume(), sound.getPitch());
        });
    }

    private void registerEvents() {
        PlayerBlockBreakEvents.AFTER.register(MacheteItem::tryHarvest);
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(CommandManager.literal("harvest_scythes")
            .then(CommandManager.literal("reload")
                .requires(source -> source.hasPermissionLevel(1))
                .executes(context -> {
                    Config.getInstance().loadConfig();
                    context.getSource().sendFeedback(Text.translatable("§6[§eHarvest Scythes§6] §3has successfully reloaded!"), false);
                    return 1;
                })
            )
        ));
    }

}
