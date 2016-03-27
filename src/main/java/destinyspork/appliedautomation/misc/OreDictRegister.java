package destinyspork.appliedautomation.misc;

import destinyspork.appliedautomation.blocks.AppliedBlocks;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictRegister {
	
	public static void registerOres(){
		OreDictionary.registerOre("oreCopper", AppliedBlocks.oreCopper);
		OreDictionary.registerOre("oreTin", AppliedBlocks.oreTin);
		OreDictionary.registerOre("oreSilver", AppliedBlocks.oreSilver);
		OreDictionary.registerOre("oreAluminium", AppliedBlocks.oreAluminium);
		OreDictionary.registerOre("oreTitanium", AppliedBlocks.oreTitanium);
		OreDictionary.registerOre("oreLead", AppliedBlocks.oreLead);
	}
	
}
