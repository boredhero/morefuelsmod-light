package com.bored.morefuelsmodlight;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.modid, name = Main.name, version = Main.version, acceptedMinecraftVersions = "1.8.9")
public class Main {

	public static final String modid = "morefuelsmodlight";
	public static final String name = "More Fuels Mod Light";
	public static final String version = "1.0.0";

	@Mod.Instance(modid)
	public static Main instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		boolean enableRFtLrecipe = config.get(Configuration.CATEGORY_GENERAL, "enableRFtLrecipe", true).getBoolean(true);
		if(enableRFtLrecipe)
			RFtL.init();
		config.save();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerFuelHandler(new Fuels());
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
