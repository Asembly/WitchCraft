package witchcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import witchcraft.common.creativeTab.WitchCraftTab;

import java.awt.*;

import static witchcraft.WitchCraft.*;

@Mod(modid = MOD_ID,version = MOD_VERSION,name = MOD_NAME,acceptedMinecraftVersions = MOD_MC_VERSION,useMetadata = true)
public class WitchCraft{
    public static final String MOD_ID = "witchcraft";
    public static final String MOD_NAME = "Witch Craft";
    public static final String MOD_VERSION = "0.0.1";
    public static final String MOD_MC_VERSION = "1.12.2";

    public static final WitchCraftTab MATERIALS_WITCHCRAFT = new WitchCraftTab();

    @Mod.EventHandler
    public static void initialization(FMLInitializationEvent event){System.out.print(Color.GREEN + "Initialization - okey");}
    @Mod.EventHandler
    public static void preInitialization(FMLPreInitializationEvent event){System.out.print(Color.GREEN + "PreInitialization - okey");}
    @Mod.EventHandler
    public static void postInitialization(FMLPostInitializationEvent event){System.out.print(Color.GREEN + "PostInitialization - okey");}
}
