package dev.callmeecho.bingusextras.datagen;

import dev.callmeecho.bingusextras.main.registry.BingusExtrasBlockRegistry;
import dev.callmeecho.bingusextras.main.block.StairBlockWithBase;
import io.wispforest.owo.util.ReflectionUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import static net.minecraft.data.client.BlockStateModelGenerator.createStairsBlockState;

@SuppressWarnings("UnstableApiUsage")
public class BingusExtrasModelGenerator extends FabricModelProvider {

    public BingusExtrasModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        ReflectionUtils.iterateAccessibleStaticFields(BingusExtrasBlockRegistry.class, StairBlockWithBase.class, (block, name, field) -> {
            TextureMap textureMap = TextureMap.all(block.getBaseBlock());
            
            if (block.multiSideTexture) {
                textureMap = TextureMap.sideTopBottom(block.getBaseBlock());
                textureMap.put(TextureKey.SIDE, new Identifier("minecraft", "block/" + block.sideTexture));
                textureMap.put(TextureKey.TOP, new Identifier("minecraft", "block/" + block.topTexture));
                textureMap.put(TextureKey.BOTTOM, new Identifier("minecraft", "block/" + block.bottomTexture));
            }
            
            Identifier stairs = Models.STAIRS.upload(block, textureMap, blockStateModelGenerator.modelCollector);
            Identifier inner = Models.INNER_STAIRS.upload(block, textureMap, blockStateModelGenerator.modelCollector);
            Identifier outer = Models.OUTER_STAIRS.upload(block, textureMap, blockStateModelGenerator.modelCollector);

            blockStateModelGenerator.blockStateCollector.accept(createStairsBlockState(block, inner, stairs, outer));
            blockStateModelGenerator.registerParentedItemModel(block, stairs);
        });
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
