package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class ArmorStand implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.func_77973_b() == Items.field_179565_cj){
			return 600;
		}
		return 0;
	}
}