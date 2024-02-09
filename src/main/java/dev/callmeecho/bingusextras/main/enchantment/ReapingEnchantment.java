package dev.callmeecho.bingusextras.main.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.KnockbackEnchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.util.math.Vec3d;

public class ReapingEnchantment extends Enchantment {
    public ReapingEnchantment(Enchantment.Rarity rarity, EquipmentSlot ... equipmentSlots) {
        super(rarity, EnchantmentTarget.WEAPON, equipmentSlots);
    }

    @Override
    public int getMinPower(int i) {
        return 5 + 20 * (i - 1);
    }

    @Override
    public int getMaxPower(int i) {
        return super.getMinPower(i) + 50;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    protected boolean canAccept(Enchantment enchantment) {
        return !(enchantment instanceof KnockbackEnchantment) && super.canAccept(enchantment);
    }

    @Override
    public void onTargetDamaged(LivingEntity attacker, Entity entity, int level) {
        if (level > 0 && entity instanceof LivingEntity attackTarget) {
            double knockbackResistance = 1.0 - attackTarget.getAttributeValue(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE);
            double pullStrength = (0.5 * level) * knockbackResistance;

            Vec3d vector = attacker.getPos().subtract(attackTarget.getPos()).normalize().multiply(pullStrength);
            attackTarget.setVelocity(vector);
        }

        super.onTargetDamaged(attacker, entity, level);
    }
}