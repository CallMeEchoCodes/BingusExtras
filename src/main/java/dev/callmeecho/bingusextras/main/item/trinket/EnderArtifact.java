package dev.callmeecho.bingusextras.main.item.trinket;

import com.google.common.collect.Multimap;
import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class EnderArtifact extends TrinketItem {
    public EnderArtifact(Settings settings) {
        super(settings);
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(ReachEntityAttributes.REACH, new EntityAttributeModifier(uuid, "bingusextras:reach", 1, EntityAttributeModifier.Operation.ADDITION));
        modifiers.put(ReachEntityAttributes.ATTACK_RANGE, new EntityAttributeModifier(uuid, "bingusextras:attack_range", 1, EntityAttributeModifier.Operation.ADDITION));

        return modifiers;
    }
}
