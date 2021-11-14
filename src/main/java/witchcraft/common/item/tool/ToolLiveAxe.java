package witchcraft.common.item.tool;

import static witchcraft.WitchCraft.MATERIALS_WITCHCRAFT;
import static witchcraft.common.init.InitMaterials.AXE_DEFAULT_MATERIAL;

public class ToolLiveAxe extends Tool {
    public ToolLiveAxe(){
        super(AXE_DEFAULT_MATERIAL,ToolEffective.AXE_DEFAULT_EFFECTIVE);
        setCreativeTab(MATERIALS_WITCHCRAFT);
        setUnlocalizedName("Live Axe");
    }
}

