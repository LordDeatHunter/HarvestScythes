package wraith.harvest_scythes.support;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.tigereye.hellishmaterials.items.batet.BatetMaterial;
import net.tigereye.hellishmaterials.items.luss.LussMaterial;
import net.tigereye.hellishmaterials.items.vuld.tools.VuldMaterial;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class HellishMaterialsSupport {

    private HellishMaterialsSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("batet_scythe", () -> new ScytheItem(new BatetMaterial(), new FabricItemSettings()));
        ItemRegistry.registerItem("luss_scythe", () -> new ScytheItem(new LussMaterial(), new FabricItemSettings()));
        ItemRegistry.registerItem("vuld_scythe", () -> new ScytheItem(new VuldMaterial(), new FabricItemSettings()));

        ItemRegistry.registerItem("batet_machete", () -> new MacheteItem(new BatetMaterial(), new FabricItemSettings()));
        ItemRegistry.registerItem("luss_machete", () -> new MacheteItem(new LussMaterial(), new FabricItemSettings()));
        ItemRegistry.registerItem("vuld_machete", () -> new MacheteItem(new VuldMaterial(), new FabricItemSettings()));
    }

}