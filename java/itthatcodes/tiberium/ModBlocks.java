package itthatcodes.tiberium;

import itthatcodes.tiberium.proxy.BlockOre;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
    public static BlockOre oreTiberium = new BlockOre("oretiberium"); //.setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreTiberium
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreTiberium.createItemBlock()
        );
    }

    public static void registerModels() {
        oreTiberium.registerItemModel(Item.getItemFromBlock(oreTiberium));
    }





}