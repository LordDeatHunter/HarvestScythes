package wraith.harvest_scythes.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;

public class CropReaperEnchantment extends Enchantment {

    public CropReaperEnchantment() {
        super(Rarity.COMMON, CustomEnchantmentTargets.SCYTHE_TARGET, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMaxLevel() {
        return 4;
    }

}
