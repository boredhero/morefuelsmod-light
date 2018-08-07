//Covers both lit and unlit torches in one file!
package com.bored.morefuelsmodlight.fuels;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RedstoneTorch implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.itemsList[76]){
			//76 Redstone Torch (Lit)
			return 100;
		}
		if(fuel.getItem() == Item.itemsList[75]){
			//75 = Redstone Torch (Unlit)
			//An Item nobody should really have...but I'm a competionist with this xD
			return 100;
		}
		return 0;
	}
}