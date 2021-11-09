package witchcraft.common.items.tools;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;
import witchcraft.common.InitBlocks;

import java.util.Set;

import static witchcraft.WitchCraft.WITCH_CRAFT_TAB;
import static witchcraft.common.InitMaterial.HOE_MATERIAL;
import static witchcraft.common.InitMaterial.PICKAXE_MATERIAL;

public class LivingHoe extends ItemTool {
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(InitBlocks.WOOD_BLOCK,Blocks.CACTUS);
    public LivingHoe(ToolMaterial HOE_MATERIAL){
        super(HOE_MATERIAL,EFFECTIVE_ON);
        setCreativeTab(WITCH_CRAFT_TAB);
    }
}
