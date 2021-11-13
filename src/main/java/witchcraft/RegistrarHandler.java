package witchcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import witchcraft.common.block.BlockWoodAura;
import witchcraft.common.init.InitMaterials;
import witchcraft.common.item.armor.*;
import witchcraft.common.item.material.MaterialLiveStick;
import witchcraft.common.item.tool.ToolLiveAxe;
import witchcraft.common.item.tool.ToolLiveHoe;
import witchcraft.common.item.tool.ToolLivePickaxe;
import witchcraft.common.item.tool.ToolLiveShovel;
import witchcraft.until.UntilRegistrarName;
import static witchcraft.WitchCraft.MOD_ID;
import static witchcraft.common.init.InitBlocks.BLOCK_WOOD_AURA;

@Mod.EventBusSubscriber(modid = MOD_ID)
public class RegistrarHandler {
    @SubscribeEvent
    public static void registryItem(RegistryEvent.Register<Item> event){
        Item[]items = {
                UntilRegistrarName.setItemName(new ToolLivePickaxe(),"live_pickaxe"),
                UntilRegistrarName.setItemName(new ToolLiveAxe(),"live_axe"),
                UntilRegistrarName.setItemName(new ToolLiveHoe(),"live_hoe"),
                UntilRegistrarName.setItemName(new ToolLiveShovel(),"live_shovel"),
                UntilRegistrarName.setItemName(new MaterialLiveStick(),"living_stick"),
                UntilRegistrarName.setItemName(new ArmorItem(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD),"druid_helm"),
                UntilRegistrarName.setItemName(new ArmorItem(InitMaterials.ARMOR_DEFAULT_MATERIAL, EntityEquipmentSlot.CHEST),"druid_chest"),
                UntilRegistrarName.setItemName(new ArmorItem(InitMaterials.ARMOR_DEFAULT_MATERIAL, EntityEquipmentSlot.LEGS),"druid_legs"),
                UntilRegistrarName.setItemName(new ArmorItem(InitMaterials.ARMOR_DEFAULT_MATERIAL, EntityEquipmentSlot.FEET),"druid_boots"),
        };
        Item[]itemBlock = {
            new ItemBlock(BLOCK_WOOD_AURA).setRegistryName(BLOCK_WOOD_AURA.getRegistryName())
        };
        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlock);
    }
    @SubscribeEvent
    public static void registryBlock(RegistryEvent.Register<Block>event){
        Block[]blocks = {
                UntilRegistrarName.setBlockName(new BlockWoodAura(Material.WOOD),"wood_aura_block")
        };
        event.getRegistry().registerAll(blocks);
    }
}
