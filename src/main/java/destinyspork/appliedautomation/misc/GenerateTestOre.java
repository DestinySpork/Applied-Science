package destinyspork.appliedautomation.misc;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class GenerateTestOre {
	
	public static int count;
	public static long j, k;
	
    public static boolean generate(World worldIn, Random p_180709_2_, BlockPos pos, int numberOfBlocks, IBlockState oreBlock)
    {
    	count = 0;
    	j = MinecraftServer.getCurrentTimeMillis();
        float f = p_180709_2_.nextFloat() * (float)Math.PI;
        double d0 = (double)((float)(pos.getX() + 8) + MathHelper.sin(f) * (float)numberOfBlocks / 8.0F);
        double d1 = (double)((float)(pos.getX() + 8) - MathHelper.sin(f) * (float)numberOfBlocks / 8.0F);
        double d2 = (double)((float)(pos.getZ() + 8) + MathHelper.cos(f) * (float)numberOfBlocks / 8.0F);
        double d3 = (double)((float)(pos.getZ() + 8) - MathHelper.cos(f) * (float)numberOfBlocks / 8.0F);
        double d4 = (double)(pos.getY() + p_180709_2_.nextInt(3) - 2);
        double d5 = (double)(pos.getY() + p_180709_2_.nextInt(3) - 2);

        for (int i = 0; i < numberOfBlocks; ++i)
        {
            float f1 = (float)i / (float)numberOfBlocks;
            double d6 = d0 + (d1 - d0) * (double)f1;
            double d7 = d4 + (d5 - d4) * (double)f1;
            double d8 = d2 + (d3 - d2) * (double)f1;
            double d9 = p_180709_2_.nextDouble() * (double)numberOfBlocks / 16.0D;
            double d10 = (double)(MathHelper.sin((float)Math.PI * f1) + 1.0F) * d9 + 1.0D;
            double d11 = (double)(MathHelper.sin((float)Math.PI * f1) + 1.0F) * d9 + 1.0D;
            int j = MathHelper.floor_double(d6 - d10 / 8.0D);
            int k = MathHelper.floor_double(d7 - d11 / 2.0D);
            int l = MathHelper.floor_double(d8 - d10 / 2.0D);
            int i1 = MathHelper.floor_double(d6 + d10 / 2.0D);
            int j1 = MathHelper.floor_double(d7 + d11 * 2.0D);
            int k1 = MathHelper.floor_double(d8 + d10 / 2.0D);

            for (int l1 = j; l1 <= i1; ++l1)
            {
                double d12 = ((double)l1 + 0.5D - d6) / (d10 / 2.0D);

                if (d12 * d12 < 1.0D)
                {
                    for (int i2 = k; i2 <= j1; ++i2)
                    {
                        double d13 = ((double)i2 + 0.5D - d7) / (d11 / 2.0D);

                        if (d12 * d12 + d13 * d13 < 1.0D)
                        {
                            for (int j2 = l; j2 <= k1; ++j2)
                            {
                                double d14 = ((double)j2 + 0.5D - d8) / (d10 / 2.0D);

                                if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D)
                                {
                                    BlockPos blockpos1 = new BlockPos(l1, i2, j2);
                                    if(!(worldIn.getBlockState(blockpos1).getBlock() == oreBlock.getBlock())){
                                    	System.out.println(worldIn.getBlockState(blockpos1).getBlock().getLocalizedName());
                                    	worldIn.setBlockState(blockpos1, oreBlock, 2);
                                    	count ++ ;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        k = MinecraftServer.getCurrentTimeMillis();
        return true;
    }
	
	
}
