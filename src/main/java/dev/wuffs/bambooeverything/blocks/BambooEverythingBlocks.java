package dev.wuffs.bambooeverything.blocks;

import dev.wuffs.bambooeverything.BambooEverything;
import dev.wuffs.bambooeverything.blocks.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BambooEverythingBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BambooEverything.MOD_ID);

    public static final RegistryObject<Block> BUNDLE = BLOCKS.register("bamboo_bundle", BambooBundleBlock::new);
    public static final RegistryObject<Block> DOOR = BLOCKS.register("bamboo_door", BambooDoorBlock::new);
    public static final RegistryObject<Block> FENCE = BLOCKS.register("bamboo_fence", BambooFenceBlock::new);
    public static final RegistryObject<Block> FENCEGATE = BLOCKS.register("bamboo_fence_gate", BambooFenceGateBlock::new);
    public static final RegistryObject<Block> LADDER = BLOCKS.register("bamboo_ladder", BambooLadderBlock::new);
    public static final RegistryObject<Block> SLAB = BLOCKS.register("bamboo_slab", BambooSlabBlock::new);
    public static final RegistryObject<Block> STAIRS = BLOCKS.register("bamboo_stairs", BambooStairsBlock::new);
    public static final RegistryObject<Block> TRAPDOOR = BLOCKS.register("bamboo_trapdoor", BambooTrapDoorBlock::new);

}
