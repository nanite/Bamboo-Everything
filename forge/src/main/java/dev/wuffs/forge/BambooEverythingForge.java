package dev.wuffs.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import dev.wuffs.BambooEverything;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BambooEverything.MOD_ID)
public class BambooEverythingForge {
    public BambooEverythingForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(BambooEverything.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupClient);
        BambooEverything.init();
        EnvExecutor.runInEnv(Env.CLIENT, ()-> BambooEverything::onInitializeClient);
    }

//    @OnlyIn(Dist.CLIENT)
//    public void setupClient(final FMLClientSetupEvent event) {
//        BambooEverything.onInitializeClient();
//    }
}