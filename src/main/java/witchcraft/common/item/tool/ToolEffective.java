package witchcraft.common.item.tool;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Set;

public class ToolEffective {
    public static final Set<Block> PICKAXE_DEFAULT_EFFECTIVE = Sets.newHashSet(
            Blocks.STONE,Blocks.SANDSTONE,Blocks.STONEBRICK,Blocks.COBBLESTONE,Blocks.COBBLESTONE_WALL,Blocks.BRICK_BLOCK);
    public static final Set<Block> AXE_DEFAULT_EFFECTIVE = Sets.newHashSet(
            Blocks.PLANKS,Blocks.ACACIA_DOOR,Blocks.ACACIA_FENCE,Blocks.ACACIA_FENCE_GATE,Blocks.ACACIA_STAIRS,
            Blocks.OAK_DOOR,Blocks.OAK_FENCE,Blocks.OAK_STAIRS,Blocks.OAK_FENCE_GATE,Blocks.DARK_OAK_DOOR,
            Blocks.DARK_OAK_FENCE,Blocks.DARK_OAK_FENCE_GATE,Blocks.DARK_OAK_STAIRS,
            Blocks.BIRCH_FENCE,Blocks.BIRCH_DOOR,Blocks.BIRCH_FENCE_GATE,Blocks.BIRCH_STAIRS,
            Blocks.JUNGLE_FENCE,Blocks.JUNGLE_STAIRS,Blocks.JUNGLE_FENCE_GATE,Blocks.JUNGLE_DOOR);
    public static final Set<Block> HOE_DEFAULT_EFFECTIVE = Sets.newHashSet(Blocks.GRASS,Blocks.GRASS_PATH);
    public static final Set<Block> SHOVEL_DEFAULT_EFFECTIVE = Sets.newHashSet(
            Blocks.GRASS_PATH,Blocks.DIRT);
    public static final Set<Block> CARVINGKNIFE_DEFAULT_EFFECTIVE = Sets.newHashSet(Blocks.GRASS,Blocks.GRASS_PATH,Blocks.TALLGRASS);
}
