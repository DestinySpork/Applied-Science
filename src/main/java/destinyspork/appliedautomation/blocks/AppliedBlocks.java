package destinyspork.appliedautomation.blocks;

import destinyspork.appliedautomation.blocks.ore.OreAluminium;
import destinyspork.appliedautomation.blocks.ore.OreCopper;
import destinyspork.appliedautomation.blocks.ore.OreLead;
import destinyspork.appliedautomation.blocks.ore.OreSilver;
import destinyspork.appliedautomation.blocks.ore.OreTin;
import destinyspork.appliedautomation.blocks.ore.OreTitanium;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AppliedBlocks {
	public static Block ModelTest;
	//ores
	public static Block oreTitanium;
	public static Block oreCopper;
	public static Block oreTin;
	public static Block oreAluminium;
	public static Block oreSilver;
	public static Block oreSilicon;
	public static Block oreLead;

	public static void createBlocks(){
		
		
		//ores
		oreCopper = new OreCopper();
		oreTin = new OreTin();
		oreAluminium = new OreAluminium();
		oreSilver = new OreSilver();
		oreLead = new OreLead();
		oreTitanium = new OreTitanium();
		oreSilver = new OreSilver();
		
		ModelTest = new ModelTest();
		
		GameRegistry.registerBlock(ModelTest, "ModelTest");
		
		GameRegistry.registerBlock(oreCopper, "copper_ore");
		GameRegistry.registerBlock(oreAluminium, "aluminium_ore");
		GameRegistry.registerBlock(oreTin, "tin_ore");
		GameRegistry.registerBlock(oreLead, "lead_ore");
		GameRegistry.registerBlock(oreTitanium, "titanium_ore");
		GameRegistry.registerBlock(oreSilver, "silver_ore");
	}
	
}
