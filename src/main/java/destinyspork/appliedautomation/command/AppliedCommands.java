package destinyspork.appliedautomation.command;

import java.util.ArrayList;
import java.util.List;


import destinyspork.appliedautomation.world.OreSaves;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class AppliedCommands implements ICommand{
	
	
	private final List aliases;
	
	public AppliedCommands(){
		aliases = new ArrayList();
		aliases.add("appliedautomation");
		aliases.add("aa");
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	@Override
	public String getName() {
		return "appliedautomation";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "appliedautomation <getOreInChunk>";
	}

	@Override
	public List getAliases() {
		return this.aliases;
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		//boolean isOil = OreSaves.forworld(sender.getEntityWorld()).isOilChunk(sender.getEntityWorld().getChunkFromBlockCoords(sender.getPosition()));
		boolean isOil = OreSaves.getSave(sender.getEntityWorld()).isOilChunk(sender.getEntityWorld().getChunkFromBlockCoords(sender.getPosition()));
		if(isOil) sender.addChatMessage(new ChatComponentText("The current chunk contains "+EnumChatFormatting.DARK_GRAY+"Oil."));
		
		else
		sender.addChatMessage(new ChatComponentText("The current chunk contains no ores."));
		return;
	}

	@Override
	public boolean canCommandSenderUse(ICommandSender sender) {
		if(sender.canUseCommand(2, getName()))
			return true;
		return false;
	}

	@SuppressWarnings("null")
	@Override
	public List addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
		List li = null;
		li.add("getOreInChunk");
		return li;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		return false;
	}
	
	
}
