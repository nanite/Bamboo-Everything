package dev.wuffs.bambooeverything.blocks.block;

import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BambooFenceGateBlock extends FenceGateBlock
{

    public BambooFenceGateBlock() {
        super(Properties.of(Material.BAMBOO)
                .strength(2.0f, 3.0f)
                .sound(SoundType.BAMBOO)
        );
    }
}
