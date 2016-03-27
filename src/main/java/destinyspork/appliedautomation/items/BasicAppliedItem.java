package destinyspork.appliedautomation.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BasicAppliedItem extends Item{
	
	public BasicAppliedItem(String UnlocalizedName){
		super();
		
		this.setUnlocalizedName(UnlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
}
