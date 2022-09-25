package dev.wuffs.blocks.block;

import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BambooFenceBlock extends FenceBlock
{

    public BambooFenceBlock() {
        super(Properties.of(Material.BAMBOO)
                .strength(2.0f, 3.0f)
                .sound(SoundType.BAMBOO)
        );
    }
}
