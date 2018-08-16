package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class ExperimentalMushroomBlocks implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.brown_mushroom_block)){
			return 200;
		}
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.red_mushroom_block)){
			return 200;
		}
		return 0;
	}
}