package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

@SuppressWarnings("deprecation")
public class LeatherArmor implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Items.LEATHER_HELMET){
			return 500;
		}
		if(fuel.getItem() == Items.LEATHER_CHESTPLATE){
			return 800;
		}
		if(fuel.getItem() == Items.LEATHER_LEGGINGS){
			return 700;
		}
		if(fuel.getItem() == Items.LEATHER_BOOTS){
			return 400;
		}
		return 0;
	}
}