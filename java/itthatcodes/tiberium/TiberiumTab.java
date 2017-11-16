package itthatcodes.tiberium;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TiberiumTab extends CreativeTabs {
    TiberiumTab() {
        super(tiberium.MODID);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.rawtiberiumshard);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
