package com.bored.morefuelsmodlight.fuels;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ExperimentalMushroomBlocks implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.itemsList[99]){
			//99 = Brown Mushroom Block
			return 200;
		}
		if(fuel.getItem() == Item.itemsList[100]){
			//100 = Red Mushroom Block
			return 200;
		}
		return 0;
	}
}