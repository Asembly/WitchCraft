package witchcraft.common.item.material;

import net.minecraft.item.ItemFood;

import static witchcraft.WitchCraft.MATERIALS_WITCHCRAFT;

public class MaterialMushroomWhite extends ItemFood {
    public MaterialMushroomWhite(){
        super(2,5,false);
        setCreativeTab(MATERIALS_WITCHCRAFT);
        setUnlocalizedName("Mushroom White");
    }
}
