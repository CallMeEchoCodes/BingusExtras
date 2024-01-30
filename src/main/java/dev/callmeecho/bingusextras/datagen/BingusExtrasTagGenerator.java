package dev.callmeecho.bingusextras.datagen;

import dev.callmeecho.bingusextras.main.BingusExtrasMod;
import dev.callmeecho.bingusextras.main.block.BingusExtrasBlock;
import dev.callmeecho.bingusextras.main.block.SlabBlockWithBase;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasBlockRegistry;
import dev.callmeecho.bingusextras.main.block.StairBlockWithBase;
import io.wispforest.owo.util.ReflectionUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("UnstableApiUsage")
public class BingusExtrasTagGenerator extends FabricTagProvider<Block> {
    public BingusExtrasTagGenerator(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(dataGenerator, RegistryKeys.BLOCK, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        TagKey<Block> stairs = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft", "stairs"));
        TagKey<Block> slabs = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft", "slabs"));

        TagKey<Block> pickaxe = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft", "mineable/pickaxe"));
        TagKey<Block> shovel = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft", "mineable/shovel"));
        TagKey<Block> hoe = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft", "mineable/hoe"));
        TagKey<Block> axe = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft", "mineable/axe"));
        
        ReflectionUtils.iterateAccessibleStaticFields(BingusExtrasBlockRegistry.class, StairBlockWithBase.class, (block, name, field) -> {
            this.getOrCreateTagBuilder(stairs).add(block);
            
            switch (block.toolType) {
                case PICKAXE:
                    this.getOrCreateTagBuilder(pickaxe).add(block);
                    break;
                case SHOVEL:
                    this.getOrCreateTagBuilder(shovel).add(block);
                    break;
                case HOE:
                    this.getOrCreateTagBuilder(hoe).add(block);
                    break;
                case AXE:
                    this.getOrCreateTagBuilder(axe).add(block);
                    break;
            }
        });

        ReflectionUtils.iterateAccessibleStaticFields(BingusExtrasBlockRegistry.class, SlabBlockWithBase.class, (block, name, field) -> {
            this.getOrCreateTagBuilder(slabs).add(block);

            switch (block.toolType) {
                case PICKAXE:
                    this.getOrCreateTagBuilder(pickaxe).add(block);
                    break;
                case SHOVEL:
                    this.getOrCreateTagBuilder(shovel).add(block);
                    break;
                case HOE:
                    this.getOrCreateTagBuilder(hoe).add(block);
                    break;
                case AXE:
                    this.getOrCreateTagBuilder(axe).add(block);
                    break;
            }
        });

        ReflectionUtils.iterateAccessibleStaticFields(BingusExtrasBlockRegistry.class, BingusExtrasBlock.class, (block, name, field) -> {
            switch (block.toolType) {
                case PICKAXE:
                    this.getOrCreateTagBuilder(pickaxe).add(block);
                    break;
                case SHOVEL:
                    this.getOrCreateTagBuilder(shovel).add(block);
                    break;
                case HOE:
                    this.getOrCreateTagBuilder(hoe).add(block);
                    break;
                case AXE:
                    this.getOrCreateTagBuilder(axe).add(block);
                    break;
            }
        });
    }
}
