package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

@SuppressWarnings("deprecation")
public class WritableBook implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Items.WRITABLE_BOOK){
			return 1100;
		}
		return 0;
	}
}