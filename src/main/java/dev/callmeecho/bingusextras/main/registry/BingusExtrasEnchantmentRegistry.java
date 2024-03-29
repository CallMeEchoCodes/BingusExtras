package dev.callmeecho.bingusextras.main.registry;

import dev.callmeecho.bingusextras.main.enchantment.AerodynamicEnchantment;
import dev.callmeecho.bingusextras.main.enchantment.HomingEnchantment;
import dev.callmeecho.bingusextras.main.enchantment.ReapingEnchantment;
import io.wispforest.owo.registration.reflect.AutoRegistryContainer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

@SuppressWarnings("unused")
public class BingusExtrasEnchantmentRegistry implements AutoRegistryContainer<Enchantment> {
    public static final Enchantment AERODYNAMIC = new AerodynamicEnchantment(Enchantment.Rarity.UNCOMMON, EquipmentSlot.CHEST);
    public static final Enchantment REAPING = new ReapingEnchantment(Enchantment.Rarity.UNCOMMON, EquipmentSlot.MAINHAND);
    public static final Enchantment HOMING = new HomingEnchantment(Enchantment.Rarity.UNCOMMON, EquipmentSlot.MAINHAND);
    
    @Override
    public Registry<Enchantment> getRegistry() {
        return Registries.ENCHANTMENT;
    }

    @Override
    public Class<Enchantment> getTargetFieldType() {
        return Enchantment.class;
    }
}
