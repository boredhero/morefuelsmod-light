package com.bored.morefuelsmodlight.fuels;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Grass implements IFuelHandler {
	
	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == Item.itemsList[31]) {
			return 100;
		}
		return 0;
	}

}
