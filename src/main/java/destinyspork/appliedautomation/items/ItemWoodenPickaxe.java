package destinyspork.appliedautomation.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemWoodenPickaxe extends ItemPickaxe{

	public ItemWoodenPickaxe() {
		super(ToolMaterial.WOOD);
		this.setUnlocalizedName("wooden_pickaxe");
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4){
		list.add(EnumChatFormatting.DARK_RED + "A wooden pick is not capable of mining anything! Try making one out of flint.");
	}

}
