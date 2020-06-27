package uk.gaz492.bambooeverything.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class FenceGateBlockOverride extends FenceGateBlock implements IWaterLoggable {

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public FenceGateBlockOverride(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(OPEN, false).with(POWERED, false).with(IN_WALL, false).with(WATERLOGGED, false));
    }

    @Override
    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        switch (type) {
            case LAND:
                return state.get(OPEN);
            case WATER:
                return state.get(WATERLOGGED);
            case AIR:
                return state.get(OPEN);
            default:
                return false;
        }
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (state.get(OPEN)) {
            state = state.with(OPEN, false);
            worldIn.setBlockState(pos, state, 10);
        } else {
            Direction direction = player.getHorizontalFacing();
            if (state.get(HORIZONTAL_FACING) == direction.getOpposite()) {
                state = state.with(HORIZONTAL_FACING, direction);
            }

            state = state.with(OPEN, true);
            worldIn.setBlockState(pos, state, 10);
            if (state.get(WATERLOGGED)) {
                worldIn.getPendingFluidTicks().scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
            }
        }

        worldIn.playEvent(player, state.get(OPEN) ? 1008 : 1014, pos, 0);
        return ActionResultType.SUCCESS;
    }

    @Override
    public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        if (!worldIn.isRemote) {
            boolean flag = worldIn.isBlockPowered(pos);
            if (state.get(POWERED) != flag) {
                worldIn.setBlockState(pos, state.with(POWERED, flag).with(OPEN, flag), 2);
                if (state.get(WATERLOGGED)) {
                    worldIn.getPendingFluidTicks().scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
                }
                if (state.get(OPEN) != flag) {
                    worldIn.playEvent((PlayerEntity) null, flag ? 1008 : 1014, pos, 0);
                }
            }

        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        World world = context.getWorld();
        BlockPos blockpos = context.getPos();
        FluidState ifluidstate = context.getWorld().getFluidState(context.getPos());
        boolean flag = world.isBlockPowered(blockpos);
        Direction direction = context.getPlacementHorizontalFacing();
        Direction.Axis direction$axis = direction.getAxis();
        boolean flag1 = direction$axis == Direction.Axis.Z && (this.isWall(world.getBlockState(blockpos.west())) || this.isWall(world.getBlockState(blockpos.east()))) || direction$axis == Direction.Axis.X && (this.isWall(world.getBlockState(blockpos.north())) || this.isWall(world.getBlockState(blockpos.south())));
        return this.getDefaultState().with(HORIZONTAL_FACING, direction).with(OPEN, flag).with(POWERED, flag).with(IN_WALL, flag1).with(WATERLOGGED, ifluidstate.getFluid() == Fluids.WATER);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING, OPEN, POWERED, IN_WALL, WATERLOGGED);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    private boolean isWall(BlockState blockState) {
        return blockState.getBlock().isIn(BlockTags.WALLS);
    }

    @Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.get(WATERLOGGED)) {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }
        Direction.Axis direction$axis = facing.getAxis();
        if (stateIn.get(HORIZONTAL_FACING).rotateY().getAxis() != direction$axis) {
            return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        } else {
//            boolean flag = this.isWall(facingState) || this.isWall(worldIn.getBlockState(currentPos.offset(facing.getOpposite())));
            boolean flag = this.isWall(facingState) || this.isWall(worldIn.getBlockState(currentPos.offset(facing.getOpposite())));
            return stateIn.with(IN_WALL, flag);
        }
    }
}
