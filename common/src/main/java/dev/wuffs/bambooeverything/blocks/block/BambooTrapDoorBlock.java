package dev.wuffs.bambooeverything.blocks.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.material.Material;

import static dev.wuffs.bambooeverything.blocks.BambooEverythingBlocks.BUNDLE;

public class BambooTrapDoorBlock extends TrapDoorBlock
{

    public BambooTrapDoorBlock() {
        super(Properties.of(Material.BAMBOO)
                .strength(3.0F, 3.0F)
                .sound(SoundType.BAMBOO));
    }
}
