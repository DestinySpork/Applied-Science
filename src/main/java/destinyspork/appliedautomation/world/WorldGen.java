package destinyspork.appliedautomation.world;

import java.util.Random;

import destinyspork.appliedautomation.blocks.AppliedBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.getDimensionId()){
		case -1:
		    generateNether(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 0:
		    generateSurface(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 1:
		    generateEnd(world, random, chunkX * 16, chunkZ * 16);
		    break;
		}
	}
	
	private void generateSurface(World world, Random random, int i, int j){
		for(int k = 0; k < 16; k++) { //veins per chunk
			int x = i + random.nextInt(16);
			int y = random.nextInt(64);//Max Y value
			int z = j + random.nextInt(16);
			
			new WorldGenMinable(AppliedBlocks.oreCopper.getDefaultState(), 10).generate(world, random, new BlockPos(x,y,z));
		}
	}
	
	private void generateEnd(World world, Random random, int i, int j){
		
	}
	
	private void generateNether(World world, Random random, int i, int j){
		
	}
	
	public static void genTest(BlockPos pos){
		new WorldGenMinable(Blocks.stone.getDefaultState(), 10).generate(MinecraftServer.getServer().getEntityWorld(), new Random(), pos);
	}
}
