package com.t8pelway.t8pmod.blocks;

import java.util.Random;

import com.t8pelway.t8pmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class OreCrystalBlock extends BlockBase 
{

	public OreCrystalBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.5F);
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune ){
		return ModItems.CRYSTAL;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		int max = 4;
		int min = 1;
		return rand.nextInt(max)+min;
	}
}
