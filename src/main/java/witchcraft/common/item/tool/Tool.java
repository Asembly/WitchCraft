package witchcraft.common.item.tool;

import net.minecraft.block.Block;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

import java.util.Set;

public class Tool extends ItemTool {
    private static float attackSpeed;
    private static float attackDamages;

    public Tool(ToolMaterial material,Set<Block> EFFECTIVE_ON){
        super(material,EFFECTIVE_ON);
    }
    protected void setAttackSpeed(float attackSpeed){
        this.attackSpeed = attackSpeed;
    }
    protected void setAttackDamages(float attackDamages){
        this.attackDamages = attackDamages;
    }

    protected static float getAttackDamages(){
        return attackDamages;
    }
    protected static float getAttackSpeed(){
        return attackSpeed;
    }
}
