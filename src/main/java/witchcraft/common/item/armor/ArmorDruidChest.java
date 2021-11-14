package witchcraft.common.item.armor;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHealthBoost;
import net.minecraft.world.World;

import static witchcraft.WitchCraft.MATERIALS_WITCHCRAFT;

public class ArmorDruidChest  extends Item {
    public ArmorDruidChest(){
        setCreativeTab(MATERIALS_WITCHCRAFT);
    }
}
