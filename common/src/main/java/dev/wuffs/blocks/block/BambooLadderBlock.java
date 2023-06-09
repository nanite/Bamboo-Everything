package dev.wuffs.blocks.block;

import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.SoundType;

public class BambooLadderBlock extends LadderBlock
{

    public BambooLadderBlock() {
        super(Properties.of()
                .strength(0.4f)
                .sound(SoundType.BAMBOO)
                .noOcclusion()
        );
    }
}
