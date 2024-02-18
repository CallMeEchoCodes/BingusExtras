package dev.callmeecho.bingusextras.mixin;

import dev.callmeecho.bingusextras.main.item.TwilightChakram;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasEnchantmentRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.LoyaltyEnchantment;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public class EnchantmentMixin {
    @Inject(method="isAcceptableItem(Lnet/minecraft/item/ItemStack;)Z", at = @At("HEAD"), cancellable = true)
    private void isAcceptableItemInjected(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if ((Enchantment)(Object)this instanceof LoyaltyEnchantment) {
            cir.cancel();
            cir.setReturnValue(stack.getItem() instanceof TwilightChakram || ((Enchantment) (Object) this).target.isAcceptableItem(stack.getItem()));
        }

        if ((Object)this == Enchantments.SHARPNESS) {
            cir.cancel();
            cir.setReturnValue(stack.getItem() instanceof TwilightChakram || ((Enchantment) (Object) this).target.isAcceptableItem(stack.getItem()));
        }

        if ((Object)this == BingusExtrasEnchantmentRegistry.HOMING) {
            cir.cancel();
            cir.setReturnValue(stack.getItem() instanceof TwilightChakram || ((Enchantment) (Object) this).target.isAcceptableItem(stack.getItem()));
        }

        if ((Object)this == Enchantments.FIRE_ASPECT) {
            cir.cancel();
            cir.setReturnValue(stack.getItem() instanceof TwilightChakram || ((Enchantment) (Object) this).target.isAcceptableItem(stack.getItem()));
        }

        if ((Object)this == Enchantments.LOOTING) {
            cir.cancel();
            cir.setReturnValue(stack.getItem() instanceof TwilightChakram || ((Enchantment) (Object) this).target.isAcceptableItem(stack.getItem()));
        }
    }
}
