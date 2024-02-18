package dev.callmeecho.bingusextras.main.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class HomingEnchantment extends Enchantment {
    public HomingEnchantment(Enchantment.Rarity rarity, EquipmentSlot ... equipmentSlots) {
        super(rarity, null, equipmentSlots);
    }

    @Override
    public int getMinPower(int i) {
        return 5 + 20 * (i - 1);
    }

    @Override
    public int getMaxPower(int i) {
        return super.getMinPower(i) + 50;
    }
}
