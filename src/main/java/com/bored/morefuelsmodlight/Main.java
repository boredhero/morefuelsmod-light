package com.bored.morefuelsmodlight;

import com.bored.morefuelsmodlight.fuels.ActivatorRail;
import com.bored.morefuelsmodlight.fuels.ArmorStand;
import com.bored.morefuelsmodlight.fuels.Arrow;
import com.bored.morefuelsmodlight.fuels.Bed;
import com.bored.morefuelsmodlight.fuels.BeetSeeds;
import com.bored.morefuelsmodlight.fuels.BlazePowder;
import com.bored.morefuelsmodlight.fuels.Book;
import com.bored.morefuelsmodlight.fuels.Bowl;
import com.bored.morefuelsmodlight.fuels.Cactus;
import com.bored.morefuelsmodlight.fuels.Carpet;
import com.bored.morefuelsmodlight.fuels.CarrotOnAStick;
import com.bored.morefuelsmodlight.fuels.ChorusFlowers;
import com.bored.morefuelsmodlight.fuels.ChorusPlant;
import com.bored.morefuelsmodlight.fuels.Deadbush;
import com.bored.morefuelsmodlight.fuels.DetectorRail;
import com.bored.morefuelsmodlight.fuels.Doors;
import com.bored.morefuelsmodlight.fuels.DoublePlant;
import com.bored.morefuelsmodlight.fuels.DragonBreath;
import com.bored.morefuelsmodlight.fuels.ExperimentalMushroomBlocks;
import com.bored.morefuelsmodlight.fuels.ExperimentalPotions;
import com.bored.morefuelsmodlight.fuels.Feather;
import com.bored.morefuelsmodlight.fuels.FermentedSpiderEye;
import com.bored.morefuelsmodlight.fuels.FireCharge;
import com.bored.morefuelsmodlight.fuels.FireworkCharge;
import com.bored.morefuelsmodlight.fuels.Fireworks;
import com.bored.morefuelsmodlight.fuels.FishingRod;
import com.bored.morefuelsmodlight.fuels.GhastTear;
import com.bored.morefuelsmodlight.fuels.Gunpowder;
import com.bored.morefuelsmodlight.fuels.HayBlock;
import com.bored.morefuelsmodlight.fuels.ItemFrame;
import com.bored.morefuelsmodlight.fuels.Ladder;
import com.bored.morefuelsmodlight.fuels.Leather;
import com.bored.morefuelsmodlight.fuels.LeatherArmor;
import com.bored.morefuelsmodlight.fuels.Lever;
import com.bored.morefuelsmodlight.fuels.MagmaCream;
import com.bored.morefuelsmodlight.fuels.Maps;
import com.bored.morefuelsmodlight.fuels.MelonSeeds;
import com.bored.morefuelsmodlight.fuels.MinecartWithChest;
import com.bored.morefuelsmodlight.fuels.MushroomItems;
import com.bored.morefuelsmodlight.fuels.Painting;
import com.bored.morefuelsmodlight.fuels.Paper;
import com.bored.morefuelsmodlight.fuels.Piston;
import com.bored.morefuelsmodlight.fuels.PoisonousPotato;
import com.bored.morefuelsmodlight.fuels.PoweredRail;
import com.bored.morefuelsmodlight.fuels.PumpkinSeeds;
import com.bored.morefuelsmodlight.fuels.RabbitFoot;
import com.bored.morefuelsmodlight.fuels.Rail;
import com.bored.morefuelsmodlight.fuels.RedFlower;
import com.bored.morefuelsmodlight.fuels.RedstoneTorch;
import com.bored.morefuelsmodlight.fuels.RottenFlesh;
import com.bored.morefuelsmodlight.fuels.Shield;
import com.bored.morefuelsmodlight.fuels.Sign;
import com.bored.morefuelsmodlight.fuels.SpawnEgg;
import com.bored.morefuelsmodlight.fuels.SpiderEye;
import com.bored.morefuelsmodlight.fuels.StickyPiston;
import com.bored.morefuelsmodlight.fuels.Sugarcane;
import com.bored.morefuelsmodlight.fuels.TNT;
import com.bored.morefuelsmodlight.fuels.TNTMinecart;
import com.bored.morefuelsmodlight.fuels.Torch;
import com.bored.morefuelsmodlight.fuels.TripwireHook;
import com.bored.morefuelsmodlight.fuels.Vine;
import com.bored.morefuelsmodlight.fuels.WaterLily;
import com.bored.morefuelsmodlight.fuels.Web;
import com.bored.morefuelsmodlight.fuels.Wheat;
import com.bored.morefuelsmodlight.fuels.WheatSeeds;
import com.bored.morefuelsmodlight.fuels.WoodenButton;
import com.bored.morefuelsmodlight.fuels.Wool;
import com.bored.morefuelsmodlight.fuels.WritableBook;
import com.bored.morefuelsmodlight.fuels.WrittenBook;
import com.bored.morefuelsmodlight.fuels.YellowFlower;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.modid, name = Main.name, version = Main.version, acceptedMinecraftVersions = "[1.9, 1.9.4]")
public class Main {

