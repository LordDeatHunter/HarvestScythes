//package wraith.harvest_scythes.support;
//
//import net.id.aether.items.tools.AetherToolMaterials;
//import wraith.harvest_scythes.item.MacheteItem;
//import wraith.harvest_scythes.item.ScytheItem;
//import wraith.harvest_scythes.registry.ItemRegistry;
//
//public final class AetherSupport {
//
//    private AetherSupport() {}
//
//    public static void loadItems() {
//        ItemRegistry.registerItem("gravitite_scythe", () -> new ScytheItem(AetherToolMaterials.GRAVITITE, ItemRegistry.getScytheSettings()));
//        ItemRegistry.registerItem("zanite_scythe", () -> new ScytheItem(AetherToolMaterials.ZANITE, ItemRegistry.getScytheSettings()));
//        ItemRegistry.registerItem("valkyrie_scythe", () -> new ScytheItem(AetherToolMaterials.VALKYRIE, ItemRegistry.getScytheSettings()));
//
//        ItemRegistry.registerItem("gravitite_machete", () -> new MacheteItem(AetherToolMaterials.GRAVITITE, ItemRegistry.getMacheteSettings()));
//        ItemRegistry.registerItem("zanite_machete", () -> new MacheteItem(AetherToolMaterials.ZANITE, ItemRegistry.getMacheteSettings()));
//        ItemRegistry.registerItem("valkyrie_machete", () -> new MacheteItem(AetherToolMaterials.VALKYRIE, ItemRegistry.getMacheteSettings()));
//    }
//
//}