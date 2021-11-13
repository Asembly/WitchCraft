package witchcraft.common.item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import static witchcraft.WitchCraft.MATERIALS_WITCHCRAFT;

public class ArmorItem extends ItemArmor {
    public ArmorItem(ArmorMaterial armorMaterial, EntityEquipmentSlot equipmentSlot){
        super(armorMaterial,0,equipmentSlot);
        setCreativeTab(MATERIALS_WITCHCRAFT);
    }
}
