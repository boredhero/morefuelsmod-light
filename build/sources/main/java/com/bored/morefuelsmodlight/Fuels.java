package com.bored.morefuelsmodlight;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class Fuels implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel){
		//Examples:
				//if(fuel.getItem() == Items.diamond) {
				//	return 5000;
				//}
				//if(fuel.getItem() == Item.getItemFromBlock(Blocks.deadbush)){
				//	return 50;
				//}
				//Note on timings, 20 = about 1 second in ticks.
		        //As of v1.4.0, no timings may exist under 100 for compatibility with the fuel pellet systems.
		        //All numbers will be rounded to the nearest 100 as well for compatibility with said system.
		        //Numbers 40 or above will be rounded up to the nearest 100.
				if(fuel.getItem() == Item.getItemFromBlock(Blocks.deadbush)){
					return 200;
				}
				if(fuel.getItem() == Item.getItemFromBlock(Blocks.cactus)){
					return 300;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.web)){
					return 200;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.lever)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.grass)){
					return 100;
				}
				//Fix for tall grass and all other doubly tall plants
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.double_plant)){
					return 200;
				}
				//Flowers start here
				//This code SHOULD cover all flowers.
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.red_flower)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.yellow_flower)){
					return 100;
				}
				//Flowers end here
				if (fuel.getItem() == Items.item_frame){
					return 900;
				}
				if (fuel.getItem() == Items.bed){
					return 1500;
				}
				if (fuel.getItem() == Items.painting){
					return 1000;
				}
				if (fuel.getItem() == Items.sign){
					return 700;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.ladder)){
					return 300;
				}
				//Rails start here
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.rail)) {
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.activator_rail)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.detector_rail)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.golden_rail)){
					return 100;
				}
				//Pistons start here
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.piston)){
					return 1000;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.sticky_piston)){
					return 1100;
				}
				//Pistons end here
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.vine)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.waterlily)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.tripwire_hook)){
					return 200;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.hay_block)){
					return 900;
				}
				//Wool and Carpet handled here
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.carpet)){
					return 200;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.wool)){
					return 200;
				}
				//Arrows handled here
				if (fuel.getItem() == Items.arrow){
					return 100;
				}
				if (fuel.getItem() == Items.feather){
					return 100;
				}
				if (fuel.getItem() == Items.wheat){
					return 100;
				}
				if (fuel.getItem() == Items.wheat_seeds){
					return 100;
				}
				if (fuel.getItem() == Items.melon_seeds){
					return 100;
				}
				if (fuel.getItem() == Items.pumpkin_seeds){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.torch)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.redstone_torch)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.unlit_redstone_torch)){
					return 100;
				}
				//Doors! Try the back one ;)
				if (fuel.getItem() == Items.oak_door){
					return 600;
				}
				if (fuel.getItem() == Items.acacia_door){
					return 600;
				}
				if (fuel.getItem() == Items.birch_door){
					//you little birch!
					return 600;
				}
				if (fuel.getItem() == Items.dark_oak_door){
					return 600;
				}
				if (fuel.getItem() == Items.jungle_door){
					return 600;
				}
				if (fuel.getItem() == Items.spruce_door){
					return 600;
				}
				//Buttons
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.wooden_button)){
					return 300;
				}
				if (fuel.getItem() == Items.bowl){
					return 300;
				}
				if (fuel.getItem() == Items.boat){
					return 1500;
				}
				if (fuel.getItem() == Items.reeds){
					return 300;
				}
				if (fuel.getItem() == Items.paper){
					return 300;
				}
				if (fuel.getItem() == Items.book) {
					return 1000;
				}
				if (fuel.getItem() == Items.writable_book){
					//unwritten writable book
					return 1100;
				}
				if (fuel.getItem() == Items.written_book){
					//already written writable book
					return 1100;
				}
				if (fuel.getItem() == Items.chest_minecart){
				//Vanilla chest only burns for 300 Ticks.
					return 400;
				}
				if (fuel.getItem() == Items.map){
					return 2500;
				}
				if (fuel.getItem() == Items.filled_map){
					return 2500;
				}
				//Fishing Rods and Carrot on a Stick.
				if (fuel.getItem() == Items.fishing_rod){
					return 300;
				}
				if (fuel.getItem() == Items.carrot_on_a_stick){
					return 300;
				}
				//This handles ferns, also redundant for some items like dead bush
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.tallgrass)){
					return 200;
				}
				//Mushroom time! Don't get high off the fumes from burning them...
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.brown_mushroom)){
					//This covers the brown mushroom inventory item
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.red_mushroom)){
					//This covers the red mushroom inventory item
					return 100;
				}
				//EXPERIMENTAL SHROOM COMPATIBILITY
				//Never actually bothered to get these items in inventory to test
				//Therefore I have no idea if this is just eating up space or if it works.
				//But someone might need it...so I'll be nice and accommodate them.
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.brown_mushroom_block)){
					//This covers the giant brown mushroom BLOCK in giant mushrooms
					return 200;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.red_mushroom_block)){
					//This covers the giant red mushroom BLOCK in giant mushrooms
					return 200;
				}
				if (fuel.getItem() == Items.armor_stand){
					return 600;
				}
				if (fuel.getItem() == Items.fire_charge){
					return 1500;
				}
				if (fuel.getItem() == Items.firework_charge){
					return 3200;
				}
				if (fuel.getItem() == Items.fireworks){
					return 5100;
				}
				if (fuel.getItem() == Items.gunpowder){
					return 1600;
				}
				if (fuel.getItem() == Items.blaze_powder){
					return 1200;
				}
				if (fuel.getItem() == Items.magma_cream){
					return 2000;
				}
				if (fuel.getItem() == Items.ghast_tear){
					return 2000;
				}
				if (fuel.getItem() == Items.spawn_egg){
					return 5000;
				}
				if (fuel.getItem() == Items.poisonous_potato){
					return 100;
				}
				if (fuel.getItem() == Items.rotten_flesh){
					return 100;
				}
				if (fuel.getItem() == Items.spider_eye){
					return 100;
				}
				if (fuel.getItem() == Items.fermented_spider_eye){
					return 200;
				}
				if (fuel.getItem() == Items.rabbit_foot){
					return 200;
				}
				if (fuel.getItem() == Items.leather){
					return 100;
				}
				if (fuel.getItem() == Items.leather_boots){
					return 400;
				}
				if (fuel.getItem() == Items.leather_chestplate){
					return 800;
				}
				if (fuel.getItem() == Items.leather_helmet){
					return 500;
				}
				if (fuel.getItem() == Items.leather_leggings){
					return 700;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.tnt)){
					return 8100;
				}
				if (fuel.getItem() == Items.tnt_minecart){
					return 8200;
				}
				
				return 0;
	}
}