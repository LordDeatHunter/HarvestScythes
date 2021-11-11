package wraith.harvest_scythes;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class HSItemGroups {

    public static final ItemGroup SCYTHES = FabricItemGroupBuilder.create(Utils.ID("scythes"))
            .icon(() -> new ItemStack(ItemRegistry.get("diamond_scythe"))).build();
    public static final ItemGroup MACHETES = FabricItemGroupBuilder.create(Utils.ID("machetes"))
            .icon(() -> new ItemStack(ItemRegistry.get("diamond_machete"))).build();

}