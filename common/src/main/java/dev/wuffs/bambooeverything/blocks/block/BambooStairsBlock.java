package dev.wuffs.bambooeverything.blocks.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.material.Material;

import static dev.wuffs.bambooeverything.blocks.BambooEverythingBlocks.BUNDLE;

public class BambooStairsBlock extends StairBlock
{

    public BambooStairsBlock() {
        super(BUNDLE.get().defaultBlockState(), Properties.of(Material.BAMBOO)
                .strength(1.0F, 2.0F)
                .sound(SoundType.BAMBOO));
    }
}
