package wraith.harvest_scythes.support;

import com.kwpugh.gobber2.init.ItemInit;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class GobberSupport {

    private GobberSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("gobber2_scythe", () -> new ScytheItem(ItemInit.GOBBER_TOOL_MATERIAL, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("gobber2_nether_scythe", () -> new ScytheItem(ItemInit.GOBBER_NETHER_TOOL_MATERIAL, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("gobber2_end_scythe", () -> new ScytheItem(ItemInit.GOBBER_END_TOOL_MATERIAL, ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("gobber2_machete", () -> new MacheteItem(ItemInit.GOBBER_TOOL_MATERIAL, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("gobber2_nether_machete", () -> new MacheteItem(ItemInit.GOBBER_NETHER_TOOL_MATERIAL, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("gobber2_end_machete", () -> new MacheteItem(ItemInit.GOBBER_END_TOOL_MATERIAL, ItemRegistry.getMacheteSettings()));
    }

}
