package com.t8pelway.t8pmod.blocks;

import net.minecraft.block.material.Material;

public class CrystalAttunementTable extends BlockBase
{

	public CrystalAttunementTable(String name, Material material) 
	{
		super(name, material);
		setHardness(1.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 1);
	
		
		
	}

}
