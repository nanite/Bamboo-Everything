package dev.wuffs.blocks.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class BambooBundleBlock extends Block
{

    public BambooBundleBlock() {
        super(Properties.of()
                .strength(1.0f, 2.0f)
                .sound(SoundType.BAMBOO)
        );
    }
}
