package com.bored.morefuelsmodlight.fuels;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DoublePlant implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.itemsList[175]){
			//175 = Tall Grass, Sunflower, Lilac, Large Fern, Rose Bush, Peony
			return 200;
		}

		return 0;
	}
}