/*
package wraith.harvest_scythes.support;

import net.froztigaming.fantasycraft.tools.bronze.DwarvenBronzeMaterial;
import net.froztigaming.fantasycraft.tools.mithril.MithrilMaterial;
import net.froztigaming.fantasycraft.tools.prismarine.TritonPrismarineMaterial;
import net.froztigaming.fantasycraft.tools.silver.ElvenSilverMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;
import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;

public final class FantasycraftSupport {

    private FantasycraftSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("elven_silver_scythe", new ScytheTool(ElvenSilverMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.SCYTHES)));
        ItemRegistry.registerItem("dwarven_bronze_scythe", new ScytheTool(DwarvenBronzeMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.SCYTHES)));
        ItemRegistry.registerItem("mithril_scythe", new ScytheTool(MithrilMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.SCYTHES)));
        ItemRegistry.registerItem("triton_prismarine_scythe", new ScytheTool(TritonPrismarineMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.SCYTHES)));

        ItemRegistry.registerItem("elven_silver_machete", new MacheteItem(ElvenSilverMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.MACHETES)));
        ItemRegistry.registerItem("dwarven_bronze_machete", new MacheteItem(DwarvenBronzeMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.MACHETES)));
        ItemRegistry.registerItem("mithril_machete", new MacheteItem(MithrilMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.MACHETES)));
        ItemRegistry.registerItem("triton_prismarine_machete", new MacheteItem(TritonPrismarineMaterial.INSTANCE, new FabricItemSettings().group(ItemGroup.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("elven_silver_scythe", new ShapedRecipeMaterials(new Identifier("fantasycraft", "silver_ingot"), new Identifier("fantasycraft", "stone_rod"), "item", "item", Utils.ID("elven_silver_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("dwarven_bronze_scythe", new ShapedRecipeMaterials(new Identifier("fantasycraft", "bronze_ingot"), new Identifier("fantasycraft", "stone_rod"), "item", "item", Utils.ID("dwarven_bronze_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("triton_prismarine_scythe", new ShapedRecipeMaterials(new Identifier("fantasycraft", "prismarine_ingot"), new Identifier("fantasycraft", "stone_rod"), "item", "item", Utils.ID("triton_prismarine_scythe")));
        RecipesGenerator.SMITHING_RECIPES.put("mithril_scythe", new SmithingRecipeMaterials(Utils.ID("netherite_scythe"), new Identifier("fantasycraft", "mithril_ingot"), "item", "item", Utils.ID("mithril_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("elven_silver_machete", new ShapedRecipeMaterials(new Identifier("fantasycraft", "silver_ingot"), new Identifier("fantasycraft", "stone_rod"), "item", "item", Utils.ID("elven_silver_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("dwarven_bronze_machete", new ShapedRecipeMaterials(new Identifier("fantasycraft", "bronze_ingot"), new Identifier("fantasycraft", "stone_rod"), "item", "item", Utils.ID("dwarven_bronze_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("triton_prismarine_machete", new ShapedRecipeMaterials(new Identifier("fantasycraft", "prismarine_ingot"), new Identifier("fantasycraft", "stone_rod"), "item", "item", Utils.ID("triton_prismarine_machete")));
        RecipesGenerator.SMITHING_RECIPES.put("mithril_machete", new SmithingRecipeMaterials(Utils.ID("netherite_scythe"), new Identifier("fantasycraft", "mithril_ingot"), "item", "item", Utils.ID("mithril_machete")));
    }

}
*/