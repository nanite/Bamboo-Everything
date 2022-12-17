package dev.wuffs.blocks;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.wuffs.BambooEverything;
import dev.wuffs.blocks.block.*;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class Blocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BambooEverything.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> BUNDLE = BLOCKS.register("bamboo_bundle", BambooBundleBlock::new);
    public static final RegistrySupplier<Block> DRY_BUNDLE = BLOCKS.register("dry_bamboo_bundle", BambooBundleBlock::new);
    public static final RegistrySupplier<Block> DOOR = BLOCKS.register("bamboo_door", BambooDoorBlock::new);
    public static final RegistrySupplier<Block> DRY_DOOR = BLOCKS.register("dry_bamboo_door", BambooDoorBlock::new);
    public static final RegistrySupplier<Block> FENCE = BLOCKS.register("bamboo_fence", BambooFenceBlock::new);
    public static final RegistrySupplier<Block> DRY_FENCE = BLOCKS.register("dry_bamboo_fence", BambooFenceBlock::new);
    public static final RegistrySupplier<Block> FENCEGATE = BLOCKS.register("bamboo_fence_gate", BambooFenceGateBlock::new);
    public static final RegistrySupplier<Block> DRY_FENCEGATE = BLOCKS.register("dry_bamboo_fence_gate", BambooFenceGateBlock::new);
    public static final RegistrySupplier<Block> LADDER = BLOCKS.register("bamboo_ladder", BambooLadderBlock::new);
    public static final RegistrySupplier<Block> DRY_LADDER = BLOCKS.register("dry_bamboo_ladder", BambooLadderBlock::new);
    public static final RegistrySupplier<Block> SLAB = BLOCKS.register("bamboo_slab", BambooSlabBlock::new);
    public static final RegistrySupplier<Block> DRY_SLAB = BLOCKS.register("dry_bamboo_slab", BambooSlabBlock::new);
    public static final RegistrySupplier<Block> STAIRS = BLOCKS.register("bamboo_stairs", BambooStairsBlock::new);
    public static final RegistrySupplier<Block> DRY_STAIRS = BLOCKS.register("dry_bamboo_stairs", BambooStairsBlock::new);
    public static final RegistrySupplier<Block> TRAPDOOR = BLOCKS.register("bamboo_trapdoor", BambooTrapDoorBlock::new);
    public static final RegistrySupplier<Block> DRY_TRAPDOOR = BLOCKS.register("dry_bamboo_trapdoor", BambooTrapDoorBlock::new);

//    public static final RegistrySupplier<Block> BED = BLOCKS.register("bamboo_bed", () -> new BedBlock())
//    public static final RegistrySupplier<Block> DRY_BED = BLOCKS.register("dry_bamboo_bed", () -> new BedBlock())

//    public static final RegistrySupplier<Block> TIKI_TORCH = BLOCKS.register("tiki_torch", BambooTikiTorch::new);
//    public static final RegistrySupplier<Block> DRY_TIKI_TORCH = BLOCKS.register("dry_tiki_torch", BambooTikiTorch::new);
    public static final RegistrySupplier<Block> TORCH = BLOCKS.register("bamboo_torch", () -> new TorchBlock(
            BlockBehaviour.Properties.of(Material.DECORATION)
                    .noCollission()
                    .instabreak()
                    .lightLevel((x) -> 14)
                    .sound(SoundType.BAMBOO)
                    .noOcclusion()
            , ParticleTypes.FLAME));
    public static final RegistrySupplier<Block> WALL_TORCH = BLOCKS.register("bamboo_wall_torch", () -> new WallTorchBlock(
            BlockBehaviour.Properties.of(Material.DECORATION)
                    .noCollission()
                    .instabreak()
                    .lightLevel((x) -> 14)
                    .sound(SoundType.BAMBOO)
                    .dropsLike(TORCH.get())
                    .noOcclusion()
            , ParticleTypes.FLAME));

    public static final RegistrySupplier<Block> DRY_TORCH = BLOCKS.register("dry_bamboo_torch", () -> new TorchBlock(
            BlockBehaviour.Properties.of(Material.DECORATION)
                    .noCollission()
                    .instabreak()
                    .lightLevel((x) -> 14)
                    .sound(SoundType.BAMBOO)
                    .noOcclusion()
            , ParticleTypes.FLAME));
    public static final RegistrySupplier<Block> DRY_WALL_TORCH = BLOCKS.register("dry_bamboo_wall_torch", () -> new WallTorchBlock(
            BlockBehaviour.Properties.of(Material.DECORATION)
                    .noCollission()
                    .instabreak()
                    .lightLevel((x) -> 14)
                    .sound(SoundType.BAMBOO)
                    .dropsLike(DRY_TORCH.get())
                    .noOcclusion()
            , ParticleTypes.FLAME));

}
