package witchcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import witchcraft.common.items.tools.StonePickAxe;

@Mod(modid = WitchCraft.MOD_ID,useMetadata = true)
public class WitchCraft {
    public static final String MOD_ID = "witchcraft";
    public static final CreativeTabs WITCH_CRAFT_TAB = new WitchCraftTab();

    @SubscribeEvent
    public static void preInitialization(FMLPreInitializationEvent event){
    }
    @SubscribeEvent
    public static void Initialization(FMLPreInitializationEvent event){
    }
    @SubscribeEvent
    public static void postInitialization(FMLPreInitializationEvent event){}

}
