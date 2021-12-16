package wraith.harvest_scythes.support;

import net.id.aether.items.tools.AetherToolMaterials;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.item.MacheteItem;
import wraith.harvest_scythes.item.ScytheItem;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;
import wraith.harvest_scythes.registry.ItemRegistry;
import wraith.harvest_scythes.util.HSUtils;

public final class AetherSupport {

    private AetherSupport() {}

    public static void loadItems() {
        ItemRegistry.registerItem("gravitite_scythe", new ScytheItem(AetherToolMaterials.GRAVITITE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("zanite_scythe", new ScytheItem(AetherToolMaterials.ZANITE, ItemRegistry.getScytheSettings()));
        ItemRegistry.registerItem("valkyrie_scythe", new ScytheItem(AetherToolMaterials.VALKYRIE, ItemRegistry.getScytheSettings()));

        ItemRegistry.registerItem("gravitite_machete", new MacheteItem(AetherToolMaterials.GRAVITITE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("zanite_machete", new MacheteItem(AetherToolMaterials.ZANITE, ItemRegistry.getMacheteSettings()));
        ItemRegistry.registerItem("valkyrie_machete", new MacheteItem(AetherToolMaterials.VALKYRIE, ItemRegistry.getMacheteSettings()));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("gravitite_scythe", new ShapedRecipeMaterials(new Identifier("the_aether", "gravitite_gemstone"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, HSUtils.ID("gravitite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("zanite_scythe", new ShapedRecipeMaterials(new Identifier("the_aether", "zanite_gemstone"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, HSUtils.ID("zanite_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("gravitite_machete", new ShapedRecipeMaterials(new Identifier("the_aether", "gravitite_gemstone"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, HSUtils.ID("gravitite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("zanite_machete", new ShapedRecipeMaterials(new Identifier("the_aether", "zanite_gemstone"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, HSUtils.ID("zanite_machete")));
    }

}