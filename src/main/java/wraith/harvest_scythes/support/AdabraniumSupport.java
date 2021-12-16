package wraith.harvest_scythes.support;

import com.brand.adabraniummod.content.stuff.materials.AdabraniumToolMaterials;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.util.HSUtils;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;
import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class AdabraniumSupport {

    private AdabraniumSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("adb_adamantium_scythe", new ScytheItem(AdabraniumToolMaterials.ADAMANTIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("adb_vibranium_scythe", new ScytheItem(AdabraniumToolMaterials.VIBRANIUM, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("adb_nether_scythe", new ScytheItem(AdabraniumToolMaterials.NETHER_BRICK, ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("adb_adamantium_machete", new MacheteItem(AdabraniumToolMaterials.ADAMANTIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("adb_vibranium_machete", new MacheteItem(AdabraniumToolMaterials.VIBRANIUM, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("adb_nether_machete", new MacheteItem(AdabraniumToolMaterials.NETHER_BRICK, ItemRegistry.getMacheteSettings()));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("adb_adamantium_scythe", new ShapedRecipeMaterials(new Identifier("adabraniummod", "adamantium_ingot"), new Identifier("adabraniummod", "adamantium_rod"), "item", "item", HSUtils.ID("adb_adamantium_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("adb_vibranium_scythe", new ShapedRecipeMaterials(new Identifier("adabraniummod", "vibranium_ingot"), new Identifier("adabraniummod", "obsidian_rod"), "item", "item", HSUtils.ID("adb_vibranium_scythe")));
        RecipesGenerator.SMITHING_RECIPES.put("adb_nether_scythe", new SmithingRecipeMaterials(HSUtils.ID("iron_scythe"), new Identifier("minecraft", "nether_brick"), "item", "item", HSUtils.ID("adb_nether_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("adb_adamantium_machete", new ShapedRecipeMaterials(new Identifier("adabraniummod", "adamantium_ingot"), new Identifier("adabraniummod", "adamantium_rod"), "item", "item", HSUtils.ID("adb_adamantium_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("adb_vibranium_machete", new ShapedRecipeMaterials(new Identifier("adabraniummod", "vibranium_ingot"), new Identifier("adabraniummod", "obsidian_rod"), "item", "item", HSUtils.ID("adb_vibranium_machete")));
        RecipesGenerator.SMITHING_RECIPES.put("adb_nether_machete", new SmithingRecipeMaterials(HSUtils.ID("iron_machete"), new Identifier("minecraft", "nether_brick"), "item", "item", HSUtils.ID("adb_nether_machete")));
    }

}
