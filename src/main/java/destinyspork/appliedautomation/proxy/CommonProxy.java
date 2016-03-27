package destinyspork.appliedautomation.proxy;

import destinyspork.appliedautomation.blocks.AppliedBlocks;
import destinyspork.appliedautomation.event.AppliedEventsHandler;
import destinyspork.appliedautomation.event.AppliedKeyBinding;
import destinyspork.appliedautomation.event.KeyInputHandler;
import destinyspork.appliedautomation.event.OreGenEventHandler;
import destinyspork.appliedautomation.items.AppliedItems;
import destinyspork.appliedautomation.misc.OreDictRegister;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	AppliedItems.createItems();
    	AppliedBlocks.createBlocks();
    	OreDictRegister.registerOres();
    	
    	Blocks.iron_ore.setHardness(6.0F);
    	Blocks.gold_block.setHardness(4.00F);
    	Blocks.redstone_ore.setHardness(5.0F);
    	Blocks.emerald_ore.setHardness(7.0F);
    	Blocks.diamond_ore.setHardness(10.0F);
    	
    	
    	FMLCommonHandler.instance().bus().register(new KeyInputHandler());
    	AppliedKeyBinding.init();
    }

    public void init(FMLInitializationEvent e) {
    	MinecraftForge.EVENT_BUS.register(new AppliedEventsHandler());
    	MinecraftForge.ORE_GEN_BUS.register(new AppliedEventsHandler());
    	MinecraftForge.EVENT_BUS.register(new OreGenEventHandler());

    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}
