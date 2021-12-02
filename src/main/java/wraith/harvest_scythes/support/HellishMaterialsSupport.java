/*
package wraith.harvest_scythes.support;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.tigereye.hellishmaterials.HellishMaterials;
import net.tigereye.hellishmaterials.items.BatetMaterial;
import net.tigereye.hellishmaterials.items.LussMaterial;
import net.tigereye.hellishmaterials.items.VuldMaterial;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;
import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;

public final class HellishMaterialsSupport {

    private HellishMaterialsSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("batet_scythe", new ScytheTool(new BatetMaterial(), new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("luss_scythe", new ScytheTool(new LussMaterial(), new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("vuld_scythe", new ScytheTool(new VuldMaterial(), new FabricItemSettings().group(HSItemGroups.SCYTHES)));

        ItemRegistry.registerItem("batet_machete", new MacheteItem(new BatetMaterial(), new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("luss_machete", new MacheteItem(new LussMaterial(), new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("vuld_machete", new MacheteItem(new VuldMaterial(), new FabricItemSettings().group(HSItemGroups.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("batet_scythe", new ShapedRecipeMaterials(new Identifier(HellishMaterials.MODID, "batet_gem"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("batet_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("luss_scythe", new ShapedRecipeMaterials(new Identifier(HellishMaterials.MODID, "luss_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("luss_scythe")));
        RecipesGenerator.SMITHING_RECIPES.put("vuld_scythe", new SmithingRecipeMaterials(Utils.ID("diamond_scythe"), new Identifier(HellishMaterials.MODID, "vuld"), "item", "item", Utils.ID("vuld_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("batet_machete", new ShapedRecipeMaterials(new Identifier(HellishMaterials.MODID, "batet_gem"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("batet_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("luss_machete", new ShapedRecipeMaterials(new Identifier(HellishMaterials.MODID, "luss_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("luss_machete")));
        RecipesGenerator.SMITHING_RECIPES.put("vuld_machete", new SmithingRecipeMaterials(Utils.ID("diamond_machete"), new Identifier(HellishMaterials.MODID, "vuld"), "item", "item", Utils.ID("vuld_machete")));
    }

}
 */