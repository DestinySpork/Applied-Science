package destinyspork.appliedautomation.blocks.ore;

import net.minecraft.block.Block;

import destinyspork.appliedautomation.AppliedAutomation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreAluminium extends Block{
	
	public OreAluminium(){
		super(Material.ground);
		this.setHardness(3.0F);
		this.setCreativeTab(AppliedAutomation.AppliedTab);
		this.setUnlocalizedName("aluminium_ore");
		this.setHarvestLevel("pickaxe", 2);
	}
	
}
