package wraith.harvest_scythes.support;

import nourl.mythicmetals.tools.MythicToolMaterials;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class MythicMetalsSupport {

    private MythicMetalsSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("adamantite_scythe", () -> new ScytheItem(MythicToolMaterials.ADAMANTITE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("aquarium_scythe", () -> new ScytheItem(MythicToolMaterials.AQUARIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("banglum_scythe", () -> new ScytheItem(MythicToolMaterials.BANGLUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("bronze_scythe", () -> new ScytheItem(MythicToolMaterials.BRONZE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("carmot_scythe", () -> new ScytheItem(MythicToolMaterials.CARMOT, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("celestium_scythe", () -> new ScytheItem(MythicToolMaterials.CELESTIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("copper_scythe", () -> new ScytheItem(MythicToolMaterials.COPPER, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("durasteel_scythe", () -> new ScytheItem(MythicToolMaterials.DURASTEEL, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("hallowed_scythe", () -> new ScytheItem(MythicToolMaterials.HALLOWED, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("kyber_scythe", () -> new ScytheItem(MythicToolMaterials.KYBER, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("metallurgium_scythe", () -> new ScytheItem(MythicToolMaterials.METALLURGIUM, ItemRegistry.getScytheSettings().fireproof()));
        ItemRegistry.registerItem("mythril_scythe", () -> new ScytheItem(MythicToolMaterials.MYTHRIL, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("orichalcum_scythe", () -> new ScytheItem(MythicToolMaterials.ORICHALCUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("osmium_scythe", () -> new ScytheItem(MythicToolMaterials.OSMIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("palladium_scythe", () -> new ScytheItem(MythicToolMaterials.PALLADIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("prometheum_scythe", () -> new ScytheItem(MythicToolMaterials.PROMETHEUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("quadrillum_scythe", () -> new ScytheItem(MythicToolMaterials.QUADRILLUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("runite_scythe", () -> new ScytheItem(MythicToolMaterials.RUNITE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("star_platinum_scythe", () -> new ScytheItem(MythicToolMaterials.STAR_PLATINUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("stormyx_scythe", () -> new ScytheItem(MythicToolMaterials.STORMYX, ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("adamantite_machete", () -> new MacheteItem(MythicToolMaterials.ADAMANTITE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("aquarium_machete", () -> new MacheteItem(MythicToolMaterials.AQUARIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("banglum_machete", () -> new MacheteItem(MythicToolMaterials.BANGLUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("bronze_machete", () -> new MacheteItem(MythicToolMaterials.BRONZE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("carmot_machete", () -> new MacheteItem(MythicToolMaterials.CARMOT, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("celestium_machete", () -> new MacheteItem(MythicToolMaterials.CELESTIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("copper_machete", () -> new MacheteItem(MythicToolMaterials.COPPER, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("durasteel_machete", () -> new MacheteItem(MythicToolMaterials.DURASTEEL, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("hallowed_machete", () -> new MacheteItem(MythicToolMaterials.HALLOWED, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("kyber_machete", () -> new MacheteItem(MythicToolMaterials.KYBER, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("metallurgium_machete", () -> new MacheteItem(MythicToolMaterials.METALLURGIUM, ItemRegistry.getMacheteSettings().fireproof()));
        ItemRegistry.registerItem("mythril_machete", () -> new MacheteItem(MythicToolMaterials.MYTHRIL, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("orichalcum_machete", () -> new MacheteItem(MythicToolMaterials.ORICHALCUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("osmium_machete", () -> new MacheteItem(MythicToolMaterials.OSMIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("palladium_machete", () -> new MacheteItem(MythicToolMaterials.PALLADIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("prometheum_machete", () -> new MacheteItem(MythicToolMaterials.PROMETHEUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("quadrillum_machete", () -> new MacheteItem(MythicToolMaterials.QUADRILLUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("runite_machete", () -> new MacheteItem(MythicToolMaterials.RUNITE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("star_platinum_machete", () -> new MacheteItem(MythicToolMaterials.STAR_PLATINUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("stormyx_machete", () -> new MacheteItem(MythicToolMaterials.STORMYX, ItemRegistry.getMacheteSettings()));
    }

}
