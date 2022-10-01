package dev.wuffs.items;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.wuffs.BambooEverything;
import dev.wuffs.blocks.Blocks;
import dev.wuffs.items.item.BambooRaftItem;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BambooEverything.MOD_ID, Registry.ITEM_REGISTRY);

    private static RegistrySupplier<Item> blockItem(String id, Supplier<Block> b) {
        return ITEMS.register(id, () -> new BlockItem(b.get(), new Item.Properties().tab(BambooEverything.CREATIVE_TAB)));
    }

    public static final RegistrySupplier<Item> BUNDLE = blockItem("bamboo_bundle", Blocks.BUNDLE);
    public static final RegistrySupplier<Item> DRY_BUNDLE = blockItem("dry_bamboo_bundle", Blocks.DRY_BUNDLE);

    public static final RegistrySupplier<Item> DOOR = blockItem("bamboo_door", Blocks.DOOR);
    public static final RegistrySupplier<Item> DRY_DOOR = blockItem("dry_bamboo_door", Blocks.DRY_DOOR);

    public static final RegistrySupplier<Item> FENCE = blockItem("bamboo_fence", Blocks.FENCE);
    public static final RegistrySupplier<Item> DRY_FENCE = blockItem("dry_bamboo_fence", Blocks.DRY_FENCE);

    public static final RegistrySupplier<Item> FENCEGATE = blockItem("bamboo_fence_gate", Blocks.FENCEGATE);
    public static final RegistrySupplier<Item> DRY_FENCEGATE = blockItem("dry_bamboo_fence_gate", Blocks.DRY_FENCEGATE);

    public static final RegistrySupplier<Item> LADDER = blockItem("bamboo_ladder", Blocks.LADDER);
    public static final RegistrySupplier<Item> DRY_LADDER = blockItem("dry_bamboo_ladder", Blocks.DRY_LADDER);

    public static final RegistrySupplier<Item> SLAB = blockItem("bamboo_slab", Blocks.SLAB);
    public static final RegistrySupplier<Item> DRY_SLAB = blockItem("dry_bamboo_slab", Blocks.DRY_SLAB);

    public static final RegistrySupplier<Item> STAIRS = blockItem("bamboo_stairs", Blocks.STAIRS);
    public static final RegistrySupplier<Item> DRY_STAIRS = blockItem("dry_bamboo_stairs", Blocks.DRY_STAIRS);

    public static final RegistrySupplier<Item> TRAPDOOR = blockItem("bamboo_trapdoor", Blocks.TRAPDOOR);
    public static final RegistrySupplier<Item> DRY_TRAPDOOR = blockItem("dry_bamboo_trapdoor", Blocks.DRY_TRAPDOOR);

    public static final RegistrySupplier<Item> RAFT = ITEMS.register("bamboo_raft", () -> new BambooRaftItem((new Item.Properties().stacksTo(1).tab(BambooEverything.CREATIVE_TAB))));

}
