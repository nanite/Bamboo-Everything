package dev.wuffs.blocks.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BambooTrapDoorBlock extends TrapDoorBlock
{

    public BambooTrapDoorBlock() {
        super(BlockSetType.BAMBOO, Properties.of()
                .strength(3.0F, 3.0F)
                .sound(SoundType.BAMBOO)
        );
    }
}
