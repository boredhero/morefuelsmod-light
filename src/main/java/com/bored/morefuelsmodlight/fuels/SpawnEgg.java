package com.bored.morefuelsmodlight.fuels;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SpawnEgg implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.itemsList[383]){
			//383 = Spawn Eggs
			//Should make them all work...can't be sure though
			return 5000;
		}
		return 0;
	}
}