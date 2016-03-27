package destinyspork.appliedautomation;



import destinyspork.appliedautomation.command.AppliedCommands;
import destinyspork.appliedautomation.event.AppliedEventsHandler;
import destinyspork.appliedautomation.event.OreGenEventHandler;
import destinyspork.appliedautomation.items.AppliedItems;
import destinyspork.appliedautomation.items.ItemWoodenPickaxe;
import destinyspork.appliedautomation.misc.OreDictRegister;
import destinyspork.appliedautomation.proxy.CommonProxy;
import destinyspork.appliedautomation.world.WorldGen;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scala.collection.immutable.List;

@Mod(modid = "appliedautomation", name = "Applied Automation", version = "0.0.0")

public class AppliedAutomation {
	
	public Configuration config;
	
    @SidedProxy(clientSide = "destinyspork.appliedautomation.proxy.ClientProxy", serverSide = "destinyspork.appliedautomation.proxy.ServerProxy")
	public static CommonProxy proxy;
    
    public static final Item.ToolMaterial flint = EnumHelper.addToolMaterial("flint", 0, 96, 3.0F, 0.0F, 5);
	
    @Instance("appliedautomation")
    public static AppliedAutomation instance = new AppliedAutomation();
    
	public static CreativeTabs AppliedTab = new CreativeTabs("Sporks") {
		@Override
		public Item getTabIconItem() {
			return AppliedItems.analyzer;
		}
	};

    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	this.proxy.preInit(e);
    	AppliedItems.removeRecipes();
    	GameRegistry.registerWorldGenerator(new WorldGen(), 0);

    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	this.proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	this.proxy.postInit(e);
    }
    
    @EventHandler
    public void serverLoad(FMLServerStartingEvent event){
    	event.registerServerCommand(new AppliedCommands());
    }
}


