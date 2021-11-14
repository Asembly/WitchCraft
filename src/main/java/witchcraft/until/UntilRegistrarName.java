package witchcraft.until;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class UntilRegistrarName {
    public static Item setItemName(Item item, String itemName){
        item.setRegistryName(itemName);
        return item;
    }
    public static Block setBlockName(Block block, String blockName){
        block.setRegistryName(blockName);
        return block;
    }
}
