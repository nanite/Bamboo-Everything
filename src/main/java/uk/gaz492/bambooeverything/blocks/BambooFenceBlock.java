package uk.gaz492.bambooeverything.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BambooFenceBlock extends FenceBlock {
    public BambooFenceBlock() {
        super(Block.Properties.create(Material.BAMBOO).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.BAMBOO));
    }
}
