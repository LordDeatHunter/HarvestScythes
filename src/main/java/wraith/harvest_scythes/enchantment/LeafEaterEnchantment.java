package wraith.harvest_scythes.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;

public class LeafEaterEnchantment extends Enchantment {

    public LeafEaterEnchantment() {
        super(Rarity.COMMON, CustomEnchantmentTargets.MACHETE_TARGET, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMaxLevel() {
        return 4;
    }

}
