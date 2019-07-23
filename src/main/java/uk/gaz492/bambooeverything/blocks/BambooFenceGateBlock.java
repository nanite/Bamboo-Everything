package uk.gaz492.bambooeverything.blocks;

import net.minecraft.block.FenceGateBlock;

public class BambooFenceGateBlock extends FenceGateBlock {

//    public static final BooleanProperty WATERLOGGED;

    public BambooFenceGateBlock(Settings settings){
        super(settings);
//        setDefaultState(this.getDefaultState().with(WATERLOGGED, false));
    }

//    @Override
//    public boolean isTranslucent(BlockState blockState_1, BlockView blockView_1, BlockPos blockPos_1) {
//        return !blockState_1.get(WATERLOGGED);
//    }
//
//    @Override
//    public FluidState getFluidState(BlockState blockState_1) {
//        return blockState_1.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(blockState_1);
//    }
//
//    static {
//        WATERLOGGED = Properties.WATERLOGGED;
//    }
}
