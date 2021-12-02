package wraith.harvest_scythes.enchantment;

import net.minecraft.item.Item;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.mixin.EnchantmentTargetMixin;

@SuppressWarnings("unused")
public class MacheteTarget extends EnchantmentTargetMixin {

    @Override
    public boolean isAcceptableItem(Item item) {
        return item instanceof MacheteItem;
    }

}
