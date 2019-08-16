package uk.gaz492.bambooeverything.blocks;

//import net.minecraft.block.DoorBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BambooDoorBlock extends DoorBlockOverride {
    public BambooDoorBlock() {
        super(Properties.create(Material.BAMBOO).hardnessAndResistance(3.0F,3.0F).sound(SoundType.BAMBOO));
    }
}
