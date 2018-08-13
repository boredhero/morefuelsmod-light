//Covers both lit and unlit torches in one file!
package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class RedstoneTorch implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.redstone_torch)){
			return 100;
		}
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.unlit_redstone_torch)){
			return 100;
		}
		return 0;
	}
}