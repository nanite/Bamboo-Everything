package dev.wuffs.forge;

import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import dev.wuffs.BambooEverything;
import dev.wuffs.BambooEverythingClient;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BambooEverything.MOD_ID)
public class BambooEverythingForge {
    public BambooEverythingForge() {
//        Event.registerModEventBus(BambooEverything.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        BambooEverything.init();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        EnvExecutor.runInEnv(Env.CLIENT, ()-> BambooEverythingClient::init);
    }

    public void clientSetup(final FMLClientSetupEvent event) {
        BambooEverythingClient.setRenderType();
    }

    public void commonSetup(final FMLCommonSetupEvent event){
        BambooEverything.fuelRegister();
    }
}