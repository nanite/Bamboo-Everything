package dev.wuffs.bambooeverything;

import dev.wuffs.bambooeverything.items.BambooEverythingItems;
import me.shedaniel.architectury.registry.CreativeTabs;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.Registries;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

public class BambooEverything {
    public static final String MOD_ID = "bambooeverything";
    public static final Logger LOGGER = LogManager.getLogger("Bamboo Everything");

    public static BambooEverything instance;

    public static final CreativeModeTab ITEM_GROUP = CreativeTabs.create(new ResourceLocation(BambooEverything.MOD_ID, BambooEverything.MOD_ID), () ->
            new ItemStack(BambooEverythingItems.BUNDLE.get()));

    public BambooEverything() {
        new BambooEverythingEventHandler().init();
    }
}
