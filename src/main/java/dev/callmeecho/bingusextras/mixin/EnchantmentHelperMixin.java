package dev.callmeecho.bingusextras.mixin;

import dev.callmeecho.bingusextras.main.registry.BingusExtrasEnchantmentRegistry;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasItemRegistry;
import net.minecraft.enchantment.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {
    @Unique
    private static Enchantment currentEnchantment;


    @Redirect(method = "getPossibleEntries", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/Enchantment;isAvailableForRandomSelection()Z"))
    private static boolean isAvailableForRandomSelection(Enchantment enchantment) {
        currentEnchantment = enchantment;

        return enchantment.isAvailableForRandomSelection();
    }
    
    @Redirect(method = "getPossibleEntries", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/EnchantmentTarget;isAcceptableItem(Lnet/minecraft/item/Item;)Z"))
    private static boolean isAcceptableItem(EnchantmentTarget enchantmentTarget, Item item) {
        ItemStack stack = new ItemStack(item);
        if (enchantmentTarget == null) return false;

        if (item == BingusExtrasItemRegistry.TWILIGHT_CHAKRAM) return currentEnchantment.isAcceptableItem(stack) || currentEnchantment == Enchantments.SHARPNESS || currentEnchantment == BingusExtrasEnchantmentRegistry.HOMING || currentEnchantment == Enchantments.FIRE_ASPECT || currentEnchantment == Enchantments.LOOTING || currentEnchantment == Enchantments.LOYALTY;

        return enchantmentTarget.isAcceptableItem(item);
    }
}
