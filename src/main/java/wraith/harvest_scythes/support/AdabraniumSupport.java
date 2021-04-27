package wraith.harvest_scythes.support;

import com.brand.adabraniummod.content.stuff.materials.AdabraniumToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;
import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;

public class AdabraniumSupport {

    private AdabraniumSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("adb_adamantium_scythe", new ScytheTool(AdabraniumToolMaterials.ADAMANTIUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("adb_vibranium_scythe", new ScytheTool(AdabraniumToolMaterials.VIBRANIUM, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("adb_nether_scythe", new ScytheTool(AdabraniumToolMaterials.NETHER_BRICK, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("adb_adamantium_scythe", new ShapedRecipeMaterials(new Identifier("adabraniummod", "adamantium_ingot"), new Identifier("adabraniummod", "adamantium_rod"), "item", "item", Utils.ID("adb_adamantium_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("adb_vibranium_scythe", new ShapedRecipeMaterials(new Identifier("adabraniummod", "vibranium_ingot"), new Identifier("adabraniummod", "obsidian_rod"), "item", "item", Utils.ID("adb_vibranium_scythe")));
        RecipesGenerator.SMITHING_RECIPES.put("adb_nether_scythe", new SmithingRecipeMaterials(Utils.ID("iron_scythe"), new Identifier("minecraft", "nether_brick"), "item", "item", Utils.ID("adb_nether_scythe")));
    }

}
