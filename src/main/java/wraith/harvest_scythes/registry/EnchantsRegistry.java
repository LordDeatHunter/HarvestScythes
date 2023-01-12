package wraith.harvest_scythes.registry;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import wraith.harvest_scythes.util.HSUtils;
import wraith.harvest_scythes.enchantment.BlindHarvestCurseEnchantment;
import wraith.harvest_scythes.enchantment.CropReaperEnchantment;
import wraith.harvest_scythes.enchantment.LeafEaterEnchantment;

import java.util.HashMap;
import java.util.Map;

public final class EnchantsRegistry {

    private EnchantsRegistry() {}

    public static final HashMap<String, Enchantment> ENCHANTMENTS = new HashMap<>() {{
        put("crop_reaper", new CropReaperEnchantment());
        put("leaf_eater", new LeafEaterEnchantment());
        put("blind_harvest_curse", new BlindHarvestCurseEnchantment());
    }};

    public static void registerEnchantments() {
        for (Map.Entry<String, Enchantment> enchantment : ENCHANTMENTS.entrySet()) {
            Registry.register(Registries.ENCHANTMENT, HSUtils.ID(enchantment.getKey()), enchantment.getValue());
        }
    }

}
