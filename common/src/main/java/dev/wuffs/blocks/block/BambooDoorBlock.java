package dev.wuffs.blocks.block;

import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BambooDoorBlock extends DoorBlock
{

    public BambooDoorBlock() {
        super(Properties.of(Material.BAMBOO)
                .strength(3.0f, 3.0f)
                .sound(SoundType.BAMBOO)
        );
    }
}
