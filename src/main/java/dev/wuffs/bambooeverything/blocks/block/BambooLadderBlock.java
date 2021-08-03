package dev.wuffs.bambooeverything.blocks.block;

import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BambooLadderBlock extends LadderBlock
{

    public BambooLadderBlock() {
        super(Properties.of(Material.BAMBOO)
                .strength(0.4f)
                .sound(SoundType.BAMBOO)
                .noOcclusion()
        );
    }
}
