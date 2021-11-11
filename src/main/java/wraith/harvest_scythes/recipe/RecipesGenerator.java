package wraith.harvest_scythes.recipe;

import com.google.gson.JsonObject;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import wraith.harvest_scythes.Utils;

import java.util.HashMap;

public class RecipesGenerator {

    public static HashMap<String, ShapedRecipeMaterials> SHAPED_SCYTHE_RECIPES = new HashMap<>();
    public static HashMap<String, ShapedRecipeMaterials> SHAPED_MACHETE_RECIPES = new HashMap<>();
    public static HashMap<String, SmithingRecipeMaterials> SMITHING_RECIPES = new HashMap<>();

    public static HashMap<Identifier, JsonObject> RECIPES = new HashMap<>();


    public static void createShapedRecipes() {

        SHAPED_SCYTHE_RECIPES.put("wooden_scythe", new ShapedRecipeMaterials(new Identifier("planks"), Registry.ITEM.getId(Items.STICK), "tag", "item", Utils.ID("wooden_scythe")));
        SHAPED_SCYTHE_RECIPES.put("stone_scythe", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.COBBLESTONE), Registry.ITEM.getId(Items.STICK), "item", "item", Utils.ID("stone_scythe")));
        SHAPED_SCYTHE_RECIPES.put("iron_scythe", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.IRON_INGOT), Registry.ITEM.getId(Items.STICK), "item", "item", Utils.ID("iron_scythe")));
        SHAPED_SCYTHE_RECIPES.put("golden_scythe", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.GOLD_INGOT), Registry.ITEM.getId(Items.STICK), "item", "item", Utils.ID("golden_scythe")));
        SHAPED_SCYTHE_RECIPES.put("diamond_scythe", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.DIAMOND), Registry.ITEM.getId(Items.STICK), "item", "item", Utils.ID("diamond_scythe")));
        SMITHING_RECIPES.put("netherite_scythe", new SmithingRecipeMaterials(Utils.ID("diamond_scythe"), Registry.ITEM.getId(Items.NETHERITE_INGOT), "item", "item", Utils.ID("netherite_scythe")));


        SHAPED_MACHETE_RECIPES.put("wooden_machete", new ShapedRecipeMaterials(new Identifier("planks"), Registry.ITEM.getId(Items.STICK), "tag", "item", Utils.ID("wooden_machete")));
        SHAPED_MACHETE_RECIPES.put("stone_machete", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.COBBLESTONE), Registry.ITEM.getId(Items.STICK), "item", "item", Utils.ID("stone_machete")));
        SHAPED_MACHETE_RECIPES.put("iron_machete", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.IRON_INGOT), Registry.ITEM.getId(Items.STICK), "item", "item", Utils.ID("iron_machete")));
        SHAPED_MACHETE_RECIPES.put("golden_machete", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.GOLD_INGOT), Registry.ITEM.getId(Items.STICK), "item", "item", Utils.ID("golden_machete")));
        SHAPED_MACHETE_RECIPES.put("diamond_machete", new ShapedRecipeMaterials(Registry.ITEM.getId(Items.DIAMOND), Registry.ITEM.getId(Items.STICK), "item", "item", Utils.ID("diamond_machete")));
        SMITHING_RECIPES.put("netherite_machete", new SmithingRecipeMaterials(Utils.ID("diamond_machete"), Registry.ITEM.getId(Items.NETHERITE_INGOT), "item", "item", Utils.ID("netherite_machete")));
    }

    public static void addRecipes() {
        for (var recipe : SHAPED_SCYTHE_RECIPES.entrySet()) {
            var material = recipe.getValue();
            RECIPES.put(Utils.ID(recipe.getKey()), ShapedRecipeGenerator.generateScytheJson(material.headItem, material.handleItem, material.headType, material.handleType, material.output));
        }
        for (var recipe : SMITHING_RECIPES.entrySet()) {
            var material = recipe.getValue();
            RECIPES.put(Utils.ID(recipe.getKey()), ShapedRecipeGenerator.generateSmithingJson(material.baseItem, material.additionItem, material.baseType, material.additionType, material.output));
        }
        for (var recipe : SHAPED_MACHETE_RECIPES.entrySet()) {
            var material = recipe.getValue();
            RECIPES.put(Utils.ID(recipe.getKey()), ShapedRecipeGenerator.generateMacheteJson(material.headItem, material.handleItem, material.headType, material.handleType, material.output));
        }
    }
}
