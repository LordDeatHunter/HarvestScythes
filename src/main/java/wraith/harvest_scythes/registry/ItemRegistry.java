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

    public static FabricItemSettings getScytheSettings() {
        return new FabricItemSettings().group(SCYTHES);
    }

    public static FabricItemSettings getMacheteSettings() {
        return new FabricItemSettings().group(MACHETES);
    }

    public static Item get(String id) {
        return ITEMS.getOrDefault(id, Items.AIR);
    }

    public static void init() {
        if (!ITEMS.isEmpty()) {
            return;
        }
        registerItem("wooden_scythe", new ScytheItem(ToolMaterials.WOOD, getScytheSettings()));
        registerItem("stone_scythe", new ScytheItem(ToolMaterials.STONE, getScytheSettings()));
        registerItem("iron_scythe", new ScytheItem(ToolMaterials.IRON, getScytheSettings()));
        registerItem("golden_scythe", new ScytheItem(ToolMaterials.GOLD, 3, getScytheSettings()));
        registerItem("diamond_scythe", new ScytheItem(ToolMaterials.DIAMOND, getScytheSettings()));
        registerItem("netherite_scythe", new ScytheItem(ToolMaterials.NETHERITE, new FabricItemSettings().group(SCYTHES).fireproof()));
        registerItem("creative_scythe", new ScytheItem(ToolMaterials.NETHERITE, 20, new FabricItemSettings().group(SCYTHES).fireproof().maxDamage(-1)));

        registerItem("wooden_machete", new MacheteItem(ToolMaterials.WOOD, getMacheteSettings()));
        registerItem("stone_machete", new MacheteItem(ToolMaterials.STONE, getMacheteSettings()));
        registerItem("iron_machete", new MacheteItem(ToolMaterials.IRON, getMacheteSettings()));
        registerItem("golden_machete", new MacheteItem(ToolMaterials.GOLD, 100, getMacheteSettings()));
        registerItem("diamond_machete", new MacheteItem(ToolMaterials.DIAMOND, getMacheteSettings()));
        registerItem("netherite_machete", new MacheteItem(ToolMaterials.NETHERITE, new FabricItemSettings().group(MACHETES).fireproof()));
        registerItem("creative_machete", new MacheteItem(ToolMaterials.NETHERITE, 240, new FabricItemSettings().group(MACHETES).fireproof().maxDamage(-1)));
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
