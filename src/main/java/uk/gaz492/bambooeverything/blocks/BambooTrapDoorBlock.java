package uk.gaz492.bambooeverything.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.material.Material;

public class BambooTrapDoorBlock extends TrapDoorBlock {
    public BambooTrapDoorBlock() {
        super(Properties.create(Material.BAMBOO).hardnessAndResistance(3.0F,3.0F).sound(SoundType.BAMBOO));
    }
}
