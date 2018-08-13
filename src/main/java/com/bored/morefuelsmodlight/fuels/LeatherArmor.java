package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class LeatherArmor implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Items.leather_helmet){
			return 500;
		}
		if(fuel.getItem() == Items.leather_chestplate){
			return 800;
		}
		if(fuel.getItem() == Items.leather_leggings){
			return 700;
		}
		if(fuel.getItem() == Items.leather_boots){
			return 400;
		}
		return 0;
	}
}