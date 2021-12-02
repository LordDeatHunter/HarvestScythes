package wraith.harvest_scythes.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;
import wraith.harvest_scythes.Utils;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;

import java.util.HashMap;

public final class ItemRegistry {

    private ItemRegistry() {}


    private static final HashMap<String, Item> ITEMS = new HashMap<>();
    public static final ItemGroup SCYTHES = FabricItemGroupBuilder.create(Utils.ID("scythes"))
            .icon(() -> new ItemStack(ItemRegistry.get("diamond_scythe"))).build();
    public static final ItemGroup MACHETES = FabricItemGroupBuilder.create(Utils.ID("machetes"))
            .icon(() -> new ItemStack(ItemRegistry.get("diamond_machete"))).build();

    public static final FabricItemSettings SCYTHE_SETTINGS = new FabricItemSettings().group(SCYTHES);
    public static final FabricItemSettings MACHETE_SETTINGS = new FabricItemSettings().group(MACHETES);

    public static Item get(String id) {
        return ITEMS.getOrDefault(id, Items.AIR);
    }

    public static void init() {
        if (!ITEMS.isEmpty()) {
            return;
        }
        registerItem("wooden_scythe", new ScytheItem(ToolMaterials.WOOD, SCYTHE_SETTINGS));
        registerItem("stone_scythe", new ScytheItem(ToolMaterials.STONE, SCYTHE_SETTINGS));
        registerItem("iron_scythe", new ScytheItem(ToolMaterials.IRON, SCYTHE_SETTINGS));
        registerItem("golden_scythe", new ScytheItem(ToolMaterials.GOLD, 3, SCYTHE_SETTINGS));
        registerItem("diamond_scythe", new ScytheItem(ToolMaterials.DIAMOND, SCYTHE_SETTINGS));
        registerItem("netherite_scythe", new ScytheItem(ToolMaterials.NETHERITE, SCYTHE_SETTINGS.fireproof()));
        registerItem("creative_scythe", new ScytheItem(ToolMaterials.NETHERITE, 20, SCYTHE_SETTINGS.fireproof().maxDamage(-1)));

        registerItem("wooden_machete", new MacheteItem(ToolMaterials.WOOD, MACHETE_SETTINGS));
        registerItem("stone_machete", new MacheteItem(ToolMaterials.STONE, MACHETE_SETTINGS));
        registerItem("iron_machete", new MacheteItem(ToolMaterials.IRON, MACHETE_SETTINGS));
        registerItem("golden_machete", new MacheteItem(ToolMaterials.GOLD, 100, MACHETE_SETTINGS));
        registerItem("diamond_machete", new MacheteItem(ToolMaterials.DIAMOND, MACHETE_SETTINGS));
        registerItem("netherite_machete", new MacheteItem(ToolMaterials.NETHERITE, MACHETE_SETTINGS.fireproof()));
        registerItem("creative_machete", new MacheteItem(ToolMaterials.NETHERITE, 240, MACHETE_SETTINGS.fireproof().maxDamage(-1)));
    }

    public static void registerItem(String id, Item item) {
        if (ITEMS.containsKey(id)) {
            return;
        }
        ITEMS.put(id, Registry.register(Registry.ITEM, Utils.ID(id), item));
    }

    public static int count() {
        return ITEMS.size();
    }

}
