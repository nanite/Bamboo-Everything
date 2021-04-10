package dev.wuffs.bambooeverything.fabric;

import dev.wuffs.bambooeverything.BambooEverything;
import net.fabricmc.api.ModInitializer;

public class BambooEverythingFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        BambooEverything bambooEverything = new BambooEverything();
    }
}
