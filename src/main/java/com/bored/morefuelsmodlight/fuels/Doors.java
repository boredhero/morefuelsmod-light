//All the doors, one file, one config flag. Don't like? Too bad.
package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class Doors implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if (fuel.getItem() == Items.wooden_door){
			return 600;
		}
		return 0;
	}
}