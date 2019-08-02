package uk.gaz492.bambooeverything;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import uk.gaz492.bambooeverything.blocks.*;

import static uk.gaz492.bambooeverything.util.ModInfo.MOD_ID;

@Mod(MOD_ID)
public class BambooEverything {
    public static BambooLadderBlock bambooLadder = new BambooLadderBlock();
    public static BambooFenceBlock bambooFenceBlock = new BambooFenceBlock();
    public static BambooFenceGateBlock bambooFenceGateBlock = new BambooFenceGateBlock();
    public static BambooDoorBlock bambooDoorBlock = new BambooDoorBlock();
    public static BambooTrapDoorBlock bambooTrapDoorBlock = new BambooTrapDoorBlock();
    public static BambooBundleBlock bambooBundleBlock = new BambooBundleBlock();

    public static final ItemGroup creativeTab = new ItemGroup(MOD_ID + ".bambooeverything") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(bambooFenceBlock);
        }
    };
}
