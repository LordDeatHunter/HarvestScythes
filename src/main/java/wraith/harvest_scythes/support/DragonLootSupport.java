package wraith.harvest_scythes.support;

import net.dragonloot.item.DragonToolMaterial;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class DragonLootSupport {

    private DragonLootSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("dragon_scythe", () -> new ScytheItem(DragonToolMaterial.getInstance(), ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("dragon_machete", () -> new MacheteItem(DragonToolMaterial.getInstance(), ItemRegistry.getMacheteSettings()));
    }

}
