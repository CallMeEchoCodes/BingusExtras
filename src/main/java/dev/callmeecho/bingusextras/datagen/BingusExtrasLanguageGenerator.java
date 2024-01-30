package dev.callmeecho.bingusextras.datagen;

import dev.callmeecho.bingusextras.main.block.SlabBlockWithBase;
import dev.callmeecho.bingusextras.main.block.StairBlockWithBase;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasBlockRegistry;
import io.wispforest.owo.util.ReflectionUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

@SuppressWarnings("UnstableApiUsage")
public class BingusExtrasLanguageGenerator extends FabricLanguageProvider {
    protected BingusExtrasLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        ReflectionUtils.iterateAccessibleStaticFields(BingusExtrasBlockRegistry.class, StairBlockWithBase.class, (block, name, field) -> {
            String[] nameParts = name.split("_");
            StringBuilder stringBuilder = new StringBuilder();
            for (String part : nameParts) {
                if (part.contains("block")) continue;
                stringBuilder.append(part.substring(0, 1).toUpperCase()).append(part.substring(1).toLowerCase().toLowerCase()).append(" ");
            }
            
            translationBuilder.add(block, stringBuilder.substring(0, stringBuilder.length() - 1));
        });

        ReflectionUtils.iterateAccessibleStaticFields(BingusExtrasBlockRegistry.class, SlabBlockWithBase.class, (block, name, field) -> {
            String[] nameParts = name.split("_");
            StringBuilder stringBuilder = new StringBuilder();
            for (String part : nameParts) {
                if (part.contains("block")) continue;
                stringBuilder.append(part.substring(0, 1).toUpperCase()).append(part.substring(1).toLowerCase()).append(" ");
            }

            translationBuilder.add(block, stringBuilder.substring(0, stringBuilder.length() - 1));
        });

        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/bingusextras/lang/en_us.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
