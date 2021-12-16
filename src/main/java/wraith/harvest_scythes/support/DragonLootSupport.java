package wraith.harvest_scythes.support;

import net.dragonloot.item.DragonToolMaterial;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;
import wraith.harvest_scythes.registry.ItemRegistry;
import wraith.harvest_scythes.util.HSUtils;

public final class DragonLootSupport {

    private DragonLootSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("dragon_scythe", new ScytheItem(DragonToolMaterial.getInstance(), ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("dragon_machete", new MacheteItem(DragonToolMaterial.getInstance(), ItemRegistry.getMacheteSettings()));
    }

    public static void loadRecipes() {
        RecipesGenerator.SMITHING_RECIPES.put("dragon_scythe", new SmithingRecipeMaterials(HSUtils.ID("netherite_scythe"), new Identifier("dragonloot", "dragon_scale"), "item", "item", HSUtils.ID("dragon_scythe")));

        RecipesGenerator.SMITHING_RECIPES.put("dragon_machete", new SmithingRecipeMaterials(HSUtils.ID("netherite_machete"), new Identifier("dragonloot", "dragon_scale"), "item", "item", HSUtils.ID("dragon_machete")));
    }

}
