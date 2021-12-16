package wraith.harvest_scythes.support;

import net.minecraft.util.Identifier;
import net.tigereye.hellishmaterials.HellishMaterials;
import net.tigereye.hellishmaterials.items.BatetMaterial;
import net.tigereye.hellishmaterials.items.LussMaterial;
import net.tigereye.hellishmaterials.items.VuldMaterial;
import wraith.harvest_scythes.HarvestScythes;
import wraith.harvest_scythes.util.HSUtils;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;
import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;
import wraith.harvest_scythes.registry.ItemRegistry;

public final class HellishMaterialsSupport {

    private HellishMaterialsSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("batet_scythe", new ScytheItem(new BatetMaterial(), ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("luss_scythe", new ScytheItem(new LussMaterial(), ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("vuld_scythe", new ScytheItem(new VuldMaterial(), ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("batet_machete", new MacheteItem(new BatetMaterial(), ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("luss_machete", new MacheteItem(new LussMaterial(), ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("vuld_machete", new MacheteItem(new VuldMaterial(), ItemRegistry.getMacheteSettings()));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("batet_scythe", new ShapedRecipeMaterials(new Identifier(HellishMaterials.MODID, "batet_gem"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, HSUtils.ID("batet_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("luss_scythe", new ShapedRecipeMaterials(new Identifier(HellishMaterials.MODID, "luss_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, HSUtils.ID("luss_scythe")));
        RecipesGenerator.SMITHING_RECIPES.put("vuld_scythe", new SmithingRecipeMaterials(HSUtils.ID("diamond_scythe"), new Identifier(HellishMaterials.MODID, "vuld"), "item", "item", HSUtils.ID("vuld_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("batet_machete", new ShapedRecipeMaterials(new Identifier(HellishMaterials.MODID, "batet_gem"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, HSUtils.ID("batet_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("luss_machete", new ShapedRecipeMaterials(new Identifier(HellishMaterials.MODID, "luss_ingot"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, HSUtils.ID("luss_machete")));
        RecipesGenerator.SMITHING_RECIPES.put("vuld_machete", new SmithingRecipeMaterials(HSUtils.ID("diamond_machete"), new Identifier(HellishMaterials.MODID, "vuld"), "item", "item", HSUtils.ID("vuld_machete")));
    }

}