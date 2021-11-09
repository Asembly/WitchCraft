package witchcraft.common.items.tools;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;
import witchcraft.common.InitBlocks;

import java.util.Set;

import static witchcraft.WitchCraft.WITCH_CRAFT_TAB;

public class LivingShovel extends ItemTool {
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.DIRT,InitBlocks.WOOD_BLOCK,Blocks.SAND);
    public LivingShovel(ToolMaterial SHOVEL_MATERIAL){
        super(SHOVEL_MATERIAL,EFFECTIVE_ON);
        setCreativeTab(WITCH_CRAFT_TAB);
    }
}
