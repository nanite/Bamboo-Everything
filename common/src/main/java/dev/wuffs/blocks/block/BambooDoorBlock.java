package dev.wuffs.blocks.block;

import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BambooDoorBlock extends DoorBlock
{

    public BambooDoorBlock() {
        super(BlockSetType.BAMBOO, Properties.of()
                .strength(3.0f, 3.0f)
                .sound(SoundType.BAMBOO)
        );
    }
}
