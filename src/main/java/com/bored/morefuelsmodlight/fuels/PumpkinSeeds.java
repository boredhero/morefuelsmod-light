package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

@SuppressWarnings("deprecation")
public class PumpkinSeeds implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Items.PUMPKIN_SEEDS){
			return 100;
		}
		return 0;
	}
}