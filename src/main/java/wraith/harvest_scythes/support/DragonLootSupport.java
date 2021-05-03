package wraith.harvest_scythes.support;

import net.dragonloot.item.DragonToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;

public class DragonLootSupport {

    private DragonLootSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("dragon_scythe", new ScytheTool(DragonToolMaterial.getInstance(), new Item.Settings().group(ItemGroup.SCYTHES)));

        ItemRegistry.ITEMS.put("dragon_machete", new MacheteItem(DragonToolMaterial.getInstance(), new Item.Settings().group(ItemGroup.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SMITHING_RECIPES.put("dragon_scythe", new SmithingRecipeMaterials(Utils.ID("netherite_scythe"), new Identifier("dragonloot", "dragon_scale"), "item", "item", Utils.ID("dragon_scythe")));

        RecipesGenerator.SMITHING_RECIPES.put("dragon_machete", new SmithingRecipeMaterials(Utils.ID("netherite_machete"), new Identifier("dragonloot", "dragon_scale"), "item", "item", Utils.ID("dragon_machete")));
    }

}
