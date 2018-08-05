package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class BlazePowder implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Items.BLAZE_POWDER){
			return 1200;
		}
		return 0;
	}
}