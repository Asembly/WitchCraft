package witchcraft.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import witchcraft.WitchCraft;
import witchcraft.common.InitItems;
import static witchcraft.common.InitBlocks.*;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = WitchCraft.MOD_ID)
public class RegistrarModelHandler {
    @SubscribeEvent
    public static void registerModel(ModelRegistryEvent event){
        registerModels(Item.getItemFromBlock(WOOD_BLOCK),0);
        registerModels(Item.getItemFromBlock(WOOD_AURA_BLOCK),0);
        registerModels(Item.getItemFromBlock(WOOD_DEAD_BLOCK),0);
        registerModels(InitItems.DRUID_BOOTS,0);
        registerModels(InitItems.DRUID_CHEST,0);
        registerModels(InitItems.DRUID_LEGS,0);
        registerModels(InitItems.DRUID_HELM,0);
        registerModels(InitItems.STAFF_OF_LIFE,0);
        registerModels(InitItems.LIVING_AXE,0);
        registerModels(InitItems.LIVING_PICKAXE,0);
        registerModels(InitItems.LIVING_SHOVEL,0);
        registerModels(InitItems.LIVING_HOE,0);
    }
    public static void registerModels(Item item, int meta){
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
