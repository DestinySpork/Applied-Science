package destinyspork.appliedautomation.blocks;

import destinyspork.appliedautomation.AppliedAutomation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModelTest extends Block {
	
	public ModelTest(){
		super(Material.iron);
		this.setCreativeTab(AppliedAutomation.AppliedTab);
		this.setUnlocalizedName("ModelTest");
	}
	
}
