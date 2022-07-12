package wraith.harvest_scythes.support;

import com.ianm1647.naturesminerals.item.equipment.NaturesToolMaterials;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class NaturesMineralsSupport {

    private NaturesMineralsSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("astrite_scythe", () -> new ScytheItem(NaturesToolMaterials.ASTRITE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("nm_kunzite_scythe", () -> new ScytheItem(NaturesToolMaterials.KUNZITE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("stibnite_scythe", () -> new ScytheItem(NaturesToolMaterials.STIBNITE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("thounite_scythe", () -> new ScytheItem(NaturesToolMaterials.THOUNITE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("uvarovite_scythe", () -> new ScytheItem(NaturesToolMaterials.UVAROVITE, ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("astrite_machete", () -> new MacheteItem(NaturesToolMaterials.ASTRITE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("nm_kunzite_machete", () -> new MacheteItem(NaturesToolMaterials.KUNZITE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("stibnite_machete", () -> new MacheteItem(NaturesToolMaterials.STIBNITE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("thounite_machete", () -> new MacheteItem(NaturesToolMaterials.THOUNITE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("uvarovite_machete", () -> new MacheteItem(NaturesToolMaterials.UVAROVITE, ItemRegistry.getMacheteSettings()));
    }

}
