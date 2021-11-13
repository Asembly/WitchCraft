package witchcraft.common.item.tool;

import static witchcraft.WitchCraft.MATERIALS_WITCHCRAFT;
import static witchcraft.common.init.InitMaterials.PICKAXE_DEFAULT_MATERIAL;

public class ToolLivePickaxe extends Tool {
    public ToolLivePickaxe(){
        super(PICKAXE_DEFAULT_MATERIAL,ToolEffective.PICKAXE_DEFAULT_EFFECTIVE);
        setCreativeTab(MATERIALS_WITCHCRAFT);
        setUnlocalizedName("Live Pickaxe");
    }
}

