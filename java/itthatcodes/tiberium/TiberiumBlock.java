package itthatcodes.tiberium;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TiberiumBlock extends Block {
    public TiberiumBlock() {
        super(Material.ROCK);
        //setUnlocalizedName(tiberium.MODID + ".tiberiumblock");     // Used for localization (en_US.lang)
        //setRegistryName("tiberiumblock");        // The unique name (within your mod) that identifies this block
    }
}