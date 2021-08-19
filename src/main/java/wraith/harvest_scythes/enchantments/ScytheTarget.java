package wraith.harvest_scythes.enchantments;

import net.minecraft.item.Item;
import wraith.harvest_scythes.ScytheTool;
import wraith.harvest_scythes.mixin.EnchantmentTargetMixin;

@SuppressWarnings("unused")
public class ScytheTarget extends EnchantmentTargetMixin {

    @Override
    public boolean isAcceptableItem(Item item) {
        return item instanceof ScytheTool;
    }

}
