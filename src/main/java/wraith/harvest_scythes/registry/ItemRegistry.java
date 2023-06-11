package wraith.harvest_scythes.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import wraith.harvest_scythes.util.HSUtils;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;

import java.util.HashMap;
import java.util.function.Supplier;

public final class ItemRegistry {

    private ItemRegistry() {}


    private static final HashMap<String, Item> ITEMS = new HashMap<>();

    public static final ItemGroup SCYTHES = FabricItemGroup.builder(HSUtils.ID("scythes")).icon(() -> new ItemStack(ItemRegistry.get("diamond_scythe"))).entries((displayContext, entries) -> ITEMS.values().stream().filter(entry -> entry instanceof ScytheItem).map(ItemStack::new).forEach(entries::add)).build();
    public static final ItemGroup MACHETES = FabricItemGroup.builder(HSUtils.ID("machetes")).icon(() -> new ItemStack(ItemRegistry.get("diamond_machete"))).entries((displayContext, entries) -> ITEMS.values().stream().filter(entry -> entry instanceof MacheteItem).map(ItemStack::new).forEach(entries::add)).build();

    public static Item get(String id) {
        return ITEMS.getOrDefault(id, Items.AIR);
    }

    public static void init() {
        if (!ITEMS.isEmpty()) {
            return;
        }
        registerItem("wooden_scythe", () -> new ScytheItem(ToolMaterials.WOOD, new FabricItemSettings()));
        registerItem("stone_scythe", () -> new ScytheItem(ToolMaterials.STONE, new FabricItemSettings()));
        registerItem("iron_scythe", () -> new ScytheItem(ToolMaterials.IRON, new FabricItemSettings()));
        registerItem("golden_scythe", () -> new ScytheItem(ToolMaterials.GOLD, 3, new FabricItemSettings()));
        registerItem("diamond_scythe", () -> new ScytheItem(ToolMaterials.DIAMOND, new FabricItemSettings()));
        registerItem("netherite_scythe", () -> new ScytheItem(ToolMaterials.NETHERITE, new FabricItemSettings().fireproof()));
        registerItem("creative_scythe", () -> new ScytheItem(ToolMaterials.NETHERITE, 20, new FabricItemSettings().fireproof().maxDamage(-1)));

        registerItem("wooden_machete", () -> new MacheteItem(ToolMaterials.WOOD, new FabricItemSettings()));
        registerItem("stone_machete", () -> new MacheteItem(ToolMaterials.STONE, new FabricItemSettings()));
        registerItem("iron_machete", () -> new MacheteItem(ToolMaterials.IRON, new FabricItemSettings()));
        registerItem("golden_machete", () -> new MacheteItem(ToolMaterials.GOLD, 100, new FabricItemSettings()));
        registerItem("diamond_machete", () -> new MacheteItem(ToolMaterials.DIAMOND, new FabricItemSettings()));
        registerItem("netherite_machete", () -> new MacheteItem(ToolMaterials.NETHERITE, new FabricItemSettings().fireproof()));
        registerItem("creative_machete", () -> new MacheteItem(ToolMaterials.NETHERITE, 240, new FabricItemSettings().fireproof().maxDamage(-1)));
    }

    public static void registerItem(String id, Supplier<Item> item) {
        if (ITEMS.containsKey(id)) {
            return;
        }
        ITEMS.put(id, Registry.register(Registries.ITEM, HSUtils.ID(id), item.get()));
    }

    public static int count() {
        return ITEMS.size();
    }

}
