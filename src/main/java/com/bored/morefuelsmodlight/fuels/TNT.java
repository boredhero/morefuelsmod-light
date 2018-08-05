package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

@SuppressWarnings("deprecation")
public class TNT implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.TNT)){
			return 8100;
		}
		return 0;
	}
}