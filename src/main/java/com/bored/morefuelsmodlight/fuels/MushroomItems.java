//These are the mushroom items.
package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class MushroomItems implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.red_mushroom)){
			return 100;
		}
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.brown_mushroom)){
			return 100;
		}
		return 0;
	}
}