package destinyspork.appliedautomation.world;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.storage.MapStorage;

public class OreSaves extends WorldSavedData{
	
	private int[] oil2;
	public List<Integer> oil = new ArrayList<Integer>();
	public List<Integer> newOil = new ArrayList<Integer>();
	
	public OreSaves() {
		super(key);
	}
	
	
	public boolean isOilChunk(Chunk chunk){
		
		
		if(oil.contains(chunk.xPosition)){
			return true;
		}
		
		return false;
	}

	public final static String key = "appliedscience.oregens";
	
	/**
	 * this was in the tutorial, not sure what it's needed for
	public static OreSaves forworld(World world){
		MapStorage storage = world.getPerWorldStorage();
		OreSaves result = (OreSaves)storage.loadData(OreSaves.class, key);
		if(result == null){
			result = new OreSaves();
			storage.setData(key,  result);
		}
		return new OreSaves();
	}
	**/
	
	public static OreSaves getSave(World world){
		MapStorage storage = world.getPerWorldStorage();
		OreSaves instance = (OreSaves) storage.loadData(OreSaves.class, key);
		if(instance == null){
			instance = new OreSaves();
			storage.setData(key,  instance);
		}
		return instance;
	}
	
	/**
	 * @param chunkX The <b> Chunk </b> x coordinate, not the block coord.
	 * @param chunkZ Same as above for Z
	 */
	
	
	// ...
	public void generateOil(int chunkX, int chunkZ){
		System.out.println("Oil was generated");
		System.out.println("Added " + chunkX + " , " + chunkZ);
		
		
		newOil.addAll(oil);
		newOil.add(chunkX);
		newOil.add(chunkZ);
		oil = newOil;
	
		this.markDirty();
	
	}
	
	
	
	/**
	 * <i> Requires </i> Java 8 or higher
	 */
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		System.out.println("Read from NBT!");
		int[] t = nbt.getIntArray("Oil");
		oil = IntStream.of(t).boxed().collect(Collectors.toList());
		
	}
	
	/**
	 * <i> Requires </i> Java 8 or higher
	 */
	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		System.err.println("Writing NBT");
		int[] t = oil.stream().mapToInt(e -> e).toArray();
		nbt.setIntArray("Oil", t);
	}
}
