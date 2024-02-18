package dev.callmeecho.bingusextras.main.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.mojang.authlib.yggdrasil.response.User;
import dev.callmeecho.bingusextras.main.entity.projectile.TwilightChakramEntity;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasEntityTypeRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class TwilightChakram extends Item implements Vanishable {
    private final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
    
    public TwilightChakram(Settings settings) { 
        super(settings);
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Weapon modifier", 5, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Weapon modifier",  -2, EntityAttributeModifier.Operation.ADDITION));
        this.attributeModifiers = builder.build();
    }

    @Override
    public int getEnchantability() { return 22; }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        if (slot == EquipmentSlot.MAINHAND) { return this.attributeModifiers; }
        return super.getAttributeModifiers(slot);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        
        if (!world.isClient) {
            ItemStack copy = stack.copy();
            copy.setCount(1);
            TwilightChakramEntity chakramEntity = new TwilightChakramEntity(BingusExtrasEntityTypeRegistry.TWILIGHT_CHAKRAM, user, world, copy, user.getInventory().getSlotWithStack(stack));
            chakramEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0F, 1.5F, 0.0F);
            world.spawnEntity(chakramEntity);
            stack.decrement(1);
            user.getItemCooldownManager().set(this, 20);
            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_ENDER_PEARL_THROW, SoundCategory.NEUTRAL, 0.5f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
        }
        
        return TypedActionResult.success(stack, world.isClient());
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) { return Ingredient.ofItems(Items.GOLD_INGOT).test(ingredient) || super.canRepair(stack, ingredient); }
}
