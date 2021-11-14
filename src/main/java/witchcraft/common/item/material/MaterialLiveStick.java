package witchcraft.common.item.material;

import net.minecraft.item.Item;

import static witchcraft.WitchCraft.MATERIALS_WITCHCRAFT;

public class MaterialLiveStick extends Item {
    public MaterialLiveStick(){
        setCreativeTab(MATERIALS_WITCHCRAFT);
        setNoRepair();
        setUnlocalizedName("Live Stick");
    }
}
