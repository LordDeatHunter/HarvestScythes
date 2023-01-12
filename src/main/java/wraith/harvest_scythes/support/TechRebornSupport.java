package wraith.harvest_scythes.support;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import techreborn.init.TRToolTier;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class TechRebornSupport {

    private TechRebornSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("peridot_scythe", () -> new ScytheItem(TRToolTier.PERIDOT, new FabricItemSettings()));
        ItemRegistry.registerItem("sapphire_scythe", () -> new ScytheItem(TRToolTier.SAPPHIRE, new FabricItemSettings()));
        ItemRegistry.registerItem("ruby_scythe", () -> new ScytheItem(TRToolTier.RUBY, new FabricItemSettings()));
        ItemRegistry.registerItem("bronze_scythe", () -> new ScytheItem(TRToolTier.BRONZE, new FabricItemSettings()));

        ItemRegistry.registerItem("peridot_machete", () -> new MacheteItem(TRToolTier.PERIDOT, new FabricItemSettings()));
        ItemRegistry.registerItem("sapphire_machete", () -> new MacheteItem(TRToolTier.SAPPHIRE, new FabricItemSettings()));
        ItemRegistry.registerItem("ruby_machete", () -> new MacheteItem(TRToolTier.RUBY, new FabricItemSettings()));
        ItemRegistry.registerItem("bronze_machete", () -> new MacheteItem(TRToolTier.BRONZE, new FabricItemSettings()));
    }

}
