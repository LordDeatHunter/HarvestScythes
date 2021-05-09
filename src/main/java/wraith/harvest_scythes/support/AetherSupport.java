package wraith.harvest_scythes.support;

import com.aether.items.utils.AetherTiers;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import wraith.harvest_scythes.*;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class AetherSupport {

    private AetherSupport() {}

    public static void loadItems() {
        ItemRegistry.ITEMS.put("gravitite_scythe", new ScytheTool(AetherTiers.Gravitite.getDefaultTier(), new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("zanite_scythe", new ScytheTool(AetherTiers.Zanite.getDefaultTier(), new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("valkyrie_scythe", new ScytheTool(AetherTiers.Valkyrie.getDefaultTier(), new Item.Settings().group(ItemGroup.SCYTHES)));

        ItemRegistry.ITEMS.put("gravitite_machete", new MacheteItem(AetherTiers.Gravitite.getDefaultTier(), new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("zanite_machete", new MacheteItem(AetherTiers.Zanite.getDefaultTier(), new Item.Settings().group(ItemGroup.MACHETES)));
        ItemRegistry.ITEMS.put("valkyrie_machete", new MacheteItem(AetherTiers.Valkyrie.getDefaultTier(), new Item.Settings().group(ItemGroup.MACHETES)));
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("gravitite_scythe", new ShapedRecipeMaterials(new Identifier("the_aether", "gravitite_gemstone"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("gravitite_scythe")));
        RecipesGenerator.SHAPED_SCYTHE_RECIPES.put("zanite_scythe", new ShapedRecipeMaterials(new Identifier("the_aether", "zanite_gemstone"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("zanite_scythe")));

        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("gravitite_machete", new ShapedRecipeMaterials(new Identifier("the_aether", "gravitite_gemstone"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("gravitite_machete")));
        RecipesGenerator.SHAPED_MACHETE_RECIPES.put("zanite_machete", new ShapedRecipeMaterials(new Identifier("the_aether", "zanite_gemstone"), HarvestScythes.STICK, "item", HarvestScythes.STICK_TYPE, Utils.ID("zanite_machete")));
    }

}
