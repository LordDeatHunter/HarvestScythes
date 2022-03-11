package wraith.harvest_scythes.support;

import techreborn.init.TRToolTier;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class TechRebornSupport {

    private TechRebornSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("peridot_scythe", () -> new ScytheItem(TRToolTier.PERIDOT, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("sapphire_scythe", () -> new ScytheItem(TRToolTier.SAPPHIRE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("ruby_scythe", () -> new ScytheItem(TRToolTier.RUBY, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("bronze_scythe", () -> new ScytheItem(TRToolTier.BRONZE, ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("peridot_machete", () -> new MacheteItem(TRToolTier.PERIDOT, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("sapphire_machete", () -> new MacheteItem(TRToolTier.SAPPHIRE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("ruby_machete", () -> new MacheteItem(TRToolTier.RUBY, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("bronze_machete", () -> new MacheteItem(TRToolTier.BRONZE, ItemRegistry.getMacheteSettings()));
    }

}
