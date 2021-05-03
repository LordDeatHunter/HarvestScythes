package wraith.harvest_scythes;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;

public class ItemRegistry {
    public static final HashMap<String, Item> ITEMS = new HashMap<String, Item>(){{
        put("wooden_scythe", new ScytheTool(ToolMaterials.WOOD, new Item.Settings().group(ItemGroup.SCYTHES)));
        put("stone_scythe", new ScytheTool(ToolMaterials.STONE, new Item.Settings().group(ItemGroup.SCYTHES)));
        put("iron_scythe", new ScytheTool(ToolMaterials.IRON, new Item.Settings().group(ItemGroup.SCYTHES)));
        put("golden_scythe", new ScytheTool(ToolMaterials.GOLD, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        put("diamond_scythe", new ScytheTool(ToolMaterials.DIAMOND, new Item.Settings().group(ItemGroup.SCYTHES)));
        put("netherite_scythe", new ScytheTool(ToolMaterials.NETHERITE, new Item.Settings().group(ItemGroup.SCYTHES).fireproof()));
        put("creative_scythe", new ScytheTool(ToolMaterials.NETHERITE, 20, false, new Item.Settings().group(ItemGroup.SCYTHES).fireproof().maxDamage(-1)));

        put("wooden_machete", new MacheteItem(ToolMaterials.WOOD, new Item.Settings().group(ItemGroup.MACHETES)));
        put("stone_machete", new MacheteItem(ToolMaterials.STONE, new Item.Settings().group(ItemGroup.MACHETES)));
        put("iron_machete", new MacheteItem(ToolMaterials.IRON, new Item.Settings().group(ItemGroup.MACHETES)));
        put("golden_machete", new MacheteItem(ToolMaterials.GOLD, 100, new Item.Settings().group(ItemGroup.MACHETES)));
        put("diamond_machete", new MacheteItem(ToolMaterials.DIAMOND, new Item.Settings().group(ItemGroup.MACHETES)));
        put("netherite_machete", new MacheteItem(ToolMaterials.NETHERITE, new Item.Settings().group(ItemGroup.MACHETES).fireproof()));
        put("creative_machete", new MacheteItem(ToolMaterials.NETHERITE, 240, new Item.Settings().group(ItemGroup.MACHETES).fireproof().maxDamage(-1)));
    }};

    public static int registerItems(){
        for (String itemID : ITEMS.keySet()){
            Registry.register(Registry.ITEM, Utils.ID(itemID), ITEMS.get(itemID));
        }
        return ITEMS.size();
    }
}
