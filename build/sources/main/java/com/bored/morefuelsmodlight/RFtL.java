package com.bored.morefuelsmodlight;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RFtL {
	public static void init(){
		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 0.3F);
	}

}
