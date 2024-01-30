package dev.callmeecho.bingusextras.datagen;

import dev.callmeecho.bingusextras.main.block.SlabBlockWithBase;
import dev.callmeecho.bingusextras.main.block.StairBlockWithBase;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasBlockRegistry;
import io.wispforest.owo.util.ReflectionUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;


@SuppressWarnings("UnstableApiUsage")
public class BingusExtrasLootTableGenerator extends FabricBlockLootTableProvider {
    protected BingusExtrasLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> biConsumer) {
        ReflectionUtils.iterateAccessibleStaticFields(BingusExtrasBlockRegistry.class, StairBlockWithBase.class, (block, name, field) -> {
            biConsumer.accept(block.getLootTableId(), this.drops(block, ConstantLootNumberProvider.create(1.0F)));
        });

        ReflectionUtils.iterateAccessibleStaticFields(BingusExtrasBlockRegistry.class, SlabBlockWithBase.class, (block, name, field) -> {
            biConsumer.accept(block.getLootTableId(), this.drops(block, ConstantLootNumberProvider.create(1.0F)));
        });
    }
}
