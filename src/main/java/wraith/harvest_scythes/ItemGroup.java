package wraith.harvest_scythes;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroup {
    public static final net.minecraft.item.ItemGroup SCYTHES = FabricItemGroupBuilder.create(Utils.ID("scythes")).icon(() -> new ItemStack(ItemRegistry.ITEMS.get("diamond_scythe"))).build();
}
