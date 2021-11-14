package witchcraft.common.item.tool;

import static witchcraft.WitchCraft.MATERIALS_WITCHCRAFT;
import static witchcraft.common.init.InitMaterials.HOE_DEFAULT_MATERIAL;

public class ToolLiveHoe extends Tool {
    public ToolLiveHoe(){
        super(HOE_DEFAULT_MATERIAL,ToolEffective.HOE_DEFAULT_EFFECTIVE);
        setCreativeTab(MATERIALS_WITCHCRAFT);
        setUnlocalizedName("Live Hoe");
    }
}

