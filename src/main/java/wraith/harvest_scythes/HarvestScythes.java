package wraith.harvest_scythes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wraith.harvest_scythes.api.event.HarvestEvent;
import wraith.harvest_scythes.api.event.SingleHarvestEvent;
import wraith.harvest_scythes.api.machete.HSMacheteEvents;
import wraith.harvest_scythes.api.scythe.HSScythesEvents;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.registry.EnchantsRegistry;
import wraith.harvest_scythes.registry.ItemRegistry;
import wraith.harvest_scythes.support.*;

import java.util.LinkedList;
import java.util.Queue;

public class HarvestScythes implements ModInitializer {

    public static final String MOD_ID = "harvest_scythes";
    public static final Logger LOGGER = LogManager.getLogger();
    public static Identifier STICK = Registry.ITEM.getId(Items.STICK);
    public static String STICK_TYPE = "item";
    private static boolean loaded = false;

    @Override
    public void onInitialize() {
        registerEvents();
        HSScythesEvents.addSingleHarvestListener(event -> {
            var state = event.blockState();
            if (!(state.getBlock() instanceof CropBlock) || EnchantmentHelper.getLevel(EnchantsRegistry.ENCHANTMENTS.get("blind_harvest_curse"), event.stack()) > 0) {
                return;
            }
            var sound = state.getSoundGroup();
            event.world().playSound(null, event.cropPos(), sound.getBreakSound(), SoundCategory.BLOCKS, sound.getVolume(), sound.getPitch());
        });
    }

    public static void load() {
        if (loaded) {
            return;
        }
        loaded = true;
        LOGGER.info("Loading [Harvest Scythes]");

        ItemRegistry.init();
        RecipesGenerator.createShapedRecipes();

        if (FabricLoader.getInstance().isModLoaded("simplyplatinum")) {
            LOGGER.info("[Simply Platinum] detected. Loading supported items.");
            SimplyPlatinumSupport.loadItems();
            SimplyPlatinumSupport.loadRecipes();
        }
        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            LOGGER.info("[Mythic Metals] detected. Loading supported items.");
            MythicMetalsSupport.loadItems();
            MythicMetalsSupport.loadRecipes();
        }
        if (FabricLoader.getInstance().isModLoaded("more_gems")) {
            LOGGER.info("[More Gems] detected. Loading supported items.");
            MoreGemsSupport.loadItems();
            MoreGemsSupport.loadRecipes();
        }
        if (FabricLoader.getInstance().isModLoaded("hellish-materials")) {
            LOGGER.info("[Hellish Materials] detected. Loading supported items.");
            HellishMaterialsSupport.loadItems();
            HellishMaterialsSupport.loadRecipes();
        }
        //if (FabricLoader.getInstance().isModLoaded("diamold")) {
        //    LOGGER.info("[Diamold] detected. Loading supported items.");
        //    DiamoldSupport.loadItems();
        //    DiamoldSupport.loadRecipes();
        //}
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            LOGGER.info("[Tech Reborn] detected. Loading supported items.");
            TechRebornSupport.loadItems();
            TechRebornSupport.loadRecipes();
        }
        if (FabricLoader.getInstance().isModLoaded("dragonloot")) {
            LOGGER.info("[DragonLoot] detected. Loading supported items.");
            DragonLootSupport.loadItems();
            DragonLootSupport.loadRecipes();
        }
        //if (FabricLoader.getInstance().isModLoaded("fantasycraft")) {
        //    LOGGER.info("[Fantasycraft] detected. Loading supported items.");
        //    FantasycraftSupport.loadItems();
        //    FantasycraftSupport.loadRecipes();
        //}
        if (FabricLoader.getInstance().isModLoaded("pigsteel")) {
            LOGGER.info("[PigSteel] detected. Loading supported items.");
            PigSteelSupport.loadRecipes();
        }
        //if (FabricLoader.getInstance().isModLoaded("luxore")) {
        //    LOGGER.info("[Luxore] detected. Loading supported items.");
        //    LuxoreSupport.loadItems();
        //    LuxoreSupport.loadRecipes();
        //}
        if (FabricLoader.getInstance().isModLoaded("gobber2")) {
            LOGGER.info("[Gobber] detected. Loading supported items.");
            GobberSupport.loadItems();
            GobberSupport.loadRecipes();
        }
        if (FabricLoader.getInstance().isModLoaded("adabraniummod")) {
            LOGGER.info("[Adabranium] detected. Loading supported items.");
            AdabraniumSupport.loadItems();
            AdabraniumSupport.loadRecipes();
        }
        if (FabricLoader.getInstance().isModLoaded("the_aether")) {
            LOGGER.info("[Aether Reborn] detected. Loading supported items.");
            AetherSupport.loadItems();
            AetherSupport.loadRecipes();
        }
        //if (FabricLoader.getInstance().isModLoaded("earlygame")) {
        //    LOGGER.info("[EarlyGame] detected. Loading supported items.");
        //    EarlyGameSupport.loadItems();
        //    EarlyGameSupport.loadRecipes();
        //}
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
            if (!(stack.getItem() instanceof MacheteItem machete)) {
                return;
            }
            int blocksHarvested = 0;
            int damage = 0;
            boolean isCreative = machete == ItemRegistry.get("creative_machete");
            Queue<BlockPos> positions = new LinkedList<>();
            positions.add(pos);
            while (!positions.isEmpty() && blocksHarvested <= MacheteItem.getHarvestDepth(stack)) {
                BlockPos curPos = positions.remove();
                BlockState curState = world.getBlockState(curPos);
                if (!(curState.getBlock() instanceof LeavesBlock) && blocksHarvested > 0) {
                    continue;
                }
                world.breakBlock(curPos, true);
                ++blocksHarvested;
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
                var takeDamage = Utils.getRandomIntInRange(0, EnchantmentHelper.getLevel(Enchantments.UNBREAKING, stack)) != 0;
                HSMacheteEvents.onSingleHarvest(new SingleHarvestEvent(world, player, stack, curState, curPos, 1, blocksHarvested, takeDamage));
                if (!isCreative && takeDamage) {
                    ++damage;
                    stack.damage(1, player, (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
                }
            }
            HSMacheteEvents.onHarvest(new HarvestEvent(world, player, stack, blocksHarvested, damage));
        });
    }

}
