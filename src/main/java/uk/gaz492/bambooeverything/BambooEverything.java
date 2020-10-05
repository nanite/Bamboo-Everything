package uk.gaz492.bambooeverything;

import net.fabricmc.api.ModInitializer;

public class BambooEverything implements ModInitializer {

    public static BERegistry registry;

    @Override
    public void onInitialize() {
        registry = new BERegistry();
    }
}
