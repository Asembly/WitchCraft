package witchcraft.until;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class UntilRegistrarHandler {
    public static Item registerNameItem(Item item,String name){
        item.setRegistryName(name);
        return item;
    }
    public static Block registerNameBlock(Block block, String name){
        block.setRegistryName(name);
        return block;
    }
}
