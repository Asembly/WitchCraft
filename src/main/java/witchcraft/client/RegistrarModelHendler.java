package witchcraft.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import witchcraft.WitchCraft;
import witchcraft.common.init.InitItems;
import witchcraft.common.init.InitTools;

import static witchcraft.common.init.InitBlocks.BLOCK_WOOD_AURA;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = WitchCraft.MOD_ID)
public class RegistrarModelHendler {
    @SubscribeEvent
    public static void registerModelItem(ModelRegistryEvent event){
        //register model tools
       registerModels(InitTools.LIVE_PICKAXE,0);
       registerModels(InitTools.LIVE_AXE,0);
       registerModels(InitTools.LIVE_HOE,0);
       registerModels(InitTools.LIVE_SHOVEL,0);
       registerModels(InitItems.ITEM_LIVING_STICK,0);
       registerModels(InitTools.CARVING_KNIFE,0);

       //register model materials
       registerModels(InitItems.ITEM_MUSHROOM_0,0);
       registerModels(InitItems.ITEM_MUSHROOM_1,0);
       registerModels(InitItems.ITEM_MUSHROOM_2,0);
       registerModels(InitItems.ITEM_MUSHROOM_3,0);
       registerModels(InitItems.ITEM_MUSHROOM_4,0);

       //register model armors
       registerModels(InitItems.ITEM_DRUID_BOOTS,0);
       registerModels(InitItems.ITEM_DRUID_CHEST,0);
       registerModels(InitItems.ITEM_DRUID_HELM,0);
       registerModels(InitItems.ITEM_DRUID_LEGS,0);

       registerModels(Item.getItemFromBlock(BLOCK_WOOD_AURA),0);
    }
    public static void registerModels(Item item, int meta){
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
