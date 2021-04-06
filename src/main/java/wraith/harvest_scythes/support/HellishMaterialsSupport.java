package wraith.harvest_scythes.support;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.tigereye.hellishmaterials.HellishMaterials;
import net.tigereye.hellishmaterials.items.BatetMaterial;
import net.tigereye.hellishmaterials.items.LussMaterial;
import net.tigereye.hellishmaterials.items.VuldMaterial;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;
import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;

public class HellishMaterialsSupport {

    private HellishMaterialsSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("batet_scythe", new ScytheTool(new BatetMaterial(), 2, -2.75f, 2, true, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("luss_scythe", new ScytheTool(new LussMaterial(), 2, -2.75f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("vuld_scythe", new ScytheTool(new VuldMaterial(), 2, -2.75f, 6, false, new Item.Settings().group(ItemGroup.SCYTHES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("batet_scythe", new ShapedRecipeMaterials(new Identifier(HellishMaterials.MODID, "batet_gem"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("batet_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("luss_scythe", new ShapedRecipeMaterials(new Identifier(HellishMaterials.MODID, "luss_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("luss_scythe")));

        RecipesGenerator.SMITHING_RECIPES.put("vuld_scythe", new SmithingRecipeMaterials(Utils.ID("diamond_scythe"), new Identifier(HellishMaterials.MODID, "vuld"), "item", "item", Utils.ID("vuld_scythe")));
    }

}
