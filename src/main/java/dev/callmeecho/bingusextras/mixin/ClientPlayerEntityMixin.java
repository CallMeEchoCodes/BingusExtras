package dev.callmeecho.bingusextras.mixin;

import com.mojang.authlib.GameProfile;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.MathConstants;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import static dev.callmeecho.bingusextras.main.registry.BingusExtrasItemRegistry.*;

@Mixin(ClientPlayerEntity.class)
public abstract class ClientPlayerEntityMixin extends AbstractClientPlayerEntity {
    @Unique
    private int jumpCount = 0;
    @Unique
    private boolean jumpedLastTick = false;

    public ClientPlayerEntityMixin(ClientWorld world, GameProfile profile) {
        super(world, profile);
    }

    @Inject(method = "tickMovement", at = @At("HEAD"))
    public void tickMovement(CallbackInfo ci) {
        ClientPlayerEntity player = (ClientPlayerEntity) (Object) this;
        if (TrinketsApi.getTrinketComponent(this).get().isEquipped(CLOUD_IN_A_BOTTLE)) {
            if (this.isOnGround()) {
                jumpCount = 1;
            } else if (!jumpedLastTick && jumpCount > 0 && this.getVelocity().y < 0) {
                if (player.input.jumping && !this.getAbilities().flying) {
                    --jumpCount;
                    Vec3d velocity = this.getVelocity();
                    this.setVelocity(velocity.x, this.getJumpVelocity(), velocity.z);
                    this.incrementStat(Stats.JUMP);
                    if (this.isSprinting()) {
                        float yawRadians = this.getYaw() * MathConstants.RADIANS_PER_DEGREE;
                        this.setVelocity(this.getVelocity().add(-MathHelper.sin(yawRadians) * 0.4F, 0.0, MathHelper.cos(yawRadians) * 0.4F));
                        this.addExhaustion(0.2F);
                    } else {
                        this.addExhaustion(0.05F);
                    }
                    
                    this.playSound(SoundEvents.BLOCK_SAND_BREAK, 1, 0.9F + player.getRandom().nextFloat() * 0.2F);
                }
            }
            jumpedLastTick = player.input.jumping;
        }
    }
}
