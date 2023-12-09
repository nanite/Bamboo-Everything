package dev.wuffs.blocks.block;

import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BambooFenceGateBlock extends FenceGateBlock
{

    public BambooFenceGateBlock() {
        super(WoodType.BAMBOO, Properties.of()
                .strength(2.0f, 3.0f)
                .sound(SoundType.BAMBOO)
        );
    }
}
