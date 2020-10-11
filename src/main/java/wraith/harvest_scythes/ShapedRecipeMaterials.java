package wraith.harvest_scythes;

import net.minecraft.util.Identifier;

public class ShapedRecipeMaterials {

    public Identifier headItem;
    public Identifier handleItem;
    public String headType;
    public String handleType;
    public Identifier output;

    public ShapedRecipeMaterials(Identifier headItem, Identifier handleItem, String headType, String handleType, Identifier output) {
        this.headItem = headItem;
        this.handleItem = handleItem;
        this.headType = headType;
        this.handleType = handleType;
        this.output = output;

    }


}
