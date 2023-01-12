package wraith.harvest_scythes.support;

import com.kwpugh.more_gems.init.ItemInit;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class MoreGemsSupport {

    private MoreGemsSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("alexandrite_scythe", () -> new ScytheItem(ItemInit.ALEXANDRITE_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("kunzite_scythe", () -> new ScytheItem(ItemInit.KUNZITE_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("carbonado_scythe", () -> new ScytheItem(ItemInit.CARBONADO_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("citrine_scythe", () -> new ScytheItem(ItemInit.CITRINE_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("corundum_scythe", () -> new ScytheItem(ItemInit.CORUNDUM_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("moissanite_scythe", () -> new ScytheItem(ItemInit.MOISSANITE_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("spinel_scythe", () -> new ScytheItem(ItemInit.SPINEL_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("sapphire_scythe", () -> new ScytheItem(ItemInit.SAPPHIRE_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("topaz_scythe", () -> new ScytheItem(ItemInit.TOPAZ_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("tourmaline_scythe", () -> new ScytheItem(ItemInit.TOURMALINE_TOOL_MATERIAL, new FabricItemSettings()));

        ItemRegistry.registerItem("alexandrite_machete", () -> new MacheteItem(ItemInit.ALEXANDRITE_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("kunzite_machete", () -> new MacheteItem(ItemInit.KUNZITE_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("carbonado_machete", () -> new MacheteItem(ItemInit.CARBONADO_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("citrine_machete", () -> new MacheteItem(ItemInit.CITRINE_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("corundum_machete", () -> new MacheteItem(ItemInit.CORUNDUM_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("moissanite_machete", () -> new MacheteItem(ItemInit.MOISSANITE_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("spinel_machete", () -> new MacheteItem(ItemInit.SPINEL_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("sapphire_machete", () -> new MacheteItem(ItemInit.SAPPHIRE_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("topaz_machete", () -> new MacheteItem(ItemInit.TOPAZ_TOOL_MATERIAL, new FabricItemSettings()));
        ItemRegistry.registerItem("tourmaline_machete", () -> new MacheteItem(ItemInit.TOURMALINE_TOOL_MATERIAL, new FabricItemSettings()));
    }

}
