package dev.wuffs.bambooeverything.blocks;

import dev.wuffs.bambooeverything.BambooEverything;
import dev.wuffs.bambooeverything.blocks.block.BambooBundleBlock;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public class BambooEverythingBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BambooEverything.MOD_ID, Registry.BLOCK_REGISTRY);

    public static final RegistrySupplier<Block> BUNDLE = BLOCKS.register("bundle", BambooBundleBlock::new);

    public static void register() {
        BLOCKS.register();
    }
}
