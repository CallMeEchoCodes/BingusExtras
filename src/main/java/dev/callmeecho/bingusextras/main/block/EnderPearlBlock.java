package dev.callmeecho.bingusextras.main.block;

import dev.callmeecho.bingusextras.main.BingusExtrasMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class EnderPearlBlock extends BingusExtrasBlock {
    public EnderPearlBlock(Settings settings, BingusExtrasMod.ToolType toolType) {
        super(settings, toolType);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        for(int i = 0; i < 3; ++i) {
            int j = random.nextInt(2) * 2 - 1;
            int k = random.nextInt(2) * 2 - 1;
            double d = (double)pos.getX() + 0.5 + 0.25 * (double)j;
            double e = (float)pos.getY() + random.nextFloat();
            double f = (double)pos.getZ() + 0.5 + 0.25 * (double)k;
            double g = random.nextFloat() * (float)j;
            double h = ((double)random.nextFloat() - 0.5) * 0.125;
            double l = random.nextFloat() * (float)k;
            world.addParticle(ParticleTypes.PORTAL, d, e, f, g, h, l);
        }
    }
}
