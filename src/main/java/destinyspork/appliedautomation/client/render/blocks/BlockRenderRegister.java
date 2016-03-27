package destinyspork.appliedautomation.client.render.blocks;

import destinyspork.appliedautomation.blocks.AppliedBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	
	public static void registerBlockRenderer(){
	}
	
	//These should be blocks, but they simply don't work then.
	public static void reg(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("appliedautomation:"+item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
