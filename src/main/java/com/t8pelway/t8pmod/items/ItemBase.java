package com.t8pelway.t8pmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.t8pelway.t8pmod.Main;
import com.t8pelway.t8pmod.init.ModItems;
import com.t8pelway.t8pmod.util.IHasModel;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");

		
	}

}
