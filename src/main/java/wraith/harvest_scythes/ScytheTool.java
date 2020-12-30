package wraith.harvest_scythes;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class ScytheTool extends HoeItem {

    protected int harvestRadius;
    protected boolean circleHarvest;

    public ScytheTool(ToolMaterial material, int attackDamage, float attackSpeed, int harvestRadius, boolean circleHarvest, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.harvestRadius = harvestRadius;
        this.circleHarvest = circleHarvest;
    }

    public int getHarvestRadius() {
        return this.harvestRadius;
    }
    public boolean hasCircleHarvset() {
        return this.circleHarvest;
    }
}
