package witchcraft.common.item.armor;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatBase;
import net.minecraft.world.World;

import static witchcraft.WitchCraft.MATERIALS_WITCHCRAFT;

public class ArmorItem extends ItemArmor {
    public ArmorItem(ArmorMaterial armorMaterial,int renderIndex, EntityEquipmentSlot equipmentSlot){
        super(armorMaterial,renderIndex,equipmentSlot);
        setCreativeTab(MATERIALS_WITCHCRAFT);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        super.onArmorTick(world, player, itemStack);
        //player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5f);
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),1,0));
    }
}
