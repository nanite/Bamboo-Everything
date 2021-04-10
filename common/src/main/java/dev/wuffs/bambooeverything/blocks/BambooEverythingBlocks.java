package dev.wuffs.bambooeverything.blocks;

import dev.wuffs.bambooeverything.BambooEverything;
import dev.wuffs.bambooeverything.blocks.block.*;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public class BambooEverythingBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BambooEverything.MOD_ID, Registry.BLOCK_REGISTRY);

    public static final RegistrySupplier<Block> BUNDLE = BLOCKS.register("bamboo_bundle", BambooBundleBlock::new);
    public static final RegistrySupplier<Block> DOOR = BLOCKS.register("bamboo_door", BambooDoorBlock::new);
    public static final RegistrySupplier<Block> FENCE = BLOCKS.register("bamboo_fence", BambooFenceBlock::new);
    public static final RegistrySupplier<Block> FENCEGATE = BLOCKS.register("bamboo_fence_gate", BambooFenceGateBlock::new);
    public static final RegistrySupplier<Block> LADDER = BLOCKS.register("bamboo_ladder", BambooLadderBlock::new);
    public static final RegistrySupplier<Block> SLAB = BLOCKS.register("bamboo_slab", BambooSlabBlock::new);
    public static final RegistrySupplier<Block> STAIRS = BLOCKS.register("bamboo_stairs", BambooStairsBlock::new);
    public static final RegistrySupplier<Block> TRAPDOOR = BLOCKS.register("bamboo_trapdoor", BambooTrapDoorBlock::new);

    public static void register() {
        BLOCKS.register();
    }
}
