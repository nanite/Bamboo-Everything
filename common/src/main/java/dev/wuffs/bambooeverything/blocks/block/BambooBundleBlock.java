package dev.wuffs.bambooeverything.blocks.block;

import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import org.jetbrains.annotations.Nullable;

public class BambooBlock extends Block
{

    protected BambooBlock() {
        super(Properties.of(Material.BARRIER, MaterialColor.COLOR_LIGHT_BLUE)
                .noOcclusion()
                .noDrops()
                .isViewBlocking((a, b, c) -> false)
                .strength(-1, 6000000F)
                .lightLevel(blockState -> 3)
                .emissiveRendering((blockState, blockGetter, blockPos) -> true)
        );
    }
}
