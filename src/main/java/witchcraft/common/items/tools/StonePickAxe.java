package witchcraft.common.items.tools;
import net.minecraft.item.ItemPickaxe;
import static witchcraft.WitchCraft.WITCH_CRAFT_TAB;

public class StonePickAxe extends ItemPickaxe {
    public StonePickAxe(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(WITCH_CRAFT_TAB);
        setUnlocalizedName("StonePickaxe");
    }
}
