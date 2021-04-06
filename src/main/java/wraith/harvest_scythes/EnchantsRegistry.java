package wraith.harvest_scythes;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class EnchantsRegistry {

    public static final HashMap<String, Enchantment> ENCHANTMENTS = new HashMap<String, Enchantment>(){{
        put("crop_reaper", new CropReaperEnchantment());
    }};

    public static void registerEnchantments() {
        for (Map.Entry<String, Enchantment> enchantment : ENCHANTMENTS.entrySet()) {
            Registry.register(Registry.ENCHANTMENT, Utils.ID(enchantment.getKey()), enchantment.getValue());
        }
    }

}
