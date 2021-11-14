package witchcraft.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import static witchcraft.WitchCraft.WITCH_CRAFT_TAB;

public class WoodDeadBlock extends Block {
    public WoodDeadBlock(Material materialWood){
        super(materialWood);
        setCreativeTab(WITCH_CRAFT_TAB);
        setLightLevel(0);
        setUnlocalizedName("Dead Wood");
        setResistance(3);
        setSoundType(SoundType.WOOD);
        setLightOpacity(15);
        setHarvestLevel("axe",4);
        setHardness(3);
    }
}
