package wraith.harvest_scythes.support;

import net.dragonloot.item.DragonToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.ItemGroup;
import wraith.harvest_scythes.ItemRegistry;
import wraith.harvest_scythes.ScytheTool;
import wraith.harvest_scythes.Utils;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;

public class DragonLootSupport {

    private DragonLootSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("dragon_scythe", new ScytheTool(DragonToolMaterial.getInstance(), 4, -2.75f, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SMITHING_RECIPES.put("dragon_scythe", new SmithingRecipeMaterials(Utils.ID("netherite_scythe"), new Identifier("dragonloot", "dragon_scale"), "item", "item", Utils.ID("dragon_scythe")));
    }

}
