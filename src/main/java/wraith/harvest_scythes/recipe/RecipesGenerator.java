package wraith.harvest_scythes.recipe;

import com.google.gson.JsonObject;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import wraith.harvest_scythes.HarvestScythes;

import java.util.HashMap;

public class RecipesGenerator {

    public static HashMap<String, ShapedRecipeMaterials> SHAPED_RECIPES = new HashMap<>();
    public static HashMap<String, SmithingRecipeMaterials> SMITHING_RECIPES = new HashMap<>();

    public static HashMap<Identifier, JsonObject> RECIPES = new HashMap<>();


    public static void createShapedRecipes() {
        SMITHING_RECIPES.put("netherite_scythe", new SmithingRecipeMaterials(new Identifier(HarvestScythes.MOD_ID, "diamond_scythe"), Registry.ITEM.getId(Items.NETHERITE_INGOT), "item", "item", new Identifier(HarvestScythes.MOD_ID, "netherite_scythe")));

        SHAPED_RECIPES.put("wooden_scythe", new ShapedRecipeMaterials(new Identifier("planks"), Registry.ITEM.getId(Items.STICK), "tag", "item", new Identifier(HarvestScythes.MOD_ID, "wooden_scythe")));
        SHAPED_RECIPES.put("stone_scythe", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.COBBLESTONE), Registry.ITEM.getId(Items.STICK), "item", "item", new Identifier(HarvestScythes.MOD_ID, "stone_scythe")));
        SHAPED_RECIPES.put("iron_scythe", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.IRON_INGOT), Registry.ITEM.getId(Items.STICK), "item", "item", new Identifier(HarvestScythes.MOD_ID, "iron_scythe")));
        SHAPED_RECIPES.put("golden_scythe", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.GOLD_INGOT), Registry.ITEM.getId(Items.STICK), "item", "item", new Identifier(HarvestScythes.MOD_ID, "golden_scythe")));
        SHAPED_RECIPES.put("diamond_scythe", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.DIAMOND), Registry.ITEM.getId(Items.STICK), "item", "item", new Identifier(HarvestScythes.MOD_ID, "diamond_scythe")));
    }

    public static void addRecipes() {
        for (String key : SHAPED_RECIPES.keySet()) {
            ShapedRecipeMaterials material = SHAPED_RECIPES.get(key);
            RECIPES.put(new Identifier(HarvestScythes.MOD_ID, key), ShapedRecipeGenerator.generateScytheJson(material.headItem, material.handleItem, material.headType, material.handleType, material.output));
        }
        for (String key : SMITHING_RECIPES.keySet()) {
            SmithingRecipeMaterials material = SMITHING_RECIPES.get(key);
            RECIPES.put(new Identifier(HarvestScythes.MOD_ID, key), ShapedRecipeGenerator.generateSmithingJson(material.baseItem, material.additionItem, material.baseType, material.additionType, material.output));
        }
    }
}
