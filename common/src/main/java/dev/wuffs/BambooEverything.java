package dev.wuffs;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.fuel.FuelRegistry;
import dev.wuffs.blocks.Blocks;
import dev.wuffs.items.Items;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class BambooEverything {
    public static final String MOD_ID = "bambooeverything";
//    public static final CreativeModeTab CREATIVE_TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, MOD_ID), () ->
//            new ItemStack(Blocks.BUNDLE.get()));

    public static void init() {
        Blocks.BLOCKS.register();
        Items.ITEMS.register();
//        Entities.ENTITIES.register();
    }

    public static void fuelRegister(){
        FuelRegistry.register(350, Items.BUNDLE.get());
        FuelRegistry.register(350, Items.DRY_BUNDLE.get());
        FuelRegistry.register(50, Items.DRY_BAMBOO.get());
    }

    public static final CreativeTabRegistry.TabSupplier CREATIVE_TAB = CreativeTabRegistry.create(
            new ResourceLocation(BambooEverything.MOD_ID, "creative_tab"),
            () -> new ItemStack(Items.BUNDLE.get())
    );
}
