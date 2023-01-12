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
//        ItemRegistry.registerItem("gravitite_scythe", () -> new ScytheItem(AetherToolMaterials.GRAVITITE, new FabricItemSettings()));
//        ItemRegistry.registerItem("zanite_scythe", () -> new ScytheItem(AetherToolMaterials.ZANITE, new FabricItemSettings()));
//        ItemRegistry.registerItem("valkyrie_scythe", () -> new ScytheItem(AetherToolMaterials.VALKYRIE, new FabricItemSettings()));
//
//        ItemRegistry.registerItem("gravitite_machete", () -> new MacheteItem(AetherToolMaterials.GRAVITITE, new FabricItemSettings()));
//        ItemRegistry.registerItem("zanite_machete", () -> new MacheteItem(AetherToolMaterials.ZANITE, new FabricItemSettings()));
//        ItemRegistry.registerItem("valkyrie_machete", () -> new MacheteItem(AetherToolMaterials.VALKYRIE, new FabricItemSettings()));
//    }
//
//}