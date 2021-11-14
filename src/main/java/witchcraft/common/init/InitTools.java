package witchcraft.common.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import witchcraft.WitchCraft;
import witchcraft.common.item.tool.*;

@GameRegistry.ObjectHolder(WitchCraft.MOD_ID)
public class InitTools {
    @GameRegistry.ObjectHolder("live_pickaxe")
    public static final ToolLivePickaxe LIVE_PICKAXE = null;
    @GameRegistry.ObjectHolder("live_axe")
    public static final ToolLiveAxe LIVE_AXE = null;
    @GameRegistry.ObjectHolder("live_hoe")
    public static final ToolLiveHoe LIVE_HOE = null;
    @GameRegistry.ObjectHolder("live_shovel")
    public static final ToolLiveShovel LIVE_SHOVEL = null;
    @GameRegistry.ObjectHolder("carving_knife")
    public static final ToolCarvingKnife CARVING_KNIFE = null;
}
