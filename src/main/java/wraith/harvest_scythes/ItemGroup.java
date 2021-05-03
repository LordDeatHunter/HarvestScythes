package wraith.harvest_scythes;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;

public class ItemGroup {

    public static final net.minecraft.item.ItemGroup SCYTHES = FabricItemGroupBuilder.create(Utils.ID("scythes")).icon(() -> new ItemStack(ItemRegistry.ITEMS.get("diamond_scythe"))).build();
    public static final net.minecraft.item.ItemGroup MACHETES = FabricItemGroupBuilder.create(Utils.ID("machetes")).icon(() -> new ItemStack(ItemRegistry.ITEMS.get("diamond_machete"))).build();
}

