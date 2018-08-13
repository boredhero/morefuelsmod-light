//There is no way to set specific potions as far as I can tell, so it would enable anything minecraft considers a "POTIONITEM". 
package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class ExperimentalPotions implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Items.potionitem){
			return 600;
		}
		return 0;
	}
}