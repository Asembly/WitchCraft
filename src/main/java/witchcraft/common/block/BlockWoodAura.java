package witchcraft.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import static witchcraft.WitchCraft.MATERIALS_WITCHCRAFT;

public class BlockWoodAura extends Block {
    public BlockWoodAura(Material material){
        super(material);
        setUnlocalizedName("Wood Aura");
        setCreativeTab(MATERIALS_WITCHCRAFT);
    }
}
