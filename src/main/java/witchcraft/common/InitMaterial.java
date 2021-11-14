package witchcraft.common;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class InitMaterial {
    //public static final Item.ToolMaterial PICKAXE_MATERIAL = EnumHelper.addToolMaterial("pickaxe_material", 3, 1000, 100, 100, 100);

    public static final ItemArmor.ArmorMaterial TAUM_MATERIAL = EnumHelper.addArmorMaterial(
            "taum_material", "witchcraft",16,new int[]{5,10,20,30},
            15, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0);

    public static final Material WOOD_BLOCK_MATERIAL = new Material(MapColor.getBlockColor(EnumDyeColor.BROWN));

    public static final Item.ToolMaterial STAFF_OF_LIFE = EnumHelper.addToolMaterial("staff_material",0,150,10,4,5);
    public static final Item.ToolMaterial AXE_MATERIAL = EnumHelper.addToolMaterial("axe_material",0,150,10,6,5);
    public static final Item.ToolMaterial PICKAXE_MATERIAL = EnumHelper.addToolMaterial("pickaxe_material",1,150,10,3,5);
    public static final Item.ToolMaterial HOE_MATERIAL = EnumHelper.addToolMaterial("hoe_material",0,150,6,2,5);
    public static final Item.ToolMaterial SHOVEL_MATERIAL = EnumHelper.addToolMaterial("shovel_material",0,150,10,2,5);
}