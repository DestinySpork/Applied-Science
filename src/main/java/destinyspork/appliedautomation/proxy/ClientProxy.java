package destinyspork.appliedautomation.proxy;

import destinyspork.appliedautomation.blocks.AppliedBlocks;
import destinyspork.appliedautomation.client.render.blocks.BlockRenderRegister;
import destinyspork.appliedautomation.client.render.items.ItemRenderRegister;
import destinyspork.appliedautomation.items.AppliedItems;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.b3d.B3DLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        
        ItemRenderRegister.registerItemRenderer();
        BlockRenderRegister.registerBlockRenderer();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
        
        B3DLoader.instance.addDomain("appliedautomation");
        Item item = Item.getItemFromBlock(AppliedBlocks.ModelTest);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation("appliedautomation:"+item.getUnlocalizedName().substring(5), "inventory"));
        //ModelLoader.setCustomModelResourceLocation(AppliedBlocks.ModelTest, 0, new ModelResourceLocation("appliedautomation:"+item.getUnlocalizedName()));
        
    }
	
}
