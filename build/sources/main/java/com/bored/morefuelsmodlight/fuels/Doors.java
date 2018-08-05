//All the doors, one file, one config flag. Don't like? Too bad.
package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

@SuppressWarnings("deprecation")
public class Doors implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if (fuel.getItem() == Items.OAK_DOOR){
			return 600;
		}
		if (fuel.getItem() == Items.ACACIA_DOOR){
			return 600;
		}
		if (fuel.getItem() == Items.BIRCH_DOOR){
			//you little birch!
			return 600;
		}
		if (fuel.getItem() == Items.DARK_OAK_DOOR){
			return 600;
		}
		if (fuel.getItem() == Items.JUNGLE_DOOR){
			return 600;
		}
		if (fuel.getItem() == Items.SPRUCE_DOOR){
			return 600;
		}
		return 0;
	}
}