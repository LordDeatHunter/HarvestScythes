package wraith.harvest_scythes.support;

import nourl.mythicmetals.tools.ToolMaterials;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class MythicMetalsSupport {

    private MythicMetalsSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("adamantite_scythe", () -> new ScytheItem(ToolMaterials.ADAMANTITE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("aquarium_scythe", () -> new ScytheItem(ToolMaterials.AQUARIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("banglum_scythe", () -> new ScytheItem(ToolMaterials.BANGLUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("bronze_scythe", () -> new ScytheItem(ToolMaterials.BRONZE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("carmot_scythe", () -> new ScytheItem(ToolMaterials.CARMOT, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("celestium_scythe", () -> new ScytheItem(ToolMaterials.CELESTIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("copper_scythe", () -> new ScytheItem(ToolMaterials.COPPER, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("durasteel_scythe", () -> new ScytheItem(ToolMaterials.DURASTEEL, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("hallowed_scythe", () -> new ScytheItem(ToolMaterials.HALLOWED, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("kyber_scythe", () -> new ScytheItem(ToolMaterials.KYBER, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("metallurgium_scythe", () -> new ScytheItem(ToolMaterials.METALLURGIUM, ItemRegistry.getScytheSettings().fireproof()));
        ItemRegistry.registerItem("mythril_scythe", () -> new ScytheItem(ToolMaterials.MYTHRIL, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("orichalcum_scythe", () -> new ScytheItem(ToolMaterials.ORICHALCUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("osmium_scythe", () -> new ScytheItem(ToolMaterials.OSMIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("palladium_scythe", () -> new ScytheItem(ToolMaterials.PALLADIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("prometheum_scythe", () -> new ScytheItem(ToolMaterials.PROMETHEUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("quadrillum_scythe", () -> new ScytheItem(ToolMaterials.QUADRILLUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("runite_scythe", () -> new ScytheItem(ToolMaterials.RUNITE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("star_platinum_scythe", () -> new ScytheItem(ToolMaterials.STAR_PLATINUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("stormyx_scythe", () -> new ScytheItem(ToolMaterials.STORMYX, ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("adamantite_machete", () -> new MacheteItem(ToolMaterials.ADAMANTITE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("aquarium_machete", () -> new MacheteItem(ToolMaterials.AQUARIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("banglum_machete", () -> new MacheteItem(ToolMaterials.BANGLUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("bronze_machete", () -> new MacheteItem(ToolMaterials.BRONZE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("carmot_machete", () -> new MacheteItem(ToolMaterials.CARMOT, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("celestium_machete", () -> new MacheteItem(ToolMaterials.CELESTIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("copper_machete", () -> new MacheteItem(ToolMaterials.COPPER, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("durasteel_machete", () -> new MacheteItem(ToolMaterials.DURASTEEL, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("hallowed_machete", () -> new MacheteItem(ToolMaterials.HALLOWED, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("kyber_machete", () -> new MacheteItem(ToolMaterials.KYBER, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("metallurgium_machete", () -> new MacheteItem(ToolMaterials.METALLURGIUM, ItemRegistry.getMacheteSettings().fireproof()));
        ItemRegistry.registerItem("mythril_machete", () -> new MacheteItem(ToolMaterials.MYTHRIL, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("orichalcum_machete", () -> new MacheteItem(ToolMaterials.ORICHALCUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("osmium_machete", () -> new MacheteItem(ToolMaterials.OSMIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("palladium_machete", () -> new MacheteItem(ToolMaterials.PALLADIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("prometheum_machete", () -> new MacheteItem(ToolMaterials.PROMETHEUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("quadrillum_machete", () -> new MacheteItem(ToolMaterials.QUADRILLUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("runite_machete", () -> new MacheteItem(ToolMaterials.RUNITE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("star_platinum_machete", () -> new MacheteItem(ToolMaterials.STAR_PLATINUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("stormyx_machete", () -> new MacheteItem(ToolMaterials.STORMYX, ItemRegistry.getMacheteSettings()));
    }

}
