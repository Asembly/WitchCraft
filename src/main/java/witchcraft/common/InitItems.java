package witchcraft.common;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import witchcraft.WitchCraft;
import witchcraft.common.items.tools.*;

@GameRegistry.ObjectHolder(WitchCraft.MOD_ID)
public class InitItems {
    @GameRegistry.ObjectHolder("druid_boots")
    public static final Item DRUID_BOOTS = null;
    @GameRegistry.ObjectHolder("druid_chest")
    public static final Item DRUID_CHEST = null;
    @GameRegistry.ObjectHolder("druid_helm")
    public static final Item DRUID_HELM = null;
    @GameRegistry.ObjectHolder("druid_legs")
    public static final Item DRUID_LEGS = null;
    @GameRegistry.ObjectHolder("live_staff")
    public static final StaffOfLife STAFF_OF_LIFE = null;
    @GameRegistry.ObjectHolder("live_axe")
    public static final LivingAxe LIVING_AXE = null;
    @GameRegistry.ObjectHolder("live_hoe")
    public static final LivingHoe LIVING_HOE = null;
    @GameRegistry.ObjectHolder("live_pickaxe")
    public static final LivingPickaxe LIVING_PICKAXE = null;
    @GameRegistry.ObjectHolder("live_shovel")
    public static final LivingShovel LIVING_SHOVEL = null;

}
