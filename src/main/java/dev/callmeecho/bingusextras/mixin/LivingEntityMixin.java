package dev.callmeecho.bingusextras.mixin;

import dev.callmeecho.bingusextras.main.registry.BingusExtrasEnchantmentRegistry;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
    @Shadow public abstract boolean hasStatusEffect(StatusEffect effect);

    @Shadow public abstract ItemStack getEquippedStack(EquipmentSlot var1);

    @Shadow public abstract void setMovementSpeed(float movementSpeed);

    @Shadow protected abstract float getMovementSpeed(float slipperiness);

    @Shadow public abstract boolean isFallFlying();

    @Shadow @Final private AttributeContainer attributes;
    @Unique
    private int ticksInAir = 0;

    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }


    @Inject(at = @At("HEAD"), method = "tick")
    private void tick(CallbackInfo ci) {
        if (this.isOnGround()) {
            ticksInAir = 0;
        } else {
            ticksInAir++;
        }
    }
    
    @ModifyArg(method = "applyMovementInput", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;updateVelocity(FLnet/minecraft/util/math/Vec3d;)V"))
    private float applyMovementInput(float value) {
        int level = EnchantmentHelper.getLevel(BingusExtrasEnchantmentRegistry.AERODYNAMIC, this.getEquippedStack(EquipmentSlot.CHEST));
        if (level > 0 && ticksInAir > (this.hasStatusEffect(StatusEffects.SLOW_FALLING) ? 15 : 10)) {
            return value * (this.hasStatusEffect(StatusEffects.SLOW_FALLING) ? 1.5f : 3f);
        }
        return value;
    }
}
