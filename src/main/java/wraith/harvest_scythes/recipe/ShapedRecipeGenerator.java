package wraith.harvest_scythes.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;

public class ShapedRecipeGenerator {

    public static JsonObject generateScytheJson(Identifier headItem, Identifier handleItem, String headType, String handleType, Identifier output) {
        JsonObject json = new JsonObject();

        json.addProperty("type", "minecraft:crafting_shaped");

        JsonArray jsonArray = new JsonArray();
        jsonArray.add("###");
        jsonArray.add("  |");
        jsonArray.add("  |");
        json.add("pattern", jsonArray);

        JsonObject obj = new JsonObject();
        JsonObject key = new JsonObject();

        obj.addProperty(headType, headItem.toString());
        key.add("#", obj);

        obj = new JsonObject();
        obj.addProperty(handleType, handleItem.toString());
        key.add("|", obj);

        json.add("key", key);

        obj = new JsonObject();
        obj.addProperty("item", output.toString());
        obj.addProperty("count", 1);
        json.add("result", obj);

        return json;
    }

    public static JsonObject generateSmithingJson(Identifier base, Identifier addition, String baseType, String additionType, Identifier output) {
        JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:smithing");

        JsonObject obj = new JsonObject();
        obj.addProperty(baseType, base.toString());
        json.add("base", obj);

        obj = new JsonObject();
        obj.addProperty(additionType, addition.toString());
        json.add("addition", obj);

        obj = new JsonObject();
        obj.addProperty("item", output.toString());
        json.add("result", obj);

        return json;
    }

}
