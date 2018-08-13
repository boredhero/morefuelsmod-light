package com.bored.morefuelsmodlight;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.config.Configuration;
import com.bored.morefuelsmodlight.fuels.*;

@Mod(modid = MoreFuelsModLight.MODID, version = MoreFuelsModLight.VERSION, name=MoreFuelsModLight.MODNAME, acceptedMinecraftVersions = "[1.7.2,1.7.10]")
public class MoreFuelsModLight {

	public static final String MODID = "morefuelsmodlight";
	public static final String VERSION = "1.0.1";
	public static final String MODNAME = "More Fuels Mod Light";
	
	@Instance(value = MoreFuelsModLight.MODID)
    public static MoreFuelsModLight instance;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		boolean enableRFtLrecipe = config.get(Configuration.CATEGORY_GENERAL, "enableRFtLrecipe", true).getBoolean(true);
		if(enableRFtLrecipe)
			GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 0.3F);
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
		boolean enableLeather = config.get(Configuration.CATEGORY_GENERAL, "fuelenableLeather", true).getBoolean(true);
		if(enableLeather)
			GameRegistry.registerFuelHandler(new Leather());
		boolean enableLeatherArmor = config.get(Configuration.CATEGORY_GENERAL, "fuelenableLeatherArmor", true).getBoolean(true);
		if(enableLeatherArmor)
			GameRegistry.registerFuelHandler(new LeatherArmor());
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

	
	@EventHandler
	public void init(FMLInitializationEvent event){
		}
}