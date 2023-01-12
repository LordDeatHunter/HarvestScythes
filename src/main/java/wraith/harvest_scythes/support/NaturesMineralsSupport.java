package wraith.harvest_scythes.support;

import com.ianm1647.naturesminerals.item.equipment.NaturesToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class NaturesMineralsSupport {

    private NaturesMineralsSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("astrite_scythe", () -> new ScytheItem(NaturesToolMaterials.ASTRITE, new FabricItemSettings()));
        ItemRegistry.registerItem("nm_kunzite_scythe", () -> new ScytheItem(NaturesToolMaterials.KUNZITE, new FabricItemSettings()));
        ItemRegistry.registerItem("stibnite_scythe", () -> new ScytheItem(NaturesToolMaterials.STIBNITE, new FabricItemSettings()));
        ItemRegistry.registerItem("thounite_scythe", () -> new ScytheItem(NaturesToolMaterials.THOUNITE, new FabricItemSettings()));
        ItemRegistry.registerItem("uvarovite_scythe", () -> new ScytheItem(NaturesToolMaterials.UVAROVITE, new FabricItemSettings()));

        ItemRegistry.registerItem("astrite_machete", () -> new MacheteItem(NaturesToolMaterials.ASTRITE, new FabricItemSettings()));
        ItemRegistry.registerItem("nm_kunzite_machete", () -> new MacheteItem(NaturesToolMaterials.KUNZITE, new FabricItemSettings()));
        ItemRegistry.registerItem("stibnite_machete", () -> new MacheteItem(NaturesToolMaterials.STIBNITE, new FabricItemSettings()));
        ItemRegistry.registerItem("thounite_machete", () -> new MacheteItem(NaturesToolMaterials.THOUNITE, new FabricItemSettings()));
        ItemRegistry.registerItem("uvarovite_machete", () -> new MacheteItem(NaturesToolMaterials.UVAROVITE, new FabricItemSettings()));
    }

}
