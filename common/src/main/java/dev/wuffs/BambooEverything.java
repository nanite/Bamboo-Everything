package dev.wuffs;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.wuffs.blocks.Blocks;
import dev.wuffs.entites.Entities;
import dev.wuffs.items.Items;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class BambooEverything {
    public static final String MOD_ID = "bambooeverything";
    // We can use this if we don't want to use DeferredRegister
//    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    // Registering a new creative tab
    public static final CreativeModeTab CREATIVE_TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, MOD_ID), () ->
            new ItemStack(Blocks.BUNDLE.get()));

    public static void init() {
        Blocks.BLOCKS.register();
        Items.ITEMS.register();
        Entities.ENTITIES.register();
    }

    public static void onInitializeClient(){
        BambooEverythingClient.init();
    }

}
