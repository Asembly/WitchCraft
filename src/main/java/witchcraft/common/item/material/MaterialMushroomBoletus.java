package witchcraft.common.item.material;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

import static witchcraft.WitchCraft.MATERIALS_WITCHCRAFT;

public class MaterialMushroomBoletus extends ItemFood {
    public MaterialMushroomBoletus(){
        super(2,5,false);
        setCreativeTab(MATERIALS_WITCHCRAFT);
        setUnlocalizedName("Mushroom Boletus");
    }
}
