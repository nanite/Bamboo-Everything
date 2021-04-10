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

//    public static final RegistrySupplier<Item> BOOK = ITEMS.register("book", QuestBookItem::new);
//    public static final RegistrySupplier<Item> LOOTCRATE = ITEMS.register("lootcrate", LootCrateItem::new);
//    public static final RegistrySupplier<Item> MISSING_ITEM = ITEMS.register("missing_item", MissingItem::new);
//    public static final RegistrySupplier<Item> CUSTOM_ICON = ITEMS.register("custom_icon", CustomIconItem::new);

    private static RegistrySupplier<Item> blockItem(String id, Supplier<Block> b) {
        return ITEMS.register(id, () -> new BlockItem(b.get(), new Item.Properties().tab(BambooEverything.ITEM_GROUP)));
    }

    public static final RegistrySupplier<Item> BUNDLE = blockItem("bundle", BambooEverythingBlocks.BUNDLE);

    public static void register() {
        ITEMS.register();
    }
}
