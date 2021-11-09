package witchcraft.common.items.armors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

import static witchcraft.WitchCraft.WITCH_CRAFT_TAB;

public class DruidHelm extends ItemArmor {
    public DruidHelm(ItemArmor.ArmorMaterial armorMaterial, int render, EntityEquipmentSlot equipmentSlot){
        super(armorMaterial,render,equipmentSlot);
            setCreativeTab(WITCH_CRAFT_TAB);
            setUnlocalizedName("Druid Helm");
        }
}
