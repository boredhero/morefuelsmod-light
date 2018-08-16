//All the doors, one file, one config flag. Don't like? Too bad.
package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class Doors implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
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
		return 0;
	}
}