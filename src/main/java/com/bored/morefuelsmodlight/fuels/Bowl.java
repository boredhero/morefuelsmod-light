package com.bored.morefuelsmodlight.fuels;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Bowl implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.bowlEmpty){
			return 300;
		}
		return 0;
	}
}