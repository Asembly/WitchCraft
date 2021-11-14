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
import witchcraft.common.item.material.*;
import witchcraft.common.item.tool.*;
import witchcraft.until.UntilRegistrarName;
import static witchcraft.WitchCraft.MOD_ID;
import static witchcraft.common.init.InitBlocks.BLOCK_WOOD_AURA;

@Mod.EventBusSubscriber(modid = MOD_ID)
public class RegistrarHandler {
    @SubscribeEvent
    public static void registryItem(RegistryEvent.Register<Item> event){
        Item[]items = {
                //register tools
                UntilRegistrarName.setItemName(new ToolLivePickaxe(),"live_pickaxe"),
                UntilRegistrarName.setItemName(new ToolLiveAxe(),"live_axe"),
                UntilRegistrarName.setItemName(new ToolLiveHoe(),"live_hoe"),
                UntilRegistrarName.setItemName(new ToolLiveShovel(),"live_shovel"),
                UntilRegistrarName.setItemName(new ToolCarvingKnife(),"carving_knife"),

                //register items
                UntilRegistrarName.setItemName(new MaterialLiveStick(),"living_stick"),
                UntilRegistrarName.setItemName(new MaterialMushroomBoletus(),"mushroom_boletus"),
                UntilRegistrarName.setItemName(new MaterialMushroomWhite(),"mushroom_white"),
                UntilRegistrarName.setItemName(new MaterialMushroomChamp(),"mushroom_champ"),
                UntilRegistrarName.setItemName(new MaterialMushroomRussula(),"mushroom_russula"),
                UntilRegistrarName.setItemName(new MaterialMushroomChan(),"mushroom_chan"),

                //register armors
                UntilRegistrarName.setItemName(new ArmorItem(InitMaterials.ARMOR_DEFAULT_MATERIAL,1, EntityEquipmentSlot.HEAD),"druid_helm"),
                UntilRegistrarName.setItemName(new ArmorItem(InitMaterials.ARMOR_DEFAULT_MATERIAL,1, EntityEquipmentSlot.CHEST),"druid_chest"),
                UntilRegistrarName.setItemName(new ArmorItem(InitMaterials.ARMOR_DEFAULT_MATERIAL,2, EntityEquipmentSlot.LEGS),"druid_legs"),
                UntilRegistrarName.setItemName(new ArmorItem(InitMaterials.ARMOR_DEFAULT_MATERIAL,1, EntityEquipmentSlot.FEET),"druid_boots"),
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
