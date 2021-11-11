package wraith.harvest_scythes;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;

public class ItemRegistry {

    private ItemRegistry() {}

    private static final HashMap<String, Item> ITEMS = new HashMap<>();

    public static Item get(String id) {
        return ITEMS.getOrDefault(id, Items.AIR);
    }

    public static void init() {
        if (!ITEMS.isEmpty()) {
            return;
        }
        registerItem("wooden_scythe", new ScytheTool(ToolMaterials.WOOD, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        registerItem("stone_scythe", new ScytheTool(ToolMaterials.STONE, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        registerItem("iron_scythe", new ScytheTool(ToolMaterials.IRON, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        registerItem("golden_scythe", new ScytheTool(ToolMaterials.GOLD, 3, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        registerItem("diamond_scythe", new ScytheTool(ToolMaterials.DIAMOND, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        registerItem("netherite_scythe", new ScytheTool(ToolMaterials.NETHERITE, new FabricItemSettings().group(HSItemGroups.SCYTHES).fireproof()));
        registerItem("creative_scythe", new ScytheTool(ToolMaterials.NETHERITE, 20, new FabricItemSettings().group(HSItemGroups.SCYTHES).fireproof().maxDamage(-1)));

        registerItem("wooden_machete", new MacheteItem(ToolMaterials.WOOD, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        registerItem("stone_machete", new MacheteItem(ToolMaterials.STONE, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        registerItem("iron_machete", new MacheteItem(ToolMaterials.IRON, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        registerItem("golden_machete", new MacheteItem(ToolMaterials.GOLD, 100, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        registerItem("diamond_machete", new MacheteItem(ToolMaterials.DIAMOND, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        registerItem("netherite_machete", new MacheteItem(ToolMaterials.NETHERITE, new FabricItemSettings().group(HSItemGroups.MACHETES).fireproof()));
        registerItem("creative_machete", new MacheteItem(ToolMaterials.NETHERITE, 240, new FabricItemSettings().group(HSItemGroups.MACHETES).fireproof().maxDamage(-1)));
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
