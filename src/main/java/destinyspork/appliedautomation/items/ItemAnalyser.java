package destinyspork.appliedautomation.items;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class ItemAnalyser extends BasicAppliedItem 
{

	public ItemAnalyser() {
		super("analyzer");
		this.setFull3D();
	}

	//methods here
	
	
	@Override
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		if(!worldIn.isRemote){
			ItemStack is = new ItemStack(worldIn.getBlockState(pos).getBlock());
			String name = worldIn.getBlockState(pos).toString();
			playerIn.addChatMessage(new ChatComponentText(""));
			playerIn.addChatComponentMessage(new ChatComponentText(("Display Name: "+worldIn.getBlockState(pos).getBlock().getLocalizedName())));
			playerIn.addChatComponentMessage(new ChatComponentText((EnumChatFormatting.GRAY + "Actual Name: "+name.substring(0, name.indexOf("[") == -1 ? name.length() : name.indexOf("[")))));
			playerIn.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.YELLOW + "Metadata: "+worldIn.getBlockState(pos).getBlock().getMetaFromState(worldIn.getBlockState(pos))));
			playerIn.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN+"OreDict entries:"));
			for(int i = 0; i < OreDictionary.getOreIDs(is).length; i ++){
				playerIn.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE +OreDictionary.getOreName(OreDictionary.getOreIDs(is)[i])));
			}
			if(OreDictionary.getOreIDs(is).length == 0) playerIn.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "None"));
}
        return true;
    }
}
