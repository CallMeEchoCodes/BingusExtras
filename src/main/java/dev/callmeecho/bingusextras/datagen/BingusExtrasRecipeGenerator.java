package dev.callmeecho.bingusextras.datagen;

import dev.callmeecho.bingusextras.main.block.StairBlockWithBase;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasBlockRegistry;
import io.wispforest.owo.util.ReflectionUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

@SuppressWarnings("UnstableApiUsage")
public class BingusExtrasRecipeGenerator extends FabricRecipeProvider {
    public BingusExtrasRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ReflectionUtils.iterateAccessibleStaticFields(BingusExtrasBlockRegistry.class, StairBlockWithBase.class, (block, name, field) -> {
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, block, 4)
                    .criterion(FabricRecipeProvider.hasItem(block.getBaseBlock()), FabricRecipeProvider.conditionsFromItem(block.getBaseBlock()))
                    .input('#', block.getBaseBlock())
                    .pattern("#  ")
                    .pattern("## ")
                    .pattern("###")
                    .offerTo(exporter);
        });
    }
}
