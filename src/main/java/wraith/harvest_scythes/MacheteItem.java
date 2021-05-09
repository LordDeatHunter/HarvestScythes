package wraith.harvest_scythes;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MacheteItem extends SwordItem {

    protected int harvestDepth;

    public MacheteItem(ToolMaterial material, int attackDamage, float attackSpeed, int harvestDepth, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.harvestDepth = harvestDepth;
    }

    public MacheteItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        this(material, attackDamage, attackSpeed, getDepth(material), settings);
    }

    public MacheteItem(ToolMaterial material, Settings settings) {
        this(material, 2, -2.0F, settings);
    }

    public MacheteItem(ToolMaterial material, int harvestDepth, Settings settings) {
        this(material, 2, -2.0F, harvestDepth, settings);
    }

    private static int getDepth(ToolMaterial material) {
        return (Math.min(10, material.getMiningLevel() + 1)) * 18;
    }

    public int getHarvestDepth() {
        return Math.min(240, this.harvestDepth);
    }

    @Override
    public boolean isEffectiveOn(BlockState state) {
        return super.isEffectiveOn(state) || state.getBlock() instanceof LeavesBlock;
    }

    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return super.canMine(state, world, pos, miner) || state.getBlock() instanceof LeavesBlock;
    }

}
