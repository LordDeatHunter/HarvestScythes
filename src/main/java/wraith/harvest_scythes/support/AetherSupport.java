package wraith.harvest_scythes.support;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.id.aether.items.tools.AetherToolMaterials;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public final class AetherSupport {

    private AetherSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("gravitite_scythe", new ScytheTool(AetherToolMaterials.GRAVITITE, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("zanite_scythe", new ScytheTool(AetherToolMaterials.ZANITE, new FabricItemSettings().group(HSItemGroups.SCYTHES)));
        ItemRegistry.registerItem("valkyrie_scythe", new ScytheTool(AetherToolMaterials.VALKYRIE, new FabricItemSettings().group(HSItemGroups.SCYTHES)));

        ItemRegistry.registerItem("gravitite_machete", new MacheteItem(AetherToolMaterials.GRAVITITE, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("zanite_machete", new MacheteItem(AetherToolMaterials.ZANITE, new FabricItemSettings().group(HSItemGroups.MACHETES)));
        ItemRegistry.registerItem("valkyrie_machete", new MacheteItem(AetherToolMaterials.VALKYRIE, new FabricItemSettings().group(HSItemGroups.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("gravitite_scythe", new ShapedRecipeMaterials(new Identifier("the_aether", "gravitite_gemstone"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("gravitite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("zanite_scythe", new ShapedRecipeMaterials(new Identifier("the_aether", "zanite_gemstone"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("zanite_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("gravitite_machete", new ShapedRecipeMaterials(new Identifier("the_aether", "gravitite_gemstone"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("gravitite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("zanite_machete", new ShapedRecipeMaterials(new Identifier("the_aether", "zanite_gemstone"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("zanite_machete")));
    }

}