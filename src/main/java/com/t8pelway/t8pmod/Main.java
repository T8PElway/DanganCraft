package com.t8pelway.t8pmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


import com.t8pelway.t8pmod.proxy.CommonProxy;
import com.t8pelway.t8pmod.util.Referance;
//my notes for this mod:
//Magic of Time and Space. Enables possible item duplication, but with an extreme cost. RF maybe? 
//Time Crystal uses possible save from death? Use while dead (figure out how to add to respawn screen)
//Space Cyrstal uses: Demogorgon from StrangerThings DBD (move in real time far away) possible tech-cost? 
@Mod(modid = Referance.MODID, name = Referance.NAME, version = Referance.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Referance.CLIENT_PROXY_CLASS, serverSide = Referance.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent Event)
	{
		
	}@EventHandler
	public static void init(FMLInitializationEvent Event)
	{
		
	}@EventHandler
	public static void PostInit(FMLPostInitializationEvent Event)
	{
		
	}
}
