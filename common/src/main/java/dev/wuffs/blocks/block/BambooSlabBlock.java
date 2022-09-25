package dev.wuffs.blocks.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BambooSlabBlock extends SlabBlock
{

    public BambooSlabBlock() {
        super(Properties.of(Material.BAMBOO)
                .strength(1.0F, 2.0F)
                .sound(SoundType.BAMBOO)
        );
    }
}
