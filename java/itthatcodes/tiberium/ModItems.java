package itthatcodes.tiberium;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import itthatcodes.tiberium.ItemBase;

public class ModItems {

    //@GameRegistry.ObjectHolder("tiberium:rawtiberiumshard")
   //public static RawTiberiumShard rawTiberiumShard;

    public static ItemBase rawtiberiumshard = new ItemBase("rawtiberiumshard"); //.setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                rawtiberiumshard
        );
    }

    public static void registerModels() {
        rawtiberiumshard.registerItemModel();
    }
}