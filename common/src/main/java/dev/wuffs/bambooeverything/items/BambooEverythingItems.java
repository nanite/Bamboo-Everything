package dev.wuffs.bambooeverything.items;

import dev.wuffs.bambooeverything.BambooEverything;
import dev.wuffs.bambooeverything.blocks.BambooEverythingBlocks;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class BambooEverythingItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BambooEverything.MOD_ID, Registry.ITEM_REGISTRY);

    private static RegistrySupplier<Item> blockItem(String id, Supplier<Block> b) {
        return ITEMS.register(id, () -> new BlockItem(b.get(), new Item.Properties().tab(BambooEverything.ITEM_GROUP)));
    }

    public static final RegistrySupplier<Item> BUNDLE = blockItem("bamboo_bundle", BambooEverythingBlocks.BUNDLE);
    public static final RegistrySupplier<Item> DOOR = blockItem("bamboo_door", BambooEverythingBlocks.DOOR);
    public static final RegistrySupplier<Item> FENCE = blockItem("bamboo_fence", BambooEverythingBlocks.FENCE);
    public static final RegistrySupplier<Item> FENCEGATE = blockItem("bamboo_fence_gate", BambooEverythingBlocks.FENCEGATE);
    public static final RegistrySupplier<Item> LADDER = blockItem("bamboo_ladder", BambooEverythingBlocks.LADDER);
    public static final RegistrySupplier<Item> SLAB = blockItem("bamboo_slab", BambooEverythingBlocks.SLAB);
    public static final RegistrySupplier<Item> STAIRS = blockItem("bamboo_stairs", BambooEverythingBlocks.STAIRS);
    public static final RegistrySupplier<Item> TRAPDOOR = blockItem("bamboo_trapdoor", BambooEverythingBlocks.TRAPDOOR);

    public static void register() {
        ITEMS.register();
    }
}
