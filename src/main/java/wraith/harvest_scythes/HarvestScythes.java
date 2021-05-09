package wraith.harvest_scythes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.support.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class HarvestScythes implements ModInitializer {

    public static final String MOD_ID = "harvest_scythes";
    public static final Logger LOGGER = LogManager.getLogger();
    public static Identifier STICK = Registry.ITEM.getId(Items.STICK);
    public static String STICK_TYPE = "item";

    @Override
    public void onInitialize() {
        registerEvents();
    }

    public static void load() {
        LOGGER.info("Loading [Harvest Scythes]");

        int compatibleMods = 0;
        int vanillaHSItems = ItemRegistry.ITEMS.size();

        RecipesGenerator.createShapedRecipes();

        if (FabricLoader.getInstance().isModLoaded("simplyplatinum")) {
            LOGGER.info("[Simply Platinum] detected. Loading supported items.");
            SimplyPlatinumSupport.loadItems();
            SimplyPlatinumSupport.loadRecipes();
            ++compatibleMods;
        }
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
        if (FabricLoader.getInstance().isModLoaded("gobber2")) {
            LOGGER.info("[Gobber] detected. Loading supported items.");
            GobberSupport.loadItems();
            GobberSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("adabraniummod")) {
            LOGGER.info("[Adabranium] detected. Loading supported items.");
            AdabraniumSupport.loadItems();
            AdabraniumSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("the_aether")) {
            LOGGER.info("[Aether Reborn] detected. Loading supported items.");
            AetherSupport.loadItems();
            AetherSupport.loadRecipes();
            ++compatibleMods;
        }

        int registeredItems = ItemRegistry.registerItems();
        LOGGER.info("Loaded " + (registeredItems - vanillaHSItems) + " items from " + compatibleMods + " compatible mod" + (compatibleMods != 1 ? "s" : "") + ", for a total of " + registeredItems + " items.");

        EnchantsRegistry.registerEnchantments();

        RecipesGenerator.addRecipes();

        LOGGER.info("[Harvest Scythes] has successfully been loaded!");
    }

    private void registerEvents() {
        PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, blockEntity) -> {
            if (world.isClient) {
                return;
            }
            ItemStack stack = player.getMainHandStack();
            if (!(stack.getItem() instanceof MacheteItem)) {
                return;
            }
            int damage = 0;
            boolean isCreative = stack.getItem() == ItemRegistry.ITEMS.get("creative_machete");
            Queue<BlockPos> positions = new LinkedList<>();
            positions.add(pos);
            while (!positions.isEmpty() && ((stack.getDamage() + damage <= stack.getMaxDamage()) || isCreative) && damage <= ((MacheteItem) stack.getItem()).getHarvestDepth()) {
                BlockPos curPos = positions.remove();
                BlockState curState = world.getBlockState(curPos);
                if (!(curState.getBlock() instanceof LeavesBlock) && damage > 0) {
                    continue;
                }
                world.breakBlock(curPos, true);
                ++damage;
                for (int x = -1; x <= 1; ++x) {
                    for (int y = -1; y <= 1; ++y) {
                        for (int z = -1; z <= 1; ++z) {
                            if (x == 0 && y == 0 && z == 0) {
                                continue;
                            }
                            positions.add(curPos.add(x, y, z));
                        }
                    }
                }
            }
            if (isCreative && damage > 1) {
                stack.damage(damage - 1, player, (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
            }
        });
    }

}
