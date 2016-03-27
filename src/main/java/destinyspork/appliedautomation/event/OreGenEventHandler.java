package destinyspork.appliedautomation.event;

import java.awt.Toolkit;
import java.util.Random;

import destinyspork.appliedautomation.world.OreSaves;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.OreGenEvent.Pre;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OreGenEventHandler {
	
	@SubscribeEvent
	public void generateOres(PopulateChunkEvent event){
		int chance = event.rand.nextInt(100);
		if(chance >= 99){
			//OreSaves.forworld(event.world).generateOil(event.chunkX, event.chunkZ);
			OreSaves.getSave(event.world).generateOil(event.chunkX, event.chunkZ);
			System.out.println("generated at" + event.chunkX + " " + event.chunkZ);
			Toolkit.getDefaultToolkit().beep();
		}
	}
	
	@SubscribeEvent
	public void loadOres(WorldEvent.Load event){
		//OreSaves.getSave(event.world).readFromNBT(nbt);
	}
}
