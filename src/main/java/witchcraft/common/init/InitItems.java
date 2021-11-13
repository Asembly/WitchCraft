package witchcraft.common.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static witchcraft.WitchCraft.MOD_ID;

@GameRegistry.ObjectHolder(MOD_ID)
public class InitItems {
    @GameRegistry.ObjectHolder("living_stick")
    public static final Item ITEM_LIVING_STICK = null;
    @GameRegistry.ObjectHolder("druid_helm")
    public static final Item ITEM_DRUID_HELM = null;
    @GameRegistry.ObjectHolder("druid_legs")
    public static final Item ITEM_DRUID_LEGS = null;
    @GameRegistry.ObjectHolder("druid_chest")
    public static final Item ITEM_DRUID_CHEST = null;
    @GameRegistry.ObjectHolder("druid_boots")
    public static final Item ITEM_DRUID_BOOTS = null;
}
