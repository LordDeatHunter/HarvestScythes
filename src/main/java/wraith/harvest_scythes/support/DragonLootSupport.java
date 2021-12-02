package wraith.harvest_scythes.support;

import net.dragonloot.item.DragonToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class DragonLootSupport {

    private DragonLootSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("dragon_scythe", new ScytheItem(DragonToolMaterial.getInstance(), ItemRegistry.SCYTHE_SETTINGS));

        ItemRegistry.registerItem("dragon_machete", new MacheteItem(DragonToolMaterial.getInstance(), ItemRegistry.MACHETE_SETTINGS));
    }

    public static void loadRecipes() {
        RecipesGenerator.SMITHING_RECIPES.put("dragon_scythe", new SmithingRecipeMaterials(Utils.ID("netherite_scythe"), new Identifier("dragonloot", "dragon_scale"), "item", "item", Utils.ID("dragon_scythe")));

        RecipesGenerator.SMITHING_RECIPES.put("dragon_machete", new SmithingRecipeMaterials(Utils.ID("netherite_machete"), new Identifier("dragonloot", "dragon_scale"), "item", "item", Utils.ID("dragon_machete")));
    }

}
