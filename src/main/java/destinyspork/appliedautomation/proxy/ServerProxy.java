package destinyspork.appliedautomation.proxy;

import destinyspork.appliedautomation.event.AppliedEventsHandler;
import destinyspork.appliedautomation.world.WorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ServerProxy extends CommonProxy{

	
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
