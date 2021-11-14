package witchcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import witchcraft.common.blocks.WoodAuraBlock;
import witchcraft.common.blocks.WoodBlock;
import witchcraft.common.blocks.WoodDeadBlock;
import witchcraft.common.items.armors.DruidBoots;
import witchcraft.common.items.armors.DruidChest;
import witchcraft.common.items.armors.DruidHelm;
import witchcraft.common.items.armors.DruidLegs;
import witchcraft.common.items.tools.*;
import witchcraft.until.UntilRegistrarHandler;
import static witchcraft.WitchCraft.MOD_ID;
import static witchcraft.common.InitBlocks.*;
import static witchcraft.common.InitMaterial.*;

@Mod.EventBusSubscriber(modid = MOD_ID)
public class RegistrarHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        Item[] items = {
                UntilRegistrarHandler.registerNameItem(new DruidBoots(TAUM_MATERIAL,0, EntityEquipmentSlot.FEET),"druid_boots"),
                UntilRegistrarHandler.registerNameItem(new DruidHelm(TAUM_MATERIAL,0, EntityEquipmentSlot.HEAD),"druid_helm"),
                UntilRegistrarHandler.registerNameItem(new DruidLegs(TAUM_MATERIAL,0, EntityEquipmentSlot.LEGS),"druid_legs"),
                UntilRegistrarHandler.registerNameItem(new DruidChest(TAUM_MATERIAL,0, EntityEquipmentSlot.CHEST),"druid_chest"),
                UntilRegistrarHandler.registerNameItem(new StaffOfLife(STAFF_OF_LIFE),"live_staff"),
                UntilRegistrarHandler.registerNameItem(new LivingAxe(AXE_MATERIAL),"live_axe"),
                UntilRegistrarHandler.registerNameItem(new LivingPickaxe(PICKAXE_MATERIAL),"live_pickaxe"),
                UntilRegistrarHandler.registerNameItem(new LivingShovel(SHOVEL_MATERIAL),"live_shovel"),
                UntilRegistrarHandler.registerNameItem(new LivingHoe(HOE_MATERIAL),"live_hoe"),
        };
        Item[] blockItems = {
                new ItemBlock(WOOD_BLOCK).setRegistryName(WOOD_BLOCK.getRegistryName()),
                new ItemBlock(WOOD_AURA_BLOCK).setRegistryName(WOOD_AURA_BLOCK.getRegistryName()),
                new ItemBlock(WOOD_DEAD_BLOCK).setRegistryName(WOOD_DEAD_BLOCK.getRegistryName())
        };
        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(blockItems);
    }
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block>event){
        Block[]blocks = {
                UntilRegistrarHandler.registerNameBlock(new WoodBlock(WOOD_BLOCK_MATERIAL),"wood_block"),
                UntilRegistrarHandler.registerNameBlock(new WoodAuraBlock(WOOD_BLOCK_MATERIAL),"wood_aura_block"),
                UntilRegistrarHandler.registerNameBlock(new WoodDeadBlock(WOOD_BLOCK_MATERIAL),"wood_dead_block")
        };
        event.getRegistry().registerAll(blocks);
    }
}