	public static final String modid = "morefuelsmodlight";
	public static final String name = "More Fuels Mod Light";
	public static final String version = "1.0.0";

	@Mod.Instance(modid)
	public static Main instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		System.out.println(name + " is making smelting oh so much better for you!");
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		boolean enableRFtLrecipe = config.get(Configuration.CATEGORY_GENERAL, "enableRFtLrecipe", true).getBoolean(true);
		if(enableRFtLrecipe)
			RFtL.init();
		//Fuels start here
		boolean enableDeadbush = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDeadbush", true).getBoolean(true);
		if(enableDeadbush)
			GameRegistry.registerFuelHandler(new Deadbush());
		boolean enableCactus = config.get(Configuration.CATEGORY_GENERAL, "fuelenableCactus", true).getBoolean(true);
		if(enableCactus)
			GameRegistry.registerFuelHandler(new Cactus());
		boolean enableWeb = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWeb", true).getBoolean(true);
		if(enableWeb)
			GameRegistry.registerFuelHandler(new Web());
		boolean enableLever = config.get(Configuration.CATEGORY_GENERAL, "fuelenableLever", true).getBoolean(true);
		if(enableLever)
			GameRegistry.registerFuelHandler(new Lever());
		boolean enableDoublePlant = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDoublePlant", true).getBoolean(true);
		if(enableDoublePlant)
			GameRegistry.registerFuelHandler(new DoublePlant());
		boolean enableRedFlower = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRedFlower", true).getBoolean(true);
		if(enableRedFlower)
			GameRegistry.registerFuelHandler(new RedFlower());
		boolean enableYellowFlower = config.get(Configuration.CATEGORY_GENERAL, "fuelenableYellowFlower", true).getBoolean(true);
		if(enableYellowFlower)
			GameRegistry.registerFuelHandler(new YellowFlower());
		boolean enableItemFrame = config.get(Configuration.CATEGORY_GENERAL, "fuelenableItemFrame", true).getBoolean(true);
		if(enableItemFrame)
			GameRegistry.registerFuelHandler(new ItemFrame());
		boolean enableBed = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBed", true).getBoolean(true);
		if(enableBed)
			GameRegistry.registerFuelHandler(new Bed());
		boolean enablePainting = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePainting", true).getBoolean(true);
		if(enablePainting)
			GameRegistry.registerFuelHandler(new Painting());
		boolean enableSign = config.get(Configuration.CATEGORY_GENERAL, "fuelenableSign", true).getBoolean(true);
		if(enableSign)
			GameRegistry.registerFuelHandler(new Sign());
		boolean enableLadder = config.get(Configuration.CATEGORY_GENERAL, "fuelenableLadder", true).getBoolean(true);
		if(enableLadder)
			GameRegistry.registerFuelHandler(new Ladder());
		boolean enableRail = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRail", true).getBoolean(true);
		if(enableRail)
			GameRegistry.registerFuelHandler(new Rail());
		boolean enableActivatorRail = config.get(Configuration.CATEGORY_GENERAL, "fuelenableActivatorRail", true).getBoolean(true);
		if(enableActivatorRail)
			GameRegistry.registerFuelHandler(new ActivatorRail());
		boolean enableDetectorRail = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDetectorRail", true).getBoolean(true);
		if(enableDetectorRail)
			GameRegistry.registerFuelHandler(new DetectorRail());
		boolean enablePoweredRail = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePoweredRail", true).getBoolean(true);
		if(enablePoweredRail)
			GameRegistry.registerFuelHandler(new PoweredRail());
		boolean enablePiston = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePiston", true).getBoolean(true);
		if(enablePiston)
			GameRegistry.registerFuelHandler(new Piston());
		boolean enableStickyPiston = config.get(Configuration.CATEGORY_GENERAL, "fuelenableStickyPiston", true).getBoolean(true);
		if(enableStickyPiston)
			GameRegistry.registerFuelHandler(new StickyPiston());
		boolean enableVine = config.get(Configuration.CATEGORY_GENERAL, "fuelenableStickyPiston", true).getBoolean(true);
		if(enableVine)
			GameRegistry.registerFuelHandler(new Vine());
		boolean enableWaterLily = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWaterLily", true).getBoolean(true);
		if(enableWaterLily)
			GameRegistry.registerFuelHandler(new WaterLily());
		boolean enableTripwireHook = config.get(Configuration.CATEGORY_GENERAL, "fuelenableTripwireHook", true).getBoolean(true);
		if(enableTripwireHook)
			GameRegistry.registerFuelHandler(new TripwireHook());
		boolean enableHayBlock = config.get(Configuration.CATEGORY_GENERAL, "fuelenableHayBlock", true).getBoolean(true);
		if(enableHayBlock)
			GameRegistry.registerFuelHandler(new HayBlock());
		boolean enableCarpet = config.get(Configuration.CATEGORY_GENERAL, "fuelenableCarpet", true).getBoolean(true);
		if(enableCarpet)
			GameRegistry.registerFuelHandler(new Carpet());
		boolean enableWool = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWool", true).getBoolean(true);
		if(enableWool)
			GameRegistry.registerFuelHandler(new Wool());
		boolean enableArrow = config.get(Configuration.CATEGORY_GENERAL, "fuelenableArrow", true).getBoolean(true);
		if(enableArrow)
			GameRegistry.registerFuelHandler(new Arrow());
		boolean enableFeather = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFeather", true).getBoolean(true);
		if(enableFeather)
			GameRegistry.registerFuelHandler(new Feather());
		boolean enableWheat = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWheat", true).getBoolean(true);
		if(enableWheat)
			GameRegistry.registerFuelHandler(new Wheat());
		boolean enableWheatSeeds = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWheatSeeds", true).getBoolean(true);
		if(enableWheatSeeds)
			GameRegistry.registerFuelHandler(new WheatSeeds());
		boolean enableMelonSeeds = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMelonSeeds", true).getBoolean(true);
		if(enableMelonSeeds)
			GameRegistry.registerFuelHandler(new MelonSeeds());
		boolean enablePumpkinSeeds = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePumpkinSeeds", true).getBoolean(true);
		if(enablePumpkinSeeds)
			GameRegistry.registerFuelHandler(new PumpkinSeeds());
		boolean enableBeetSeeds = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBeetSeeds", true).getBoolean(true);
		if(enableBeetSeeds)
			GameRegistry.registerFuelHandler(new BeetSeeds());
		boolean enableTorch = config.get(Configuration.CATEGORY_GENERAL, "fuelenableTorch", true).getBoolean(true);
		if(enableTorch)
			GameRegistry.registerFuelHandler(new Torch());
		boolean enableRedstoneTorch = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRedstoneTorch", true).getBoolean(true);
		if(enableRedstoneTorch)
			GameRegistry.registerFuelHandler(new RedstoneTorch());
		boolean enableDoors = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDoors", true).getBoolean(true);
		if(enableDoors)
			GameRegistry.registerFuelHandler(new Doors());
		boolean enableWoodenButton = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWoodenButton", true).getBoolean(true);
		if(enableWoodenButton)
			GameRegistry.registerFuelHandler(new WoodenButton());
		boolean enableBowl = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBowl", true).getBoolean(true);
		if(enableBowl)
			GameRegistry.registerFuelHandler(new Bowl());
		boolean enableSugarcane = config.get(Configuration.CATEGORY_GENERAL, "fuelenableSugarcane", true).getBoolean(true);
		if(enableSugarcane)
			GameRegistry.registerFuelHandler(new Sugarcane());
		boolean enablePaper = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePaper", true).getBoolean(true);
		if(enablePaper)
			GameRegistry.registerFuelHandler(new Paper());
		boolean enableBook = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBook", true).getBoolean(true);
		if(enableBook)
			GameRegistry.registerFuelHandler(new Book());
		boolean enableWritableBook = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWritableBook", true).getBoolean(true);
		if(enableWritableBook)
			GameRegistry.registerFuelHandler(new WritableBook());
		boolean enableWrittenBook = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWrittenBook", true).getBoolean(true);
		if(enableWrittenBook)
			GameRegistry.registerFuelHandler(new WrittenBook());
		boolean enableMinecartWithChest = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMinecartWithChest", true).getBoolean(true);
		if(enableMinecartWithChest)
			GameRegistry.registerFuelHandler(new MinecartWithChest());
		boolean enableMaps = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMaps", true).getBoolean(true);
		if(enableMaps)
			GameRegistry.registerFuelHandler(new Maps());
		boolean enableFishingRod = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFishingRod", true).getBoolean(true);
		if(enableFishingRod)
			GameRegistry.registerFuelHandler(new FishingRod());
		boolean enableCarrotOnAStick = config.get(Configuration.CATEGORY_GENERAL, "fuelenableCarrotOnAStick", true).getBoolean(true);
		if(enableCarrotOnAStick)
			GameRegistry.registerFuelHandler(new CarrotOnAStick());
		boolean enableMushroomItems = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMushroomItems", true).getBoolean(true);
		if(enableMushroomItems)
			GameRegistry.registerFuelHandler(new MushroomItems());
		boolean enableExperimentalMushroomBlocks = config.get(Configuration.CATEGORY_GENERAL, "fuelenableExperimentalMushroomBlocks", true).getBoolean(true);
		if(enableExperimentalMushroomBlocks)
			GameRegistry.registerFuelHandler(new ExperimentalMushroomBlocks());
		boolean enableArmorStand = config.get(Configuration.CATEGORY_GENERAL, "fuelenableArmorStand", true).getBoolean(true);
		if(enableArmorStand)
			GameRegistry.registerFuelHandler(new ArmorStand());
		boolean enableFireCharge = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFireCharge", true).getBoolean(true);
		if(enableFireCharge)
			GameRegistry.registerFuelHandler(new FireCharge());
		boolean enableFireworkCharge = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFireworkCharge", true).getBoolean(true);
		if(enableFireworkCharge)
			GameRegistry.registerFuelHandler(new FireworkCharge());
		boolean enableFireworks = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFireworks", true).getBoolean(true);
		if(enableFireworks)
			GameRegistry.registerFuelHandler(new Fireworks());
		boolean enableGunpowder = config.get(Configuration.CATEGORY_GENERAL, "fuelenableGunpowder", true).getBoolean(true);
		if(enableGunpowder)
			GameRegistry.registerFuelHandler(new Gunpowder());
		boolean enableBlazePowder = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBlazePowder", true).getBoolean(true);
		if(enableBlazePowder)
			GameRegistry.registerFuelHandler(new BlazePowder());
		boolean enableMagmaCream = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMagmaCream", true).getBoolean(true);
		if(enableMagmaCream)
			GameRegistry.registerFuelHandler(new MagmaCream());
		boolean enableGhastTear = config.get(Configuration.CATEGORY_GENERAL, "fuelenableGhastTear", true).getBoolean(true);
		if(enableGhastTear)
			GameRegistry.registerFuelHandler(new GhastTear());
		boolean enableSpawnEgg = config.get(Configuration.CATEGORY_GENERAL, "fuelenableSpawnEgg", false).getBoolean(true);
		if(enableSpawnEgg)
			GameRegistry.registerFuelHandler(new SpawnEgg());
		boolean enablePoisonousPotato = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePoisonousPotato", true).getBoolean(true);
		if(enablePoisonousPotato)
			GameRegistry.registerFuelHandler(new PoisonousPotato());
		boolean enableRottenFlesh = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRottenFlesh", false).getBoolean(true);
		if(enableRottenFlesh)
			GameRegistry.registerFuelHandler(new RottenFlesh());
		boolean enableSpiderEye = config.get(Configuration.CATEGORY_GENERAL, "fuelenableSpiderEye", true).getBoolean(true);
		if(enableSpiderEye)
			GameRegistry.registerFuelHandler(new SpiderEye());
		boolean enableFermentedSpiderEye = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFermentedSpiderEye", true).getBoolean(true);
		if(enableFermentedSpiderEye)
			GameRegistry.registerFuelHandler(new FermentedSpiderEye());
		boolean enableRabbitFoot = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRabitFoot", true).getBoolean(true);
		if(enableRabbitFoot)
			GameRegistry.registerFuelHandler(new RabbitFoot());
		boolean enableLeather = config.get(Configuration.CATEGORY_GENERAL, "fuelenableLeather", true).getBoolean(true);
		if(enableLeather)
			GameRegistry.registerFuelHandler(new Leather());
		boolean enableLeatherArmor = config.get(Configuration.CATEGORY_GENERAL, "fuelenableLeatherArmor", true).getBoolean(true);
		if(enableLeatherArmor)
			GameRegistry.registerFuelHandler(new LeatherArmor());
		boolean enableChorusPlant = config.get(Configuration.CATEGORY_GENERAL, "fuelenableChorusPlant", true).getBoolean(true);
		if(enableChorusPlant)
			GameRegistry.registerFuelHandler(new ChorusPlant());
		boolean enableChorusFlower = config.get(Configuration.CATEGORY_GENERAL, "fuelenableChorusFlower", true).getBoolean(true);
		if(enableChorusFlower)
			GameRegistry.registerFuelHandler(new ChorusFlowers());
		boolean enableShield = config.get(Configuration.CATEGORY_GENERAL, "fuelenableShield", true).getBoolean(true);
		if(enableShield)
			GameRegistry.registerFuelHandler(new Shield());
		boolean enableDragonBreath = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDragonBreath", true).getBoolean(true);
		if(enableDragonBreath)
			GameRegistry.registerFuelHandler(new DragonBreath());
		boolean enableTNT = config.get(Configuration.CATEGORY_GENERAL, "fuelenableTNT", true).getBoolean(true);
		if(enableTNT)
			GameRegistry.registerFuelHandler(new TNT());
		boolean enableTNTMinecart = config.get(Configuration.CATEGORY_GENERAL, "fuelenableTNTMinecart", true).getBoolean(true);
		if(enableTNTMinecart)
			GameRegistry.registerFuelHandler(new TNTMinecart());
		boolean enableExperimentalPotions = config.get(Configuration.CATEGORY_GENERAL, "fuelenableExperimentalPotions", false).getBoolean(true);
		if(enableExperimentalPotions)
			GameRegistry.registerFuelHandler(new ExperimentalPotions());
		config.save();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}