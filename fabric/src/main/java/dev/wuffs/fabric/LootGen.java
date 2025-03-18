package dev.wuffs.fabric;

import dev.wuffs.blocks.Blocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class LootGen extends FabricBlockLootTableProvider {

    protected LootGen(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(Blocks.BUNDLE.get());
        dropSelf(Blocks.DRY_BUNDLE.get());
        add(Blocks.SLAB.get(), this.createSlabItemTable(Blocks.SLAB.get()));
        add(Blocks.DRY_SLAB.get(), this.createSlabItemTable(Blocks.DRY_SLAB.get()));
        dropSelf(Blocks.STAIRS.get());
        dropSelf(Blocks.DRY_STAIRS.get());
        dropSelf(Blocks.FENCE.get());
        dropSelf(Blocks.DRY_FENCE.get());
        dropSelf(Blocks.FENCEGATE.get());
        dropSelf(Blocks.DRY_FENCEGATE.get());
        add(Blocks.DOOR.get(), this.createDoorTable(Blocks.DOOR.get()));
        add(Blocks.DRY_DOOR.get(), this.createDoorTable(Blocks.DRY_DOOR.get()));
        dropSelf(Blocks.TRAPDOOR.get());
        dropSelf(Blocks.DRY_TRAPDOOR.get());
        dropSelf(Blocks.TORCH.get());
        dropSelf(Blocks.DRY_TORCH.get());
        dropSelf(Blocks.LADDER.get());
        dropSelf(Blocks.DRY_LADDER.get());
    }
}
