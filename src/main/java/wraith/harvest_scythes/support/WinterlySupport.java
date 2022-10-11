package wraith.harvest_scythes.support;

import net.minecraft.item.ToolMaterials;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public class WinterlySupport {

    private WinterlySupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("cryomarble_scythe", () -> new ScytheItem(ToolMaterials.DIAMOND, ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("cryomarble_machete", () -> new MacheteItem(ToolMaterials.DIAMOND, ItemRegistry.getScytheSettings()));
    }

}
