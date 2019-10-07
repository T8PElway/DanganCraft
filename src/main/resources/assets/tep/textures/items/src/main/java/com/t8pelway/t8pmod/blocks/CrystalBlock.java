package com.t8pelway.t8pmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CrystalBlock extends BlockBase
{

	public CrystalBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(2.0F);
	}

}
