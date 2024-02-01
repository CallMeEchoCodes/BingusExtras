package dev.callmeecho.bingusextras.main.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class BanHammer extends AxeItem {

    public BanHammer(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Strike the target with lightning when they die
        if (target.getHealth() <= 0) {
            World world = target.getEntityWorld();
            LightningEntity lightning = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
            lightning.setPosition(target.getPos().add(0, -1, 0));
            lightning.setCosmetic(true);
            world.spawnEntity(lightning);
        }
        return super.postHit(stack, target, attacker);
    }
}
