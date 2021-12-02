package wraith.harvest_scythes.registry;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.registry.Registry;
import wraith.harvest_scythes.Utils;
import wraith.harvest_scythes.enchantment.CropReaperEnchantment;
import wraith.harvest_scythes.enchantment.LeafEaterEnchantment;

import java.util.HashMap;
import java.util.Map;

public final class EnchantsRegistry {

    private EnchantsRegistry() {}

    public static final HashMap<String, Enchantment> ENCHANTMENTS = new HashMap<>() {{
        put("crop_reaper", new CropReaperEnchantment());
        put("leaf_eater", new LeafEaterEnchantment());
    }};

    public static void registerEnchantments() {
        for (Map.Entry<String, Enchantment> enchantment : ENCHANTMENTS.entrySet()) {
            Registry.register(Registry.ENCHANTMENT, Utils.ID(enchantment.getKey()), enchantment.getValue());
        }
    }

}
