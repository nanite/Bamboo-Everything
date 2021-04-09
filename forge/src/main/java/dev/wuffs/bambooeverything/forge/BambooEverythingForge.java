package dev.wuffs.bambooeverything.forge;

import dev.wuffs.bambooeverything.BambooEverything;
import me.shedaniel.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BambooEverything.MOD_ID)
public class BambooEverythingForge {
    public BambooEverythingForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(BambooEverything.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        BambooEverything bambooEverything = new BambooEverything();
    }
}
