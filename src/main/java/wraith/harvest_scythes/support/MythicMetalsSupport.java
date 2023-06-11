package wraith.harvest_scythes.support;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import nourl.mythicmetals.item.tools.MythicToolMaterials;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class MythicMetalsSupport {

    private MythicMetalsSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("adamantite_scythe", () -> new ScytheItem(MythicToolMaterials.ADAMANTITE, new FabricItemSettings()));
        ItemRegistry.registerItem("aquarium_scythe", () -> new ScytheItem(MythicToolMaterials.AQUARIUM, new FabricItemSettings()));
        ItemRegistry.registerItem("banglum_scythe", () -> new ScytheItem(MythicToolMaterials.BANGLUM, new FabricItemSettings()));
        ItemRegistry.registerItem("bronze_scythe", () -> new ScytheItem(MythicToolMaterials.BRONZE, new FabricItemSettings()));
        ItemRegistry.registerItem("carmot_scythe", () -> new ScytheItem(MythicToolMaterials.CARMOT, new FabricItemSettings()));
        ItemRegistry.registerItem("celestium_scythe", () -> new ScytheItem(MythicToolMaterials.CELESTIUM, new FabricItemSettings()));
        ItemRegistry.registerItem("copper_scythe", () -> new ScytheItem(MythicToolMaterials.COPPER, new FabricItemSettings()));
        ItemRegistry.registerItem("durasteel_scythe", () -> new ScytheItem(MythicToolMaterials.DURASTEEL, new FabricItemSettings()));
        ItemRegistry.registerItem("hallowed_scythe", () -> new ScytheItem(MythicToolMaterials.HALLOWED, new FabricItemSettings()));
        ItemRegistry.registerItem("kyber_scythe", () -> new ScytheItem(MythicToolMaterials.KYBER, new FabricItemSettings()));
        ItemRegistry.registerItem("metallurgium_scythe", () -> new ScytheItem(MythicToolMaterials.METALLURGIUM, new FabricItemSettings().fireproof()));
        ItemRegistry.registerItem("mythril_scythe", () -> new ScytheItem(MythicToolMaterials.MYTHRIL, new FabricItemSettings()));
        ItemRegistry.registerItem("orichalcum_scythe", () -> new ScytheItem(MythicToolMaterials.ORICHALCUM, new FabricItemSettings()));
        ItemRegistry.registerItem("osmium_scythe", () -> new ScytheItem(MythicToolMaterials.OSMIUM, new FabricItemSettings()));
        ItemRegistry.registerItem("palladium_scythe", () -> new ScytheItem(MythicToolMaterials.PALLADIUM, new FabricItemSettings()));
        ItemRegistry.registerItem("prometheum_scythe", () -> new ScytheItem(MythicToolMaterials.PROMETHEUM, new FabricItemSettings()));
        ItemRegistry.registerItem("quadrillum_scythe", () -> new ScytheItem(MythicToolMaterials.QUADRILLUM, new FabricItemSettings()));
        ItemRegistry.registerItem("runite_scythe", () -> new ScytheItem(MythicToolMaterials.RUNITE, new FabricItemSettings()));
        ItemRegistry.registerItem("star_platinum_scythe", () -> new ScytheItem(MythicToolMaterials.STAR_PLATINUM, new FabricItemSettings()));
        ItemRegistry.registerItem("stormyx_scythe", () -> new ScytheItem(MythicToolMaterials.STORMYX, new FabricItemSettings()));

        ItemRegistry.registerItem("adamantite_machete", () -> new MacheteItem(MythicToolMaterials.ADAMANTITE, new FabricItemSettings()));
        ItemRegistry.registerItem("aquarium_machete", () -> new MacheteItem(MythicToolMaterials.AQUARIUM, new FabricItemSettings()));
        ItemRegistry.registerItem("banglum_machete", () -> new MacheteItem(MythicToolMaterials.BANGLUM, new FabricItemSettings()));
        ItemRegistry.registerItem("bronze_machete", () -> new MacheteItem(MythicToolMaterials.BRONZE, new FabricItemSettings()));
        ItemRegistry.registerItem("carmot_machete", () -> new MacheteItem(MythicToolMaterials.CARMOT, new FabricItemSettings()));
        ItemRegistry.registerItem("celestium_machete", () -> new MacheteItem(MythicToolMaterials.CELESTIUM, new FabricItemSettings()));
        ItemRegistry.registerItem("copper_machete", () -> new MacheteItem(MythicToolMaterials.COPPER, new FabricItemSettings()));
        ItemRegistry.registerItem("durasteel_machete", () -> new MacheteItem(MythicToolMaterials.DURASTEEL, new FabricItemSettings()));
        ItemRegistry.registerItem("hallowed_machete", () -> new MacheteItem(MythicToolMaterials.HALLOWED, new FabricItemSettings()));
        ItemRegistry.registerItem("kyber_machete", () -> new MacheteItem(MythicToolMaterials.KYBER, new FabricItemSettings()));
        ItemRegistry.registerItem("metallurgium_machete", () -> new MacheteItem(MythicToolMaterials.METALLURGIUM, new FabricItemSettings().fireproof()));
        ItemRegistry.registerItem("mythril_machete", () -> new MacheteItem(MythicToolMaterials.MYTHRIL, new FabricItemSettings()));
        ItemRegistry.registerItem("orichalcum_machete", () -> new MacheteItem(MythicToolMaterials.ORICHALCUM, new FabricItemSettings()));
        ItemRegistry.registerItem("osmium_machete", () -> new MacheteItem(MythicToolMaterials.OSMIUM, new FabricItemSettings()));
        ItemRegistry.registerItem("palladium_machete", () -> new MacheteItem(MythicToolMaterials.PALLADIUM, new FabricItemSettings()));
        ItemRegistry.registerItem("prometheum_machete", () -> new MacheteItem(MythicToolMaterials.PROMETHEUM, new FabricItemSettings()));
        ItemRegistry.registerItem("quadrillum_machete", () -> new MacheteItem(MythicToolMaterials.QUADRILLUM, new FabricItemSettings()));
        ItemRegistry.registerItem("runite_machete", () -> new MacheteItem(MythicToolMaterials.RUNITE, new FabricItemSettings()));
        ItemRegistry.registerItem("star_platinum_machete", () -> new MacheteItem(MythicToolMaterials.STAR_PLATINUM, new FabricItemSettings()));
        ItemRegistry.registerItem("stormyx_machete", () -> new MacheteItem(MythicToolMaterials.STORMYX, new FabricItemSettings()));
    }

}
