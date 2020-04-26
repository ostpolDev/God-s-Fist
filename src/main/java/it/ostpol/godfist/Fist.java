package it.ostpol.godfist;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Fist extends Item {
	
	public Fist(String unlocalizedName, String registryName) {
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.TOOLS);
		maxStackSize = 1;
		setHarvestLevel("pickaxe", 5);
		setMaxDamage(2000000);
	}
	
	@Override
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		return 200000f;
	}
	
	@Override
	public boolean canHarvestBlock(IBlockState blockIn) {
		return true;
	}
	
}
