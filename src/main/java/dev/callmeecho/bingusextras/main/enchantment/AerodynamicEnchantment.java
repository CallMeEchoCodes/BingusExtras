package dev.callmeecho.bingusextras.main.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class AerodynamicEnchantment extends Enchantment {
    public AerodynamicEnchantment(Rarity rarity, EquipmentSlot... equipmentSlots) {
        super(rarity, EnchantmentTarget.ARMOR_CHEST, equipmentSlots);
    }

    @Override
    public int getMinPower(int i) {
        return 15;
    }

    @Override
    public int getMaxPower(int i) {
        return super.getMinPower(i) + 50;
    }
}