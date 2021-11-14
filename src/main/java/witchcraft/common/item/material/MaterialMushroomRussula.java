package witchcraft.common.item.material;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

import static witchcraft.WitchCraft.MATERIALS_WITCHCRAFT;

public class MaterialMushroomRussula extends ItemFood {
    public MaterialMushroomRussula(){
        super(2,5,false);
        setCreativeTab(MATERIALS_WITCHCRAFT);
        setUnlocalizedName("Mushroom Russula");
    }
}