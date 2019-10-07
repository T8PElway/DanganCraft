package com.t8pelway.t8pmod.init;

import java.util.ArrayList;
import java.util.List;

import com.t8pelway.t8pmod.blocks.BlockBase;
import com.t8pelway.t8pmod.blocks.CrystalAttunementTable;
import com.t8pelway.t8pmod.blocks.OreCrystalBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_CRYSTAL_BLOCK = new OreCrystalBlock("ore_crystal_block", Material.IRON);
	public static final Block CRYSTAL_ATTUNEMENT_TABLE = new CrystalAttunementTable("crystal_attunement_table", Material.ROCK);
	
}
