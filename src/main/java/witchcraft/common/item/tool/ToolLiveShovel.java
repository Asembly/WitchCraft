package witchcraft.common.item.tool;

import static witchcraft.WitchCraft.MATERIALS_WITCHCRAFT;
import static witchcraft.common.init.InitMaterials.SHOVEL_DEFAULT_MATERIAL;

public class ToolLiveShovel extends Tool {
    public ToolLiveShovel(){
        super(SHOVEL_DEFAULT_MATERIAL,ToolEffective.SHOVEL_DEFAULT_EFFECTIVE);
        setCreativeTab(MATERIALS_WITCHCRAFT);
        setUnlocalizedName("Live Shovel");
    }
}

