package net.amteox.tutorialmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ModSaplingBlock extends SaplingBlock {

    private final Block blockToPlaceOn;

    public ModSaplingBlock(SaplingGenerator generator, Settings settings, Block blockToPlaceOn) {
        super(generator, settings);
        this.blockToPlaceOn = blockToPlaceOn;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(this.blockToPlaceOn);
    }
}
