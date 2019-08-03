package uk.gaz492.bambooeverything.blocks;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BambooSlabBlock extends SlabBlock {
    public BambooSlabBlock() {
        super(Properties.create(Material.BAMBOO).hardnessAndResistance(1.0F, 2.0F).sound(SoundType.BAMBOO));
    }
}
