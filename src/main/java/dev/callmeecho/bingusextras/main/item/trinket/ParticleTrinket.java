package dev.callmeecho.bingusextras.main.item.trinket;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.tick.Tick;

import java.util.Random;

public class ParticleTrinket extends TrinketItem {
    private final ParticleEffect particleType;
    
    public ParticleTrinket(Settings settings, ParticleEffect particleType) {
        super(settings);
        this.particleType = particleType;
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.getWorld().addParticle(particleType, entity.getParticleX(1), entity.getRandomBodyY() - 0.25, entity.getParticleZ(1), (entity.getRandom().nextDouble() - 0.5) * 0.1, -entity.getRandom().nextDouble() * 0.05, (entity.getRandom().nextDouble() - 0.5) * 0.1);
    }
}
