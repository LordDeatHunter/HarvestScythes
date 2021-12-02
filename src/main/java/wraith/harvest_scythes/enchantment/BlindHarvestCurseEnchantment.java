package wraith.harvest_scythes.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;

public class BlindHarvestCurseEnchantment extends Enchantment {

    public BlindHarvestCurseEnchantment() {
        super(Rarity.VERY_RARE, CustomEnchantmentTargets.SCYTHE_TARGET, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 25;
    }

    @Override
    public int getMaxPower(int level) {
        return 50;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public boolean isCursed() {
        return true;
    }

}
