package com.bored.morefuelsmodlight.fuels;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Piston implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.itemsList[33]){
			//33 = Regular Piston
			return 1000;
		}
		return 0;
	}
}