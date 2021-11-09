package witchcraft.common.items.armors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

import static witchcraft.WitchCraft.MOD_ID;
import static witchcraft.WitchCraft.WITCH_CRAFT_TAB;

public class DruidBoots extends ItemArmor {
    public DruidBoots(ArmorMaterial armorMaterial, int render, EntityEquipmentSlot equipmentSlot){
        super(armorMaterial,render,equipmentSlot);
        setCreativeTab(WITCH_CRAFT_TAB);
    }
}