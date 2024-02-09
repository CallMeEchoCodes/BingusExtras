package dev.callmeecho.bingusextras.mixin;

import dev.callmeecho.bingusextras.main.registry.BingusExtrasEnchantmentRegistry;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.TridentItem.class)
public class TridentItemMixin {
    // wuhoh mixin conflicts
//    @Redirect(method = "onStoppedUsing", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/EnchantmentHelper;getRiptide(Lnet/minecraft/item/ItemStack;)I"))
//    public int getRiptideRedirect(net.minecraft.item.ItemStack stack) {
//        // Very hacky but it works as long as we check for the enchantment later in the "isTouchingWaterOrRain" method
//        return EnchantmentHelper.getLevel(Enchantments.RIPTIDE, stack) + EnchantmentHelper.getLevel(BingusExtrasEnchantmentRegistry.MAGMATIDE, stack);
//    }
//
//    @Redirect(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/EnchantmentHelper;getRiptide(Lnet/minecraft/item/ItemStack;)I"))
//    public int getRiptideRedirect2(net.minecraft.item.ItemStack stack) {
//        // Very hacky but it works as long as we check for the enchantment later in the "isTouchingWaterOrRain" method
//        return EnchantmentHelper.getLevel(Enchantments.RIPTIDE, stack) + EnchantmentHelper.getLevel(BingusExtrasEnchantmentRegistry.MAGMATIDE, stack);
//    }
//
//
//    @Redirect(method = "onStoppedUsing", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;isTouchingWaterOrRain()Z"))
//    public boolean isTouchingWaterOrRainRedirect(PlayerEntity instance) {
//        if (EnchantmentHelper.getLevel(BingusExtrasEnchantmentRegistry.MAGMATIDE, instance.getMainHandStack()) > 0) {
//            return instance.isInLava() || instance.isOnFire();
//        }
//        
//        return instance.isTouchingWaterOrRain();
//    }
//
//    @Redirect(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;isTouchingWaterOrRain()Z"))
//    public boolean isTouchingWaterOrRainRedirect2(PlayerEntity instance) {
//        if (EnchantmentHelper.getLevel(BingusExtrasEnchantmentRegistry.MAGMATIDE, instance.getMainHandStack()) > 0) {
//            return instance.isInLava() || instance.isOnFire();
//        }
//
//        return instance.isTouchingWaterOrRain();
//    }
}
