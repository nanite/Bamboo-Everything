package dev.wuffs;

import dev.architectury.registry.fuel.FuelRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.wuffs.blocks.Blocks;
import dev.wuffs.items.Items;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class BambooEverything {
    public static final String MOD_ID = "bambooeverything";
    public static void init() {
        Blocks.BLOCKS.register();
        Items.ITEMS.register();
        CREATIVE_TAB.register();
    }

    public static void fuelRegister(){
        FuelRegistry.register(350, Items.BUNDLE.get());
        FuelRegistry.register(350, Items.DRY_BUNDLE.get());
        FuelRegistry.register(50, Items.DRY_BAMBOO.get());
    }

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB = DeferredRegister.create(BambooEverything.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> TAB = CREATIVE_TAB.register(BambooEverything.MOD_ID, () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).displayItems(
            (itemDisplayParameters, output) -> {
                Items.ITEMS.forEach(e -> output.accept(e.get()));
            }
    ).icon(() -> new ItemStack(Items.BUNDLE.get())).build());
}
