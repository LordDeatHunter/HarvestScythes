package wraith.harvest_scythes.support;

import com.github.theintfox.tools.PlatinumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;

public class SimplyPlatinumSupport {

    private SimplyPlatinumSupport() {}

    public static void loadItems() {
        PlatinumToolMaterial material = new PlatinumToolMaterial();
        ItemRegistry.ITEMS.put("platinum_scythe", new ScytheTool(material, new Item.Settings().group(ItemGroup.SCYTHES)));

        ItemRegistry.ITEMS.put("platinum_machete", new MacheteItem(material, new Item.Settings().group(ItemGroup.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SMITHING_RECIPES.put("sp_platinum_scythe", new SmithingRecipeMaterials(Utils.ID("golden_scythe"), new Identifier("simplyplatinum", "platinum_ingot"), "item", "item", Utils.ID("platinum_scythe")));

        RecipesGenerator.SMITHING_RECIPES.put("sp_platinum_machete", new SmithingRecipeMaterials(Utils.ID("golden_machete"), new Identifier("simplyplatinum", "platinum_ingot"), "item", "item", Utils.ID("platinum_machete")));
    }

}
