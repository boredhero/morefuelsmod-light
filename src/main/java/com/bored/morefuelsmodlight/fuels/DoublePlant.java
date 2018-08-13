//This class is a fix for double tall grass and other doubly tall plants and flowers.
//Not 100% Sure its necessary, but its a failsafe.
package com.bored.morefuelsmodlight.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class DoublePlant implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.double_plant)){
			return 200;
		}
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.tallgrass)){
			return 200;
		}
		return 0;
	}
}