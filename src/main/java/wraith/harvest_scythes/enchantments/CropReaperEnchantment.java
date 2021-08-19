package wraith.harvest_scythes.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;

public class CropReaperEnchantment extends Enchantment {

    public CropReaperEnchantment() {
        super(Enchantment.Rarity.COMMON, CustomEnchantmentTargets.SCYTHE_TARGET, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMaxLevel() {
        return 4;
    }

}
