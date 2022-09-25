package dev.wuffs.blocks.block;

import dev.wuffs.blocks.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.material.Material;

public class BambooStairsBlock extends StairBlock
{

    public BambooStairsBlock() {
        super(Blocks.BUNDLE.get().defaultBlockState(), Properties.of(Material.BAMBOO)
                .strength(1.0F, 2.0F)
                .sound(SoundType.BAMBOO));
    }
}
