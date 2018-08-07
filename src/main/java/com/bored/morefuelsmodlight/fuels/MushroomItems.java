//These are the mushroom items.
package com.bored.morefuelsmodlight.fuels;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MushroomItems implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.itemsList[40]){
			//40 = Red Mushroom Item
			return 100;
		}
		if(fuel.getItem() == Item.itemsList[39]){
			//39 = Brown Mushroom Item
			return 100;
		}
		return 0;
	}
}