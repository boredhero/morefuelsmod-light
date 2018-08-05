package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

@SuppressWarnings("deprecation")
public class Web implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.WEB)){
			return 200;
		}
		return 0;
	}
}