package uk.gaz492.bambooeverything.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BambooLadderBlock extends LadderBlock {
    public BambooLadderBlock() {
        super(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.4F).sound(SoundType.LADDER).nonOpaque());
    }
}
