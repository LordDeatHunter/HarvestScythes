package wraith.harvest_scythes;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ItemTags {
    public static Tag<Item> SCYTHES = TagRegistry.item(new Identifier("c", "scythes"));
}
