package com.bored.morefuelsmodlight.fuels;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LeatherArmor implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.helmetLeather){
			return 500;
		}
		if(fuel.getItem() == Item.plateLeather){
			return 800;
		}
		if(fuel.getItem() == Item.legsLeather){
			return 700;
		}
		if(fuel.getItem() == Item.bootsLeather){
			return 400;
		}
		return 0;
	}
}