package dev.callmeecho.bingusextras.main.registry;

import dev.callmeecho.bingusextras.main.entity.projectile.NetheriteTridentEntity;
import io.wispforest.owo.registration.reflect.AutoRegistryContainer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BingusExtrasEntityTypeRegistry implements AutoRegistryContainer<EntityType<?>> {
    public static final EntityType<NetheriteTridentEntity> NETHERITE_TRIDENT = FabricEntityTypeBuilder.create(SpawnGroup.MISC, (EntityType.EntityFactory<NetheriteTridentEntity>)NetheriteTridentEntity::new).dimensions(EntityDimensions.changing(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build();

    @Override
    public Registry<EntityType<?>> getRegistry() {
            return Registries.ENTITY_TYPE;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Class<EntityType<?>> getTargetFieldType() {
        return (Class<EntityType<?>>) (Object) EntityType.class;
    }
}
