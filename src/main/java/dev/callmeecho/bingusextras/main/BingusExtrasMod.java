package dev.callmeecho.bingusextras.main;

import dev.callmeecho.bingusextras.main.entity.projectile.NetheriteTridentEntity;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasBlockRegistry;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasEnchantmentRegistry;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasEntityTypeRegistry;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasItemRegistry;
import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.KilledByPlayerLootCondition;
import net.minecraft.loot.condition.RandomChanceWithLootingLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;

public class BingusExtrasMod implements ModInitializer {
    public static AbstractBlock.Settings getSettingsFromBlock(Block block){
        AbstractBlock.Settings settings = AbstractBlock.Settings.copy(block)
                .sounds(block.getDefaultState().getSoundGroup())
                .luminance((view) -> block.getDefaultState().getLuminance())
                .mapColor(block.getDefaultMapColor())
                .hardness(block.getHardness())
                .resistance(block.getBlastResistance())
                .slipperiness(block.getSlipperiness())
                .velocityMultiplier(block.getVelocityMultiplier())
                ;


        if (!block.getDefaultState().isOpaque()){
            settings = settings.nonOpaque();
        }
        if (block.getDefaultState().isToolRequired()){
            settings = settings.requiresTool();
        }

        if (block.getDefaultState().hasRandomTicks()){
            settings = settings.ticksRandomly();
        }

        return settings;
    }
    public static final String MODID = "bingusextras";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public static final Identifier NETHERITE_TRIDENT_RIPTIDE = new Identifier(MODID, "textures/entity/netherite_trident_riptide.png");
    public static final OwoItemGroup GROUP = OwoItemGroup
            .builder(new Identifier(MODID, "item_group"), () -> Icon.of(Items.DIAMOND_HELMET))
            .build();
    
    public static final Identifier BONK_ID = new Identifier(MODID + ":bonk");
    public static SoundEvent BONK_EVENT = SoundEvent.of(BONK_ID);
    
    @Override
    public void onInitialize() {
        LOGGER.info("Loading BingusExtras...");
        FieldRegistrationHandler.register(BingusExtrasBlockRegistry.class, MODID, false);
        FieldRegistrationHandler.register(BingusExtrasItemRegistry.class, MODID, false);
        FieldRegistrationHandler.register(BingusExtrasEnchantmentRegistry.class, MODID, false);
        FieldRegistrationHandler.register(BingusExtrasEntityTypeRegistry.class, MODID, false);        
        
        Registry.register(Registries.SOUND_EVENT, BONK_ID, BONK_EVENT);
        
        GROUP.initialize();

        // why are ender pearls not stackable to 64 :sob:
        //for (Item item : Registries.ITEM) {
        //    if (item.getMaxCount() == 16) {
        //        Field field;
        //        try { field = Item.class.getDeclaredField("maxCount"); } catch (NoSuchFieldException e) { throw new RuntimeException(e); }
        //        field.setAccessible(true);
        //        try { field.set(item, 64); } catch (IllegalAccessException e) { throw new RuntimeException(e); }
        //    }
        //}

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && id.getPath().contains("entities/enderman") && id.getNamespace().equals("minecraft")) {
                LootPool.Builder poolBuilder = LootPool.builder();
                poolBuilder.with(ItemEntry.builder(BingusExtrasItemRegistry.ENDER_ARTIFACT));
                poolBuilder.conditionally(KilledByPlayerLootCondition.builder());
                poolBuilder.conditionally(RandomChanceWithLootingLootCondition.builder(0.001f, 0.005F));

                tableBuilder.pool(poolBuilder);
            }
        });
    }

    public enum ToolType {
        PICKAXE,
        AXE,
        SHOVEL,
        HOE,
        NONE
    }
}
