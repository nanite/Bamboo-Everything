package dev.wuffs.fabric;

import dev.wuffs.BambooEverything;
import net.fabricmc.api.ClientModInitializer;

public class BambooFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BambooEverything.onInitializeClient();
    }
}
