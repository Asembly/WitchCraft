package witchcraft.common.init;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

import static witchcraft.WitchCraft.MOD_ID;

public class InitMaterials {
    public static final Item.ToolMaterial PICKAXE_DEFAULT_MATERIAL = EnumHelper.addToolMaterial("pickaxe_default_material",
            2,200,6,2,5);
    public static final Item.ToolMaterial AXE_DEFAULT_MATERIAL = EnumHelper.addToolMaterial("axe_default_material",
            0,200,6,5,5);
    public static final Item.ToolMaterial HOE_DEFAULT_MATERIAL = EnumHelper.addToolMaterial("hoe_default_material",
            0,200,6,1,5);
    public static final Item.ToolMaterial SHOVEL_DEFAULT_MATERIAL = EnumHelper.addToolMaterial("shavel_default_material",
            1,200,6,1,5);

    public static final Item.ToolMaterial LIVE_PICKAXE_MATERIAL = null;

    public static final Material WOOD_DEFAULT_MATERIAL = new Material(MapColor.WOOD);

    public static final ItemArmor.ArmorMaterial ARMOR_DEFAULT_MATERIAL = EnumHelper.addArmorMaterial("armor_material",MOD_ID + ":armor_",5, new int[]{2, 5, 6, 3},5, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0);
}
