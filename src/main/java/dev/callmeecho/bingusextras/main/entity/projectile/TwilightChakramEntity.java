package dev.callmeecho.bingusextras.main.entity.projectile;

import dev.callmeecho.bingusextras.main.item.TwilightChakram;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasEnchantmentRegistry;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasItemRegistry;
import net.fabricmc.loader.impl.lib.sat4j.core.Vec;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.projectile.thrown.ThrownEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import org.apache.http.conn.BasicEofSensorWatcher;
import org.spongepowered.tools.obfuscation.fg3.ObfuscationEnvironmentFG3;

import java.util.Objects;

public class TwilightChakramEntity extends ThrownEntity implements FlyingItemEntity {
    private ItemStack stack = ItemStack.EMPTY;

    public int returnTimer;

    private static final TrackedData<Boolean> RETURNING = DataTracker.registerData(TwilightChakramEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    private static final TrackedData<Byte> LOYALTY = DataTracker.registerData(TwilightChakramEntity.class, TrackedDataHandlerRegistry.BYTE);
    private static final TrackedData<Byte> SHARPNESS = DataTracker.registerData(TwilightChakramEntity.class, TrackedDataHandlerRegistry.BYTE);
    private static final TrackedData<Boolean> HOMING = DataTracker.registerData(TwilightChakramEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    private static final TrackedData<Byte> FIRE_ASPECT = DataTracker.registerData(TwilightChakramEntity.class, TrackedDataHandlerRegistry.BYTE);
    private static final TrackedData<Byte> RETURN_SLOT = DataTracker.registerData(TwilightChakramEntity.class, TrackedDataHandlerRegistry.BYTE);

    public TwilightChakramEntity(EntityType<TwilightChakramEntity> entityType, World world) {
        super(entityType, world);
    }
    
    public TwilightChakramEntity(EntityType<TwilightChakramEntity> type, LivingEntity owner, World world, ItemStack stack, int returnSlot) {
        super(type, owner, world);
        this.stack = stack;
        this.dataTracker.set(LOYALTY, (byte) EnchantmentHelper.getLoyalty(stack));
        this.dataTracker.set(SHARPNESS, (byte) EnchantmentHelper.getAttackDamage(stack, EntityGroup.DEFAULT));
        this.dataTracker.set(HOMING, EnchantmentHelper.getLevel(BingusExtrasEnchantmentRegistry.HOMING, stack) > 0);
        this.dataTracker.set(FIRE_ASPECT, (byte) EnchantmentHelper.getFireAspect(owner));
        this.dataTracker.set(RETURN_SLOT, (byte) returnSlot);
    }

    @Override
    protected void initDataTracker() {
        this.dataTracker.startTracking(RETURNING, false);
        this.dataTracker.startTracking(LOYALTY, (byte)0);
        this.dataTracker.startTracking(SHARPNESS, (byte)0);
        this.dataTracker.startTracking(HOMING, false);
        this.dataTracker.startTracking(FIRE_ASPECT, (byte)0);
        this.dataTracker.startTracking(RETURN_SLOT, (byte)0);
    }

    @Override
    protected float getGravity() {
        return 0;
    }
    
    @Override
    public void tick() {
        Vec3d velocity = this.getVelocity();
        super.tick();
        this.setVelocity(velocity);

        // Homing toward nearest entity that is not the owner
        if (this.dataTracker.get(HOMING) && !this.dataTracker.get(RETURNING)) {
            LivingEntity closestEntity = this.getWorld().getClosestEntity(LivingEntity.class, TargetPredicate.createAttackable().setBaseMaxDistance(20.0), (LivingEntity) this.getOwner(), this.getX(), this.getY(), this.getZ(), this.getBoundingBox().expand(20.0, 20.0, 20.0));
            if (closestEntity != null) {
                Vec3d location = closestEntity.getEyePos().subtract(this.getPos());
                this.setVelocity(location.normalize());
            }
        }
        
        if (age > 30 && !this.dataTracker.get(RETURNING)) {
            this.dataTracker.set(RETURNING, true);
        }
        
        if (this.dataTracker.get(RETURNING)) {
            if (this.getOwner() == null) {
                this.returnTimer = 0;
                this.getWorld().spawnEntity(new ItemEntity(this.getWorld(), this.getX(), this.getY(), this.getZ(), this.getStack()));
                discard();
                return;
            }
            Vec3d location = this.getOwner().getEyePos().subtract(this.getPos());
            this.setVelocity(location.normalize().multiply(0.2 * (this.dataTracker.get(LOYALTY) + 1)));
//            if (returnTimer > 20) {
//                this.setPos(location.x + 0.5, location.y + 0.5, location.z + 0.5);
//                this.returnTimer = 0;
//            }
            returnTimer++;
        }
        
        if (this.getWorld().isClient()) {
            this.getWorld().addParticle(ParticleTypes.END_ROD, this.getX() + 0.1 * (Math.random() - 0.75), this.getY() + 0.1 * (Math.random() - 0.75), this.getZ() + 0.1 * (Math.random() - 0.75), 0.1 * (Math.random() - 0.75), 0.1 * (Math.random() - 0.75), 0.1 * (Math.random() - 0.75));
        }
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        if (!this.getWorld().isClient) {
            if (this.dataTracker.get(RETURNING)) return;

            SoundEvent soundEvent = this.getWorld().getBlockState(blockHitResult.getBlockPos()).getSoundGroup().getBreakSound();
            this.getWorld().playSound(
                    null,
                    this.getX(),
                    this.getY(),
                    this.getZ(),
                    soundEvent,
                    this.getSoundCategory(),
                    1.0f,
                    1.0f
            );

            if (this.dataTracker.get(LOYALTY) > 0) {
                this.dataTracker.set(RETURNING, true);
            } else {
                this.getWorld().spawnEntity(new ItemEntity(this.getWorld(), this.getX(), this.getY(), this.getZ(), this.getStack()));
                discard();
            }
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        if (!this.getWorld().isClient) {
            if (entityHitResult.getEntity() instanceof LivingEntity livingEntity) {
                if (livingEntity == this.getOwner()) {
                    PlayerEntity playerEntity = (PlayerEntity) livingEntity;
                    if (!playerEntity.isCreative()) {
                        ItemStack stack = this.getStack();
                        int returnSlot = this.dataTracker.get(RETURN_SLOT);
                        if (returnSlot < 0 || returnSlot > 36) {
                            if (playerEntity.getOffHandStack().isEmpty()) {
                                playerEntity.setStackInHand(Hand.OFF_HAND, stack);
                            } else {
                                playerEntity.getInventory().offerOrDrop(stack);
                            }
                            this.returnTimer = 0;
                            discard();
                            return;
                        }
                        
                        if (playerEntity.getInventory().getStack(returnSlot).isEmpty()) {
                            playerEntity.getInventory().setStack(returnSlot, stack);
                        } else {
                            playerEntity.getInventory().offerOrDrop(stack);
                        }
                    }
                    this.returnTimer = 0;
                    discard();
                    return;
                }
                if (this.dataTracker.get(RETURNING)) return;
                this.dataTracker.set(RETURNING, true);
                livingEntity.damage(getDamageSources().generic(), 9 + this.dataTracker.get(SHARPNESS));
                if (this.dataTracker.get(FIRE_ASPECT) > 0) {
                    livingEntity.setOnFireFor(4 * this.dataTracker.get(FIRE_ASPECT));
                }
                this.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_PLAYER_ATTACK_CRIT, this.getSoundCategory(), 1.0f, 1.0f);
            }
        }
    }

    @Override
    public ItemStack getStack() {
        return !stack.isEmpty() ? stack.copy() : new ItemStack(BingusExtrasItemRegistry.TWILIGHT_CHAKRAM);
    }
}
