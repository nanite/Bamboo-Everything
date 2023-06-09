package dev.wuffs.blocks.block;

import dev.wuffs.blocks.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;

public class BambooStairsBlock extends StairBlock
{

    public BambooStairsBlock() {
        super(Blocks.BUNDLE.get().defaultBlockState(), Properties.of()
                .strength(1.0F, 2.0F)
                .sound(SoundType.BAMBOO));
    }
}
