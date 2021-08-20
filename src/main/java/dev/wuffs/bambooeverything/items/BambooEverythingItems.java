package dev.wuffs.bambooeverything.items;

import dev.wuffs.bambooeverything.BambooEverything;
import dev.wuffs.bambooeverything.blocks.BambooEverythingBlocks;
import dev.wuffs.bambooeverything.entites.BambooEverythingEntities;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BambooEverythingItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BambooEverything.MOD_ID);

    private static RegistryObject<Item> blockItem(String id, Supplier<Block> b) {
        return ITEMS.register(id, () -> new BlockItem(b.get(), new Item.Properties().tab(BambooEverything.ITEM_GROUP)));
    }

    public static final RegistryObject<Item> BUNDLE = blockItem("bamboo_bundle", BambooEverythingBlocks.BUNDLE);
    public static final RegistryObject<Item> DOOR = blockItem("bamboo_door", BambooEverythingBlocks.DOOR);
    public static final RegistryObject<Item> FENCE = blockItem("bamboo_fence", BambooEverythingBlocks.FENCE);
    public static final RegistryObject<Item> FENCEGATE = blockItem("bamboo_fence_gate", BambooEverythingBlocks.FENCEGATE);
    public static final RegistryObject<Item> LADDER = blockItem("bamboo_ladder", BambooEverythingBlocks.LADDER);
    public static final RegistryObject<Item> SLAB = blockItem("bamboo_slab", BambooEverythingBlocks.SLAB);
    public static final RegistryObject<Item> STAIRS = blockItem("bamboo_stairs", BambooEverythingBlocks.STAIRS);
    public static final RegistryObject<Item> TRAPDOOR = blockItem("bamboo_trapdoor", BambooEverythingBlocks.TRAPDOOR);

    public static final RegistryObject<Item> RAFT = ITEMS.register("bamboo_raft", () -> new BambooRaftItem((new Item.Properties().stacksTo(1).tab(BambooEverything.ITEM_GROUP))));

}
