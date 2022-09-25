package dev.wuffs.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import dev.wuffs.BambooEverything;
import dev.wuffs.BambooEverythingClient;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BambooEverything.MOD_ID)
public class BambooEverythingForge {
    public BambooEverythingForge() {
        EventBuses.registerModEventBus(BambooEverything.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        BambooEverything.init();
        EnvExecutor.runInEnv(Env.CLIENT, ()-> BambooEverythingClient::init);
    }
}