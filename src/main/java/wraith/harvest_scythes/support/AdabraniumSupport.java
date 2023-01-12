package wraith.harvest_scythes.support;

import com.brand.adabraniummod.content.stuff.materials.AdabraniumToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class AdabraniumSupport {

    private AdabraniumSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("adb_adamantium_scythe", () -> new ScytheItem(AdabraniumToolMaterials.ADAMANTIUM, new FabricItemSettings()));
        ItemRegistry.registerItem("adb_vibranium_scythe", () -> new ScytheItem(AdabraniumToolMaterials.VIBRANIUM, new FabricItemSettings()));
        ItemRegistry.registerItem("adb_nether_scythe", () -> new ScytheItem(AdabraniumToolMaterials.NETHER_BRICK, new FabricItemSettings()));

        ItemRegistry.registerItem("adb_adamantium_machete", () -> new MacheteItem(AdabraniumToolMaterials.ADAMANTIUM, new FabricItemSettings()));
        ItemRegistry.registerItem("adb_vibranium_machete", () -> new MacheteItem(AdabraniumToolMaterials.VIBRANIUM, new FabricItemSettings()));
        ItemRegistry.registerItem("adb_nether_machete", () -> new MacheteItem(AdabraniumToolMaterials.NETHER_BRICK, new FabricItemSettings()));
    }

}