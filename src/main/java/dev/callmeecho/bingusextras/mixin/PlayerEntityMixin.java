package dev.callmeecho.bingusextras.mixin;

import dev.callmeecho.bingusextras.main.registry.BingusExtrasEnchantmentRegistry;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static dev.callmeecho.bingusextras.main.registry.BingusExtrasItemRegistry.CLOUD_IN_A_BOTTLE;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
    @ModifyVariable(method = "handleFallDamage", at = @At("HEAD"), ordinal = 0, argsOnly = true)
    private float handleFallDamage(float fallDistance) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        if (TrinketsApi.getTrinketComponent(player).get().isEquipped(CLOUD_IN_A_BOTTLE)) {
            fallDistance = Math.max(0, fallDistance - 2);
        }
        return fallDistance;
    }
    
    @Unique
    private int ticksInAir = 0;
    

    @Inject(at = @At("HEAD"), method = "tick")
    private void tick(CallbackInfo ci) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        if (player.isOnGround()) {
            ticksInAir = 0;
        } else {
            ticksInAir++;
        }
        int level = EnchantmentHelper.getLevel(BingusExtrasEnchantmentRegistry.AERODYNAMIC, player.getEquippedStack(EquipmentSlot.CHEST));
        if (level > 0 && ticksInAir > (player.hasStatusEffect(StatusEffects.SLOW_FALLING) ? 15 : 10)) airStrafingSpeed = airStrafingSpeed * (hasStatusEffect(StatusEffects.SLOW_FALLING) ? 4f : 7.5f);
    }
}
