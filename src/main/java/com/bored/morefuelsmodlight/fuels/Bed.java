package com.bored.morefuelsmodlight.fuels;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Bed implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.bed){
			return 1500;
		}
		return 0;
	}
}