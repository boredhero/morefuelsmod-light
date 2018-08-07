//All the doors, one file, one config flag. Don't like? Too bad.
package com.bored.morefuelsmodlight.fuels;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Doors implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if (fuel.getItem() == Item.itemsList[64]){
			return 600;
		}
		return 0;
	}
}