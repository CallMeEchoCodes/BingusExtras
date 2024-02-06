package dev.callmeecho.bingusextras.mixin;

import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

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
}
