package destinyspork.appliedautomation.event;

import java.awt.Toolkit;
import java.util.Random;

import destinyspork.appliedautomation.misc.GenerateTestOre;
import destinyspork.appliedautomation.world.WorldGen;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyInputHandler {
	
    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
    	EntityPlayer player = Minecraft.getMinecraft().thePlayer;
        if(AppliedKeyBinding.oreGen.isPressed()){
        	//player.addChatComponentMessage(new ChatComponentText("Pressed!"));
    		//GenerateTestOre.generate(MinecraftServer.getServer().getEntityWorld(), new Random(), new BlockPos(player.posX, player.posY, player.posZ), 1000, Blocks.diamond_block.getDefaultState());
    		//long time = GenerateTestOre.k - GenerateTestOre.j;
    		//player.addChatComponentMessage(new ChatComponentText(GenerateTestOre.count + " blocks generated in " + time + " ticks (" + time/200 + " seconds)."));
        	Toolkit.getDefaultToolkit().beep();
        	player.addChatComponentMessage(new ChatComponentText("Ding!"));
        }
        	
    }

}
