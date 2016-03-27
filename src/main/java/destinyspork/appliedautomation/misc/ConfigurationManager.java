package destinyspork.appliedautomation.misc;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigurationManager extends Configuration{
	
	public boolean copper_ore, lead_ore, tin_ore, aluminium_ore, silver_ore;
	
	public ConfigurationManager(FMLPreInitializationEvent e){
		super(e.getSuggestedConfigurationFile());
		load();
		
		copper_ore = getBoolean("Copper Ore", "Ore Generation", true, "Enable/Disable generation of copper ore");
		tin_ore = getBoolean("Tin Ore", "Ore Generation", true, "Enable/Disable generation of tin ore");
		lead_ore = getBoolean("Lead Ore", "Ore Generation", true, "Enable/Disable generation of lead ore");
		aluminium_ore = getBoolean("Aluminium Ore", "Ore Generation", true, "Enable/Disable generation of aluminium ore");
		silver_ore = getBoolean("Silver Ore", "Ore Generation", true, "Enable/Disable generation of silver ore");
		
		save();
	}

	
}

