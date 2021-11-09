package witchcraft.common.items.armors;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

import static witchcraft.WitchCraft.WITCH_CRAFT_TAB;

public class DruidChest extends ItemArmor {
        public DruidChest(ItemArmor.ArmorMaterial armorMaterial, int render, EntityEquipmentSlot equipmentSlot){
            super(armorMaterial,render,equipmentSlot);
            setCreativeTab(WITCH_CRAFT_TAB);
            setUnlocalizedName("Druid Chest");
        }
    }
