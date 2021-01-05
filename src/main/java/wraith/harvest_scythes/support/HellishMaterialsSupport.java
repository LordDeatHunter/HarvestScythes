package wraith.harvest_scythes.support;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.tigereye.hellishmaterials.HellishMaterials;
import net.tigereye.hellishmaterials.items.BatetMaterial;
import net.tigereye.hellishmaterials.items.LussMaterial;
import net.tigereye.hellishmaterials.items.VuldMaterial;
import wraith.harvest_scythes.HarvestScythes;
import wraith.harvest_scythes.ItemGroup;
import wraith.harvest_scythes.ItemRegistry;
import wraith.harvest_scythes.ScytheTool;
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
        RecipesGenerator.SHAPED_RECIPES.put("batet_scythe", new ShapedRecipeMaterials(new Identifier(HellishMaterials.MODID, "batet_gem"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "batet_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("luss_scythe", new ShapedRecipeMaterials(new Identifier(HellishMaterials.MODID, "luss_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "luss_scythe")));

        RecipesGenerator.SMITHING_RECIPES.put("vuld_scythe", new SmithingRecipeMaterials(new Identifier(HarvestScythes.MOD_ID, "diamond_scythe"), new Identifier(HellishMaterials.MODID, "vuld"), "item", "item", new Identifier(HarvestScythes.MOD_ID, "vuld_scythe")));
    }

}
