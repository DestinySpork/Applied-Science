package destinyspork.appliedautomation.client.render.items;

import destinyspork.appliedautomation.blocks.AppliedBlocks;
import destinyspork.appliedautomation.items.AppliedItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {
	
	public static void registerItemRenderer(){
		reg(AppliedItems.analyzer);
		reg(AppliedItems.flint_pick);
		
		reg(Item.getItemFromBlock(AppliedBlocks.oreCopper));
		reg(Item.getItemFromBlock(AppliedBlocks.oreTitanium));
		reg(Item.getItemFromBlock(AppliedBlocks.oreTin));
		reg(Item.getItemFromBlock(AppliedBlocks.oreLead));
		reg(Item.getItemFromBlock(AppliedBlocks.oreSilver));
		reg(Item.getItemFromBlock(AppliedBlocks.oreAluminium));
		
		
		reg(Item.getItemFromBlock(AppliedBlocks.ModelTest));
	}
	
	public static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation("appliedautomation" + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
