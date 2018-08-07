//There is no way to set specific potions as far as I can tell, so it would enable anything minecraft considers a "POTIONITEM". 
package com.bored.morefuelsmodlight.fuels;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ExperimentalPotions implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == Item.itemsList[373]) {
			//373 should enable all potions via ID
			return 600;
		}
		if(fuel.getItem() == Item.potion) {
			//Not sure what this does, but its just to be double safe on potions.
			//Item.potion doesn't even exist at all in later minecraft versions.
			return 600;
		}
		return 0;
	}
}