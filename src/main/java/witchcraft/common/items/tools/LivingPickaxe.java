package witchcraft.common.items.tools;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;
import witchcraft.common.InitBlocks;

import java.util.Set;

import static witchcraft.WitchCraft.WITCH_CRAFT_TAB;

public class LivingPickaxe extends ItemTool {
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.STONE,Blocks.STONEBRICK,InitBlocks.WOOD_BLOCK);
    public LivingPickaxe(ToolMaterial PICKAXE_MATERIAL){
        super(PICKAXE_MATERIAL,EFFECTIVE_ON);
        setCreativeTab(WITCH_CRAFT_TAB);
    }
}
