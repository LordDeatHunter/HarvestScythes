package wraith.harvest_scythes;

import net.minecraft.util.Identifier;

public class SmithingRecipeMaterials {

    public Identifier baseItem;
    public Identifier additionItem;
    public String baseType;
    public String additionType;
    public Identifier output;

    public SmithingRecipeMaterials(Identifier baseItem, Identifier additionItem, String baseType, String additionType, Identifier output) {
        this.baseItem = baseItem;
        this.additionItem = additionItem;
        this.baseType = baseType;
        this.additionType = additionType;
        this.output = output;

    }


}
