package dev.wuffs.blocks.block;

import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SoundType;

public class BambooFenceBlock extends FenceBlock
{

    public BambooFenceBlock() {
        super(Properties.of()
                .strength(2.0f, 3.0f)
                .sound(SoundType.BAMBOO)
        );
    }
}
