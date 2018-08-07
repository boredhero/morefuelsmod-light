//Covers both filled and unfilled maps. Don't like? Tough!
package com.bored.morefuelsmodlight.fuels;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Maps implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.map){
			//Filled Map
			return 2500;
		}
		if(fuel.getItem() == Item.emptyMap){
			//Unfilled Map
			return 2500;
		}
		return 0;
	}
}