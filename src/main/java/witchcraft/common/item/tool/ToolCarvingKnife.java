package witchcraft.common.item.tool;

import net.minecraft.block.BlockDropper;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static witchcraft.WitchCraft.MATERIALS_WITCHCRAFT;
import static witchcraft.common.init.InitMaterials.CARVINGKNIFE_DEFAULT_MATERIAL;
import static witchcraft.common.item.tool.ToolEffective.CARVINGKNIFE_DEFAULT_EFFECTIVE;

public class ToolCarvingKnife extends ItemTool {
    public ToolCarvingKnife(){
        super(CARVINGKNIFE_DEFAULT_MATERIAL,CARVINGKNIFE_DEFAULT_EFFECTIVE);
        setCreativeTab(MATERIALS_WITCHCRAFT);
        setUnlocalizedName("Carving Knife");
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
    {
        if (!worldIn.isRemote && (double)state.getBlockHardness(worldIn, pos) != 0.0D)
        {
            stack.damageItem(5, entityLiving);
        }

        return true;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        BlockDropper blockDropper = new BlockDropper();
        playerIn.fall(10.2f,2);
        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }
}
