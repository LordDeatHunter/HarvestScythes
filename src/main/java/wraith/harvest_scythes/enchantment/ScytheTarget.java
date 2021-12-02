package wraith.harvest_scythes.enchantment;

import net.minecraft.item.Item;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.mixin.EnchantmentTargetMixin;

@SuppressWarnings("unused")
public class ScytheTarget extends EnchantmentTargetMixin {

    @Override
    public boolean isAcceptableItem(Item item) {
        return item instanceof ScytheItem;
    }

}
