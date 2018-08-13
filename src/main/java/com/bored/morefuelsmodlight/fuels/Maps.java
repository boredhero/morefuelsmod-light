//Covers both filled and unfilled maps. Don't like? Tough!
package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class Maps implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Items.map){
			return 2500;
		}
		if(fuel.getItem() == Items.filled_map){
			return 2500;
		}
		return 0;
	}
}