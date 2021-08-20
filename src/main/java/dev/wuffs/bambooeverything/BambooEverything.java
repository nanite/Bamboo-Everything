package dev.wuffs.bambooeverything;

import dev.wuffs.bambooeverything.blocks.BambooEverythingBlocks;
import dev.wuffs.bambooeverything.client.BambooRaftRender;
import dev.wuffs.bambooeverything.entites.BambooEverythingEntities;
import dev.wuffs.bambooeverything.items.BambooEverythingItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BambooEverything.MOD_ID)
public class BambooEverything {
    public static final String MOD_ID = "bambooeverything";
    public static final Logger LOGGER = LogManager.getLogger("Bamboo Everything");

    public static BambooEverything instance;

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(MOD_ID + "." + MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BambooEverythingBlocks.BUNDLE.get());
        }
    };

    public BambooEverything() {
        BambooEverythingEntities.ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        BambooEverythingBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BambooEverythingItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(BambooEverythingClient::entityReg);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(BambooEverythingClient::registerLayerDefinitions);
    }


}
