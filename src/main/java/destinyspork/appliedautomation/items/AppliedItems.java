package destinyspork.appliedautomation.items;

import java.util.Iterator;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class AppliedItems {
	
	public static Item analyzer;
	public static Item flint_pick;
	public static Item wooden_pick;
	
	public static void createItems(){
		GameRegistry.registerItem(analyzer = new ItemAnalyser(), "analyzer");
		GameRegistry.registerItem(flint_pick = new ItemFlintPickaxe(), "flint_pick");
		//GameRegistry.registerItem(wooden_pick = new ItemWoodenPickaxe(), "wooden_pickaxe", "minecraft");
	}
	
	public static void removeRecipes(){
    	Iterator<IRecipe> iterator = CraftingManager.getInstance().getRecipeList().iterator();

    	while (iterator.hasNext())
    	{
    	    IRecipe recipe = iterator.next();
    	    if (recipe == null)
    	     continue;
    	    ItemStack output = recipe.getRecipeOutput();
    	    if (output != null && output.getItem() == Items.wooden_pickaxe)
    	     iterator.remove();
    	}
    }
	
}
