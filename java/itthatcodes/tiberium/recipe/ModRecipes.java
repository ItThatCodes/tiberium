package itthatcodes.tiberium.recipe;

import itthatcodes.tiberium.ModBlocks;
import itthatcodes.tiberium.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModBlocks.oreTiberium, new ItemStack(ModItems.rawtiberiumshard), 0.7f);
    }

}