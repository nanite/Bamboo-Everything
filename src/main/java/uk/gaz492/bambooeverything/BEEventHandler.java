package uk.gaz492.bambooeverything;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static uk.gaz492.bambooeverything.util.ModInfo.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class BEEventHandler {
    @SubscribeEvent
    public static void onBlockRegistry(RegistryEvent.Register<Block> event){
        event.getRegistry().register(BambooEverything.bambooLadder.setRegistryName(MOD_ID, "bamboo_ladder"));
        event.getRegistry().register(BambooEverything.bambooFenceBlock.setRegistryName(MOD_ID, "bamboo_fence"));
        event.getRegistry().register(BambooEverything.bambooFenceGateBlock.setRegistryName(MOD_ID, "bamboo_fence_gate"));
    }

    @SubscribeEvent
    public static void onItemRegisrty(RegistryEvent.Register<Item> event){
        event.getRegistry().register(new BlockItem(BambooEverything.bambooLadder, new Item.Properties().group(BambooEverything.creativeTab)).setRegistryName(BambooEverything.bambooLadder.getRegistryName()));
        event.getRegistry().register(new BlockItem(BambooEverything.bambooFenceBlock, new Item.Properties().group(BambooEverything.creativeTab)).setRegistryName(BambooEverything.bambooFenceBlock.getRegistryName()));
        event.getRegistry().register(new BlockItem(BambooEverything.bambooFenceGateBlock, new Item.Properties().group(BambooEverything.creativeTab)).setRegistryName(BambooEverything.bambooFenceGateBlock.getRegistryName()));
    }
}
