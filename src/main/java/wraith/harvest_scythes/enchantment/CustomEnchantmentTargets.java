package wraith.harvest_scythes.enchantment;

import com.chocohead.mm.api.ClassTinkerers;
import net.minecraft.enchantment.EnchantmentTarget;

public final class CustomEnchantmentTargets {

    public static final EnchantmentTarget SCYTHE_TARGET = ClassTinkerers.getEnum(EnchantmentTarget.class, "HARVEST_SCYTHES_SCYTHE");
    public static final EnchantmentTarget MACHETE_TARGET = ClassTinkerers.getEnum(EnchantmentTarget.class, "HARVEST_SCYTHES_MACHETE");

}