package com.bored.morefuelsmodlight;

import net.minecraftforge.common.Configuration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.MODNAME, acceptedMinecraftVersions = "[1.6.1, 1.6.2, 1.6.3, 1.6.4]")
public class Main
{
    public static final String MODID = "morefuelsmodlight";
    public static final String VERSION = "1.0.0";
    public static final String MODNAME = "More Fuels Mod Light";
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
    	boolean enableRFtLrecipe = config.get(Configuration.CATEGORY_GENERAL, "enableRFtLrecipe", true).getBoolean(true);
    	if(enableRFtLrecipe)
    		GameRegistry.addSmelting(367, new ItemStack(Item.leather), 0.3F);
    	config.save();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		GameRegistry.registerFuelHandler(new Fuels());
		
    }
}
