package destinyspork.appliedautomation.blocks.ore;

import destinyspork.appliedautomation.AppliedAutomation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class OreSilver extends Block{
	
	public OreSilver(){
		super(Material.ground);
		this.setHardness(3.0F);
		this.setCreativeTab(AppliedAutomation.AppliedTab);
		this.setUnlocalizedName("silver_ore");
		this.setHarvestLevel("pickaxe", 2);
	}
}
