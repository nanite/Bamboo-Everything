package dev.wuffs.fabric;

import dev.wuffs.BambooEverything;
import net.fabricmc.api.ModInitializer;

public class BambooFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        BambooEverything.init();
    }
}
