package wraith.harvest_scythes;

import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.HashMap;

public class RecipesGenerator {

    public static ArrayList<ShapedRecipeMaterials> RECIPES = new ArrayList<>();

    public static HashMap<String, JsonObject> getRecipes() {

        for (ShapedRecipeMaterials material : RECIPES) {
            ShapedRecipeGenerator.generateScytheJson(material.headItem, material.handleItem, material.headType, material.handleType, material.output);
        }

    }


}
