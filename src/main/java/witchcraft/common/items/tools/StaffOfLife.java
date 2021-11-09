package witchcraft.common.items.tools;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

import java.util.Set;

import static witchcraft.WitchCraft.WITCH_CRAFT_TAB;

public class StaffOfLife extends ItemTool {
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.DIRT,Blocks.CACTUS,Blocks.SAND,Blocks.CHEST);
    public StaffOfLife(ToolMaterial STAFF_OF_LIFE){
        super(STAFF_OF_LIFE,EFFECTIVE_ON);
        setCreativeTab(WITCH_CRAFT_TAB);
    }
}
