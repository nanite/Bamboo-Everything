package dev.wuffs.neoforge;

import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import dev.wuffs.BambooEverything;
import dev.wuffs.BambooEverythingClient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(BambooEverything.MOD_ID)
public class BambooEverythingNeoForge {
    public BambooEverythingNeoForge(IEventBus modEventBus) {
//        Event.registerModEventBus(BambooEverything.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        BambooEverything.init();
        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(this::commonSetup);
        EnvExecutor.runInEnv(Env.CLIENT, ()-> BambooEverythingClient::init);
    }

    public void clientSetup(final FMLClientSetupEvent event) {
        BambooEverythingClient.setRenderType();
    }

    public void commonSetup(final FMLCommonSetupEvent event){
        BambooEverything.fuelRegister();
    }
}