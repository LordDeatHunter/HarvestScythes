package wraith.harvest_scythes;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;

public class ItemRegistry {
    public static final HashMap<String, Item> ITEMS = new HashMap<String, Item>(){{
        put("wooden_scythe", new ScytheTool(ToolMaterials.WOOD, 0, -2.75f, 1, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        put("stone_scythe", new ScytheTool(ToolMaterials.STONE, 1, -2.75f, 1, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        put("iron_scythe", new ScytheTool(ToolMaterials.IRON, 2, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        put("golden_scythe", new ScytheTool(ToolMaterials.GOLD, 0, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        put("diamond_scythe", new ScytheTool(ToolMaterials.DIAMOND, 3, -2.75f, 3, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        put("netherite_scythe", new ScytheTool(ToolMaterials.NETHERITE, 4, -2.75f, 3, false, new Item.Settings().group(ItemGroup.SCYTHES)));
    }};

    public static int registerItems(){
        System.out.println("Starting to register items.");
        for (String itemID : ITEMS.keySet()){
            System.out.println("REGISTERING " + itemID);
            Registry.register(Registry.ITEM, new Identifier(HarvestScythes.MOD_ID, itemID), ITEMS.get(itemID));
        }
        System.out.println("Finished registering items.");
        return ITEMS.size();
    }
}
