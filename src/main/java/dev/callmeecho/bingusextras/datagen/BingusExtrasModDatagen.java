package dev.callmeecho.bingusextras.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BingusExtrasModDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(BingusExtrasModelGenerator::new);
        pack.addProvider(BingusExtrasTagGenerator::new);
        pack.addProvider(BingusExtrasLanguageGenerator::new);
        pack.addProvider(BingusExtrasLootTableGenerator::new);
        pack.addProvider(BingusExtrasRecipeGenerator::new);
    }
}
