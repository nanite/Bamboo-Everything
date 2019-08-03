package uk.gaz492.bambooeverything.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;

import static uk.gaz492.bambooeverything.BambooEverything.bambooBundleBlock;

public class BambooStairsBlock extends StairsBlock {
    public BambooStairsBlock() {
        super(bambooBundleBlock.getDefaultState(), Properties.create(Material.BAMBOO).hardnessAndResistance(1.0F, 2.0F).sound(SoundType.BAMBOO));
    }
}
