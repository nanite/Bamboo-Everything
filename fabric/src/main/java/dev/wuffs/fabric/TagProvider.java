package dev.wuffs.fabric;

import dev.wuffs.blocks.Blocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class TagProvider extends FabricTagProvider.BlockTagProvider {

    public TagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateTagBuilder(BlockTags.FENCES).add(Blocks.DRY_FENCE.get());
        getOrCreateTagBuilder(BlockTags.FENCES).add(Blocks.FENCE.get());
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(Blocks.DRY_FENCEGATE.get());
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(Blocks.FENCEGATE.get());
        getOrCreateTagBuilder(BlockTags.SLABS).add(Blocks.DRY_SLAB.get());
        getOrCreateTagBuilder(BlockTags.SLABS).add(Blocks.SLAB.get());
        getOrCreateTagBuilder(BlockTags.STAIRS).add(Blocks.DRY_STAIRS.get());
        getOrCreateTagBuilder(BlockTags.STAIRS).add(Blocks.STAIRS.get());
        getOrCreateTagBuilder(BlockTags.DOORS).add(Blocks.DRY_DOOR.get());
        getOrCreateTagBuilder(BlockTags.DOORS).add(Blocks.DOOR.get());
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS).add(Blocks.DRY_DOOR.get());
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS).add(Blocks.DOOR.get());
        getOrCreateTagBuilder(BlockTags.TRAPDOORS).add(Blocks.DRY_TRAPDOOR.get());
        getOrCreateTagBuilder(BlockTags.TRAPDOORS).add(Blocks.TRAPDOOR.get());
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS).add(Blocks.DRY_TRAPDOOR.get());
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS).add(Blocks.TRAPDOOR.get());
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(Blocks.DRY_FENCE.get());
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(Blocks.FENCE.get());
        getOrCreateTagBuilder(BlockTags.CLIMBABLE).add(Blocks.LADDER.get());
        getOrCreateTagBuilder(BlockTags.CLIMBABLE).add(Blocks.DRY_LADDER.get());
    }
}
