package dev.wuffs.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import dev.wuffs.BambooEverything;
import dev.wuffs.BambooEverythingClient;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BambooEverything.MOD_ID)
public class BambooEverythingForge {
    public BambooEverythingForge() {
        EventBuses.registerModEventBus(BambooEverything.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
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