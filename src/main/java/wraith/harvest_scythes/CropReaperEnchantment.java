package wraith.harvest_scythes;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;

public class CropReaperEnchantment extends Enchantment {

    public CropReaperEnchantment() {
        super(Enchantment.Rarity.COMMON, EnchantmentTarget.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof ScytheTool;
    }

    @Override
    public int getMaxLevel() {
        return 4;
    }

}
