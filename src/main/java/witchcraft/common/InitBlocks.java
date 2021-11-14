package witchcraft.common;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import witchcraft.WitchCraft;

@GameRegistry.ObjectHolder(WitchCraft.MOD_ID)
public class InitBlocks {
    @GameRegistry.ObjectHolder("wood_block")
    public static final Block WOOD_BLOCK = null;
    @GameRegistry.ObjectHolder("wood_aura_block")
    public static final Block WOOD_AURA_BLOCK = null;
    @GameRegistry.ObjectHolder("wood_dead_block")
    public static final Block WOOD_DEAD_BLOCK = null;
}
