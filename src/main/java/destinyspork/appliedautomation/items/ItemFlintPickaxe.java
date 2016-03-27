package destinyspork.appliedautomation.items;

import destinyspork.appliedautomation.AppliedAutomation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemFlintPickaxe extends ItemPickaxe {

	public ItemFlintPickaxe() {
		super(AppliedAutomation.flint);
		this.setUnlocalizedName("flint_pick");
	}
	
}
