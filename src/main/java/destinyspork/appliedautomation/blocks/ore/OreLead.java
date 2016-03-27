package destinyspork.appliedautomation.blocks.ore;

import destinyspork.appliedautomation.AppliedAutomation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreLead extends Block {
	public OreLead(){
		super(Material.ground);
		this.setHardness(3.0F);
		this.setCreativeTab(AppliedAutomation.AppliedTab);
		this.setUnlocalizedName("lead_ore");
		this.setHarvestLevel("pickaxe", 2);
	}
	
}
