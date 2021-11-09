package witchcraft;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import witchcraft.common.blocks.WoodBlock;

import static witchcraft.common.InitBlocks.WOOD_BLOCK;

public class WitchCraftTab extends CreativeTabs {
    public WitchCraftTab(){
        super("Witch Craft");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(WOOD_BLOCK);
    }
}
