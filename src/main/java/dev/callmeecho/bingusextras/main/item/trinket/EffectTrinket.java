package dev.callmeecho.bingusextras.main.item.trinket;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;

public class EffectTrinket extends TrinketItem {
    public final StatusEffect effect;
    
    public EffectTrinket(Settings settings, StatusEffect effect) {
        super(settings);
        this.effect = effect;
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (!(entity instanceof ServerPlayerEntity player)) return;
        player.addStatusEffect(new StatusEffectInstance(effect, Integer.MAX_VALUE, 0, true, false, false));
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (!(entity instanceof ServerPlayerEntity player)) return;
        player.removeStatusEffect(effect);
    }
}
