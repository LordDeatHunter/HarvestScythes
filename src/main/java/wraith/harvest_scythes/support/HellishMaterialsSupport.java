//package wraith.harvest_scythes.support;
//
//import net.tigereye.hellishmaterials.items.batet.BatetMaterial;
//import net.tigereye.hellishmaterials.items.luss.LussMaterial;
//import net.tigereye.hellishmaterials.items.vuld.tools.VuldMaterial;
//import wraith.harvest_scythes.item.MacheteItem;
//import wraith.harvest_scythes.item.ScytheItem;
//import wraith.harvest_scythes.registry.ItemRegistry;
//
//public final class HellishMaterialsSupport {
//
//    private HellishMaterialsSupport() {}
//
//    public static void loadItems() {
//        ItemRegistry.registerItem("batet_scythe", () -> new ScytheItem(new BatetMaterial(), ItemRegistry.getScytheSettings()));
//        ItemRegistry.registerItem("luss_scythe", () -> new ScytheItem(new LussMaterial(), ItemRegistry.getScytheSettings()));
//        ItemRegistry.registerItem("vuld_scythe", () -> new ScytheItem(new VuldMaterial(), ItemRegistry.getScytheSettings()));
//
//        ItemRegistry.registerItem("batet_machete", () -> new MacheteItem(new BatetMaterial(), ItemRegistry.getMacheteSettings()));
//        ItemRegistry.registerItem("luss_machete", () -> new MacheteItem(new LussMaterial(), ItemRegistry.getMacheteSettings()));
//        ItemRegistry.registerItem("vuld_machete", () -> new MacheteItem(new VuldMaterial(), ItemRegistry.getMacheteSettings()));
//    }
//
//}