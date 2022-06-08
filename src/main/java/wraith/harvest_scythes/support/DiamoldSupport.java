//package wraith.harvest_scythes.support;
//
//import pl.vemu.diamold.material.DiamoldMaterial;
//import wraith.harvest_scythes.item.MacheteItem;
//import wraith.harvest_scythes.item.ScytheItem;
//import wraith.harvest_scythes.registry.ItemRegistry;
//
//public final class DiamoldSupport {
//
//    private DiamoldSupport() {
//    }
//
//    public static void loadItems() {
//        ItemRegistry.registerItem("diamold_scythe", () -> new ScytheItem(DiamoldMaterial.INSTANCE, ItemRegistry.getScytheSettings()));
//
//        ItemRegistry.registerItem("diamold_machete", () -> new MacheteItem(DiamoldMaterial.INSTANCE, ItemRegistry.getMacheteSettings()));
//    }
//
//}