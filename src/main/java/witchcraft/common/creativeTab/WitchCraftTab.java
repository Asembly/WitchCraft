package witchcraft.common.creativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import static witchcraft.common.init.InitTools.LIVE_PICKAXE;

public class WitchCraftTab extends CreativeTabs{
    public WitchCraftTab(){
        super("witch craft");
    }
    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(LIVE_PICKAXE);
    }
}
