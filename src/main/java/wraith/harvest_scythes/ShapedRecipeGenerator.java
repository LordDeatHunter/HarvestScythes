package wraith.harvest_scythes;

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
        obj.addProperty(headType, headItem.toString());
        json.add("#", obj);

        obj = new JsonObject();
        obj.addProperty(handleType, handleItem.toString());
        json.add("|", obj);

        obj = new JsonObject();
        obj.addProperty("item", output.toString());
        obj.addProperty("count", 1);
        json.add("result", obj);

        return json;
    }

}
