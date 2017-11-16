package itthatcodes.tiberium;

import itthatcodes.tiberium.proxy.CommonProxy;
import itthatcodes.tiberium.recipe.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



//@Mod(modid = tiberium.MODID, name = tiberium.MODNAME, version = tiberium.VERSION, dependencies = "required-after:Forge@[14.21.1.2443,)", useMetadata = true)
@Mod(modid = tiberium.MODID, name = tiberium.MODNAME, version = tiberium.VERSION)
public class tiberium {

    public static final String MODID = "tiberium";
    public static final String MODNAME = "tiberium";
    public static final String VERSION = "0.0.1";

    //public static Logger logger;
    public static final TiberiumTab creativeTab = new TiberiumTab();

    @Mod.Instance
    public static tiberium instance;

    @SidedProxy(clientSide = "itthatcodes.tiberium.proxy.ClientProxy", serverSide = "itthatcodes.tiberium.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //logger = event.getModLog();
        //proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        ModRecipes.init();
        //proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        //proxy.postInit(e);
    }








}