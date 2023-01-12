package wraith.harvest_scythes.support;

import net.dragonloot.item.DragonToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class DragonLootSupport {

    private DragonLootSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("dragon_scythe", () -> new ScytheItem(DragonToolMaterial.getInstance(), new FabricItemSettings()));

        ItemRegistry.registerItem("dragon_machete", () -> new MacheteItem(DragonToolMaterial.getInstance(), new FabricItemSettings()));
    }

}
