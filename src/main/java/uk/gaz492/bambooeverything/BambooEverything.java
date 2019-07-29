package uk.gaz492.bambooeverything;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uk.gaz492.bambooeverything.blocks.BambooFenceBlock;
import uk.gaz492.bambooeverything.blocks.BambooFenceGateBlock;
import uk.gaz492.bambooeverything.blocks.BambooLadderBlock;

import static uk.gaz492.bambooeverything.util.ModInfo.MOD_ID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MOD_ID)
public class BambooEverything
{
    public static BambooLadderBlock bambooLadder = new BambooLadderBlock();
    public static BambooFenceBlock bambooFenceBlock = new BambooFenceBlock();
    public static BambooFenceGateBlock bambooFenceGateBlock = new BambooFenceGateBlock();

    public static final ItemGroup creativeTab = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(bambooFenceBlock);
        }
    };
}
