package dev.callmeecho.bingusextras.main.registry;

import dev.callmeecho.bingusextras.main.BingusExtrasMod;
import dev.callmeecho.bingusextras.main.block.*;
import io.wispforest.owo.itemgroup.OwoItemSettings;
import io.wispforest.owo.registration.reflect.BlockRegistryContainer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;

@SuppressWarnings("unused")
public class BingusExtrasBlockRegistry implements BlockRegistryContainer {
    public static final StairBlockWithBase STRIPPED_OAK_LOG_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_OAK_LOG, "stripped_oak_log", "stripped_oak_log_top", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_OAK_LOG_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_OAK_LOG, "stripped_oak_log", "stripped_oak_log_top", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_SPRUCE_LOG_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_SPRUCE_LOG, "stripped_spruce_log", "stripped_spruce_log_top", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_SPRUCE_LOG_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_SPRUCE_LOG, "stripped_spruce_log", "stripped_spruce_log_top", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_BIRCH_LOG_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_BIRCH_LOG, "stripped_birch_log", "stripped_birch_log_top", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_BIRCH_LOG_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_BIRCH_LOG, "stripped_birch_log", "stripped_birch_log_top", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_JUNGLE_LOG_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_JUNGLE_LOG, "stripped_jungle_log", "stripped_jungle_log_top", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_JUNGLE_LOG_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_JUNGLE_LOG, "stripped_jungle_log", "stripped_jungle_log_top", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_ACACIA_LOG_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_ACACIA_LOG, "stripped_acacia_log", "stripped_acacia_log_top", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_ACACIA_LOG_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_ACACIA_LOG, "stripped_acacia_log", "stripped_acacia_log_top", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_DARK_OAK_LOG_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_DARK_OAK_LOG, "stripped_dark_oak_log", "stripped_dark_oak_log_top", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_DARK_OAK_LOG_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_DARK_OAK_LOG, "stripped_dark_oak_log", "stripped_dark_oak_log_top", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_CHERRY_LOG_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_CHERRY_LOG, "stripped_cherry_log", "stripped_cherry_log_top", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_CHERRY_LOG_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_CHERRY_LOG, "stripped_cherry_log", "stripped_cherry_log_top", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_CRIMSON_STEM_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_CRIMSON_STEM, "stripped_crimson_stem", "stripped_crimson_stem", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_CRIMSON_STEM_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_CRIMSON_STEM, "stripped_crimson_stem", "stripped_crimson_stem", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_WARPED_STEM_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_WARPED_STEM, "stripped_warped_stem", "stripped_warped_stem", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_WARPED_STEM_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_WARPED_STEM, "stripped_warped_stem", "stripped_warped_stem", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_MANGROVE_LOG_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_MANGROVE_LOG, "stripped_mangrove_log", "stripped_mangrove_log_top", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_MANGROVE_LOG_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_MANGROVE_LOG, "stripped_mangrove_log", "stripped_mangrove_log_top", BingusExtrasMod.ToolType.AXE);
    
    public static final StairBlockWithBase OAK_LOG_STAIRS = new StrippableStairBlock(Blocks.OAK_LOG, STRIPPED_OAK_LOG_STAIRS, "oak_log", "oak_log_top");
    public static final SlabBlockWithBase OAK_LOG_SLAB = new StrippableSlabBlock(Blocks.OAK_LOG, STRIPPED_OAK_LOG_SLAB, "oak_log", "oak_log_top");
    public static final StairBlockWithBase SPRUCE_LOG_STAIRS = new StrippableStairBlock(Blocks.SPRUCE_LOG, STRIPPED_SPRUCE_LOG_STAIRS, "spruce_log", "spruce_log_top");
    public static final SlabBlockWithBase SPRUCE_LOG_SLAB = new StrippableSlabBlock(Blocks.SPRUCE_LOG, STRIPPED_SPRUCE_LOG_SLAB, "spruce_log", "spruce_log_top");
    public static final StairBlockWithBase BIRCH_LOG_STAIRS = new StrippableStairBlock(Blocks.BIRCH_LOG, STRIPPED_BIRCH_LOG_STAIRS, "birch_log", "birch_log_top");
    public static final SlabBlockWithBase BIRCH_LOG_SLAB = new StrippableSlabBlock(Blocks.BIRCH_LOG, STRIPPED_BIRCH_LOG_SLAB, "birch_log", "birch_log_top");
    public static final StairBlockWithBase JUNGLE_LOG_STAIRS = new StrippableStairBlock(Blocks.JUNGLE_LOG, STRIPPED_JUNGLE_LOG_STAIRS, "jungle_log", "jungle_log_top");
    public static final SlabBlockWithBase JUNGLE_LOG_SLAB = new StrippableSlabBlock(Blocks.JUNGLE_LOG, STRIPPED_JUNGLE_LOG_SLAB, "jungle_log", "jungle_log_top");
    public static final StairBlockWithBase ACACIA_LOG_STAIRS = new StrippableStairBlock(Blocks.ACACIA_LOG, STRIPPED_ACACIA_LOG_STAIRS, "acacia_log", "acacia_log_top");
    public static final SlabBlockWithBase ACACIA_LOG_SLAB = new StrippableSlabBlock(Blocks.ACACIA_LOG, STRIPPED_ACACIA_LOG_SLAB, "acacia_log", "acacia_log_top");
    public static final StairBlockWithBase DARK_OAK_LOG_STAIRS = new StrippableStairBlock(Blocks.DARK_OAK_LOG, STRIPPED_DARK_OAK_LOG_STAIRS, "dark_oak_log", "dark_oak_log_top");
    public static final SlabBlockWithBase DARK_OAK_LOG_SLAB = new StrippableSlabBlock(Blocks.DARK_OAK_LOG, STRIPPED_DARK_OAK_LOG_SLAB, "dark_oak_log", "dark_oak_log_top");
    public static final StairBlockWithBase CHERRY_LOG_STAIRS = new StrippableStairBlock(Blocks.CHERRY_LOG, STRIPPED_CHERRY_LOG_STAIRS, "cherry_log", "cherry_log_top");
    public static final SlabBlockWithBase CHERRY_LOG_SLAB = new StrippableSlabBlock(Blocks.CHERRY_LOG, STRIPPED_CHERRY_LOG_SLAB, "cherry_log", "cherry_log_top");
    public static final StairBlockWithBase CRIMSON_STEM_STAIRS = new StrippableStairBlock(Blocks.CRIMSON_STEM, STRIPPED_CRIMSON_STEM_STAIRS, "crimson_stem", "crimson_stem_top");
    public static final SlabBlockWithBase CRIMSON_STEM_SLAB = new StrippableSlabBlock(Blocks.CRIMSON_STEM, STRIPPED_CRIMSON_STEM_SLAB, "crimson_stem", "crimson_stem_top");
    public static final StairBlockWithBase WARPED_STEM_STAIRS = new StrippableStairBlock(Blocks.WARPED_STEM, STRIPPED_WARPED_STEM_STAIRS, "warped_stem", "warped_stem_top");
    public static final SlabBlockWithBase WARPED_STEM_SLAB = new StrippableSlabBlock(Blocks.WARPED_STEM, STRIPPED_WARPED_STEM_SLAB, "warped_stem", "warped_stem_top");
    public static final StairBlockWithBase MANGROVE_LOG_STAIRS = new StrippableStairBlock(Blocks.MANGROVE_LOG, STRIPPED_MANGROVE_LOG_STAIRS, "mangrove_log", "mangrove_log_top");
    public static final SlabBlockWithBase MANGROVE_LOG_SLAB = new StrippableSlabBlock(Blocks.MANGROVE_LOG, STRIPPED_MANGROVE_LOG_SLAB, "mangrove_log", "mangrove_log_top");

    public static final StairBlockWithBase STRIPPED_OAK_WOOD_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_OAK_WOOD, "stripped_oak_log", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_OAK_WOOD_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_OAK_WOOD, "stripped_oak_log", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_SPRUCE_WOOD_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_SPRUCE_WOOD, "stripped_spruce_log", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_SPRUCE_WOOD_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_SPRUCE_WOOD, "stripped_spruce_log", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_BIRCH_WOOD_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_BIRCH_WOOD, "stripped_birch_log", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_BIRCH_WOOD_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_BIRCH_WOOD, "stripped_birch_log", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_JUNGLE_WOOD_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_JUNGLE_WOOD, "stripped_jungle_log", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_JUNGLE_WOOD_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_JUNGLE_WOOD, "stripped_jungle_log", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_ACACIA_WOOD_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_ACACIA_WOOD, "stripped_acacia_log", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_ACACIA_WOOD_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_ACACIA_WOOD, "stripped_acacia_log", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_DARK_OAK_WOOD_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_DARK_OAK_WOOD, "stripped_dark_oak_log", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_DARK_OAK_WOOD_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_DARK_OAK_WOOD, "stripped_dark_oak_log", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_CHERRY_WOOD_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_CHERRY_WOOD, "stripped_cherry_log", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_CHERRY_WOOD_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_CHERRY_WOOD, "stripped_cherry_log", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_CRIMSON_HYPHAE_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_CRIMSON_HYPHAE, "stripped_crimson_stem", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_CRIMSON_HYPHAE_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_CRIMSON_HYPHAE, "stripped_crimson_stem", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_WARPED_HYPHAE_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_WARPED_HYPHAE, "stripped_warped_stem", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_WARPED_HYPHAE_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_WARPED_HYPHAE, "stripped_warped_stem", BingusExtrasMod.ToolType.AXE);
    public static final StairBlockWithBase STRIPPED_MANGROVE_WOOD_STAIRS = new StairBlockWithBase(Blocks.STRIPPED_MANGROVE_WOOD, "stripped_mangrove_log", BingusExtrasMod.ToolType.AXE);
    public static final SlabBlockWithBase STRIPPED_MANGROVE_WOOD_SLAB = new SlabBlockWithBase(Blocks.STRIPPED_MANGROVE_WOOD, "stripped_mangrove_log", BingusExtrasMod.ToolType.AXE);
    
    public static final StairBlockWithBase OAK_WOOD_STAIRS = new StrippableStairBlock(Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_STAIRS, "oak_log");
    public static final SlabBlockWithBase OAK_WOOD_SLAB = new StrippableSlabBlock(Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_SLAB, "oak_log");
    public static final StairBlockWithBase SPRUCE_WOOD_STAIRS = new StrippableStairBlock(Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_STAIRS, "spruce_log");
    public static final SlabBlockWithBase SPRUCE_WOOD_SLAB = new StrippableSlabBlock(Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_SLAB, "spruce_log");
    public static final StairBlockWithBase BIRCH_WOOD_STAIRS = new StrippableStairBlock(Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_STAIRS, "birch_log");
    public static final SlabBlockWithBase BIRCH_WOOD_SLAB = new StrippableSlabBlock(Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_SLAB, "birch_log");
    public static final StairBlockWithBase JUNGLE_WOOD_STAIRS = new StrippableStairBlock(Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_STAIRS, "jungle_log");
    public static final SlabBlockWithBase JUNGLE_WOOD_SLAB = new StrippableSlabBlock(Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_SLAB, "jungle_log");
    public static final StairBlockWithBase ACACIA_WOOD_STAIRS = new StrippableStairBlock(Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_STAIRS, "acacia_log");
    public static final SlabBlockWithBase ACACIA_WOOD_SLAB = new StrippableSlabBlock(Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_SLAB, "acacia_log");
    public static final StairBlockWithBase DARK_OAK_WOOD_STAIRS = new StrippableStairBlock(Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_STAIRS, "dark_oak_log");
    public static final SlabBlockWithBase DARK_OAK_WOOD_SLAB = new StrippableSlabBlock(Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_SLAB, "dark_oak_log");
    public static final StairBlockWithBase CHERRY_WOOD_STAIRS = new StrippableStairBlock(Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_STAIRS, "cherry_log");
    public static final SlabBlockWithBase CHERRY_WOOD_SLAB = new StrippableSlabBlock(Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_SLAB, "cherry_log");
    public static final StairBlockWithBase CRIMSON_HYPHAE_STAIRS = new StrippableStairBlock(Blocks.CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_STAIRS, "crimson_stem");
    public static final SlabBlockWithBase CRIMSON_HYPHAE_SLAB = new StrippableSlabBlock(Blocks.CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_SLAB, "crimson_stem");
    public static final StairBlockWithBase WARPED_HYPHAE_STAIRS = new StrippableStairBlock(Blocks.WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_STAIRS, "warped_stem");
    public static final SlabBlockWithBase WARPED_HYPHAE_SLAB = new StrippableSlabBlock(Blocks.WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_SLAB, "warped_stem");
    public static final StairBlockWithBase MANGROVE_WOOD_STAIRS = new StrippableStairBlock(Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_STAIRS, "mangrove_log");
    public static final SlabBlockWithBase MANGROVE_WOOD_SLAB = new StrippableSlabBlock(Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_SLAB, "mangrove_log");

    public static final StairBlockWithBase GOLD_STAIRS = new StairBlockWithBase(Blocks.GOLD_BLOCK, "gold_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase GOLD_SLAB = new SlabBlockWithBase(Blocks.GOLD_BLOCK, "gold_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase IRON_STAIRS = new StairBlockWithBase(Blocks.IRON_BLOCK, "iron_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase IRON_SLAB = new SlabBlockWithBase(Blocks.IRON_BLOCK, "iron_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase COPPER_STAIRS = new StairBlockWithBase(Blocks.COPPER_BLOCK, "copper_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase COPPER_SLAB = new SlabBlockWithBase(Blocks.COPPER_BLOCK, "copper_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase DIAMOND_STAIRS = new StairBlockWithBase(Blocks.DIAMOND_BLOCK, "diamond_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase DIAMOND_SLAB = new SlabBlockWithBase(Blocks.DIAMOND_BLOCK, "diamond_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase EMERALD_STAIRS = new StairBlockWithBase(Blocks.EMERALD_BLOCK, "emerald_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase EMERALD_SLAB = new SlabBlockWithBase(Blocks.EMERALD_BLOCK, "emerald_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase LAPIS_STAIRS = new StairBlockWithBase(Blocks.LAPIS_BLOCK, "lapis_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase LAPIS_SLAB = new SlabBlockWithBase(Blocks.LAPIS_BLOCK, "lapis_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase REDSTONE_STAIRS = new StairBlockWithBase(Blocks.REDSTONE_BLOCK, "redstone_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase REDSTONE_SLAB = new SlabBlockWithBase(Blocks.REDSTONE_BLOCK, "redstone_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase COAL_STAIRS = new StairBlockWithBase(Blocks.COAL_BLOCK, "coal_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase COAL_SLAB = new SlabBlockWithBase(Blocks.COAL_BLOCK, "coal_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase ANCIENT_DEBRIS_STAIRS = new StairBlockWithBase(Blocks.ANCIENT_DEBRIS, "ancient_debris_side", "ancient_debris_top", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase ANCIENT_DEBRIS_SLAB = new SlabBlockWithBase(Blocks.ANCIENT_DEBRIS, "ancient_debris_side", "ancient_debris_top", BingusExtrasMod.ToolType.PICKAXE);
    public static final StairBlockWithBase NETHERITE_STAIRS = new StairBlockWithBase(Blocks.NETHERITE_BLOCK, "netherite_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase NETHERITE_SLAB = new SlabBlockWithBase(Blocks.NETHERITE_BLOCK, "netherite_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase GILDED_BLACKSTONE_STAIRS = new StairBlockWithBase(Blocks.GILDED_BLACKSTONE, "gilded_blackstone", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase GILDED_BLACKSTONE_SLAB = new SlabBlockWithBase(Blocks.GILDED_BLACKSTONE, "gilded_blackstone", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase RAW_IRON_STAIRS = new StairBlockWithBase(Blocks.RAW_IRON_BLOCK, "raw_iron_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase RAW_IRON_SLAB = new SlabBlockWithBase(Blocks.RAW_IRON_BLOCK, "raw_iron_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase RAW_COPPER_STAIRS = new StairBlockWithBase(Blocks.RAW_COPPER_BLOCK, "raw_copper_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase RAW_COPPER_SLAB = new SlabBlockWithBase(Blocks.RAW_COPPER_BLOCK, "raw_copper_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase RAW_GOLD_STAIRS = new StairBlockWithBase(Blocks.RAW_GOLD_BLOCK, "raw_gold_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase RAW_GOLD_SLAB = new SlabBlockWithBase(Blocks.RAW_GOLD_BLOCK, "raw_gold_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase WHITE_WOOL_STAIRS = new StairBlockWithBase(Blocks.WHITE_WOOL, "white_wool");
    public static final SlabBlockWithBase WHITE_WOOL_SLAB = new SlabBlockWithBase(Blocks.WHITE_WOOL, "white_wool");
    
    public static final StairBlockWithBase LIGHT_GRAY_WOOL_STAIRS = new StairBlockWithBase(Blocks.LIGHT_GRAY_WOOL, "light_gray_wool");
    public static final SlabBlockWithBase LIGHT_GRAY_WOOL_SLAB = new SlabBlockWithBase(Blocks.LIGHT_GRAY_WOOL, "light_gray_wool");
    
    public static final StairBlockWithBase GRAY_WOOL_STAIRS = new StairBlockWithBase(Blocks.GRAY_WOOL, "gray_wool");
    public static final SlabBlockWithBase GRAY_WOOL_SLAB = new SlabBlockWithBase(Blocks.GRAY_WOOL, "gray_wool");
    
    public static final StairBlockWithBase BLACK_WOOL_STAIRS = new StairBlockWithBase(Blocks.BLACK_WOOL, "black_wool");
    public static final SlabBlockWithBase BLACK_WOOL_SLAB = new SlabBlockWithBase(Blocks.BLACK_WOOL, "black_wool");
    
    public static final StairBlockWithBase BROWN_WOOL_STAIRS = new StairBlockWithBase(Blocks.BROWN_WOOL, "brown_wool");
    public static final SlabBlockWithBase BROWN_WOOL_SLAB = new SlabBlockWithBase(Blocks.BROWN_WOOL, "brown_wool");
    
    public static final StairBlockWithBase RED_WOOL_STAIRS = new StairBlockWithBase(Blocks.RED_WOOL, "red_wool");
    public static final SlabBlockWithBase RED_WOOL_SLAB = new SlabBlockWithBase(Blocks.RED_WOOL, "red_wool");
    
    public static final StairBlockWithBase ORANGE_WOOL_STAIRS = new StairBlockWithBase(Blocks.ORANGE_WOOL, "orange_wool");
    public static final SlabBlockWithBase ORANGE_WOOL_SLAB = new SlabBlockWithBase(Blocks.ORANGE_WOOL, "orange_wool");
    
    public static final StairBlockWithBase YELLOW_WOOL_STAIRS = new StairBlockWithBase(Blocks.YELLOW_WOOL, "yellow_wool");
    public static final SlabBlockWithBase YELLOW_WOOL_SLAB = new SlabBlockWithBase(Blocks.YELLOW_WOOL, "yellow_wool");
    
    public static final StairBlockWithBase LIME_WOOL_STAIRS = new StairBlockWithBase(Blocks.LIME_WOOL, "lime_wool");
    public static final SlabBlockWithBase LIME_WOOL_SLAB = new SlabBlockWithBase(Blocks.LIME_WOOL, "lime_wool");
    
    public static final StairBlockWithBase GREEN_WOOL_STAIRS = new StairBlockWithBase(Blocks.GREEN_WOOL, "green_wool");
    public static final SlabBlockWithBase GREEN_WOOL_SLAB = new SlabBlockWithBase(Blocks.GREEN_WOOL, "green_wool");
    
    public static final StairBlockWithBase CYAN_WOOL_STAIRS = new StairBlockWithBase(Blocks.CYAN_WOOL, "cyan_wool");
    public static final SlabBlockWithBase CYAN_WOOL_SLAB = new SlabBlockWithBase(Blocks.CYAN_WOOL, "cyan_wool");
    
    public static final StairBlockWithBase LIGHT_BLUE_WOOL_STAIRS = new StairBlockWithBase(Blocks.LIGHT_BLUE_WOOL, "light_blue_wool");
    public static final SlabBlockWithBase LIGHT_BLUE_WOOL_SLAB = new SlabBlockWithBase(Blocks.LIGHT_BLUE_WOOL, "light_blue_wool");
    
    public static final StairBlockWithBase BLUE_WOOL_STAIRS = new StairBlockWithBase(Blocks.BLUE_WOOL, "blue_wool");
    public static final SlabBlockWithBase BLUE_WOOL_SLAB = new SlabBlockWithBase(Blocks.BLUE_WOOL, "blue_wool");
    
    public static final StairBlockWithBase PURPLE_WOOL_STAIRS = new StairBlockWithBase(Blocks.PURPLE_WOOL, "purple_wool");
    public static final SlabBlockWithBase PURPLE_WOOL_SLAB = new SlabBlockWithBase(Blocks.PURPLE_WOOL, "purple_wool");
    
    public static final StairBlockWithBase MAGENTA_WOOL_STAIRS = new StairBlockWithBase(Blocks.MAGENTA_WOOL, "magenta_wool");
    public static final SlabBlockWithBase MAGENTA_WOOL_SLAB = new SlabBlockWithBase(Blocks.MAGENTA_WOOL, "magenta_wool");
    
    public static final StairBlockWithBase PINK_WOOL_STAIRS = new StairBlockWithBase(Blocks.PINK_WOOL, "pink_wool");
    public static final SlabBlockWithBase PINK_WOOL_SLAB = new SlabBlockWithBase(Blocks.PINK_WOOL, "pink_wool");
    
    public static final StairBlockWithBase WHITE_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.WHITE_TERRACOTTA, "white_terracotta");
    public static final SlabBlockWithBase WHITE_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.WHITE_TERRACOTTA, "white_terracotta");
    
    public static final StairBlockWithBase LIGHT_GRAY_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.LIGHT_GRAY_TERRACOTTA, "light_gray_terracotta");
    public static final SlabBlockWithBase LIGHT_GRAY_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.LIGHT_GRAY_TERRACOTTA, "light_gray_terracotta");
    
    public static final StairBlockWithBase GRAY_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.GRAY_TERRACOTTA, "gray_terracotta");
    public static final SlabBlockWithBase GRAY_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.GRAY_TERRACOTTA, "gray_terracotta");
    
    public static final StairBlockWithBase BLACK_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.BLACK_TERRACOTTA, "black_terracotta");
    public static final SlabBlockWithBase BLACK_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.BLACK_TERRACOTTA, "black_terracotta");
    
    public static final StairBlockWithBase BROWN_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.BROWN_TERRACOTTA, "brown_terracotta");
    public static final SlabBlockWithBase BROWN_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.BROWN_TERRACOTTA, "brown_terracotta");
    
    public static final StairBlockWithBase RED_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.RED_TERRACOTTA, "red_terracotta");
    public static final SlabBlockWithBase RED_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.RED_TERRACOTTA, "red_terracotta");
    
    public static final StairBlockWithBase ORANGE_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.ORANGE_TERRACOTTA, "orange_terracotta");
    public static final SlabBlockWithBase ORANGE_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.ORANGE_TERRACOTTA, "orange_terracotta");
    
    public static final StairBlockWithBase YELLOW_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.YELLOW_TERRACOTTA, "yellow_terracotta");
    public static final SlabBlockWithBase YELLOW_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.YELLOW_TERRACOTTA, "yellow_terracotta");
    
    public static final StairBlockWithBase LIME_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.LIME_TERRACOTTA, "lime_terracotta");
    public static final SlabBlockWithBase LIME_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.LIME_TERRACOTTA, "lime_terracotta");
    
    public static final StairBlockWithBase GREEN_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.GREEN_TERRACOTTA, "green_terracotta");
    public static final SlabBlockWithBase GREEN_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.GREEN_TERRACOTTA, "green_terracotta");
    
    public static final StairBlockWithBase CYAN_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.CYAN_TERRACOTTA, "cyan_terracotta");
    public static final SlabBlockWithBase CYAN_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.CYAN_TERRACOTTA, "cyan_terracotta");
    
    public static final StairBlockWithBase LIGHT_BLUE_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.LIGHT_BLUE_TERRACOTTA, "light_blue_terracotta");
    public static final SlabBlockWithBase LIGHT_BLUE_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.LIGHT_BLUE_TERRACOTTA, "light_blue_terracotta");
    
    public static final StairBlockWithBase BLUE_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.BLUE_TERRACOTTA, "blue_terracotta");
    public static final SlabBlockWithBase BLUE_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.BLUE_TERRACOTTA, "blue_terracotta");
    
    public static final StairBlockWithBase PURPLE_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.PURPLE_TERRACOTTA, "purple_terracotta");
    public static final SlabBlockWithBase PURPLE_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.PURPLE_TERRACOTTA, "purple_terracotta");
    
    public static final StairBlockWithBase MAGENTA_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.MAGENTA_TERRACOTTA, "magenta_terracotta");
    public static final SlabBlockWithBase MAGENTA_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.MAGENTA_TERRACOTTA, "magenta_terracotta");
    
    public static final StairBlockWithBase PINK_TERACOTTA_STAIRS = new StairBlockWithBase(Blocks.PINK_TERRACOTTA, "pink_terracotta");
    public static final SlabBlockWithBase PINK_TERACOTTA_SLAB = new SlabBlockWithBase(Blocks.PINK_TERRACOTTA, "pink_terracotta");
    
    public static final StairBlockWithBase TUFF_STAIRS = new StairBlockWithBase(Blocks.TUFF, "tuff", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase TUFF_SLAB = new SlabBlockWithBase(Blocks.TUFF, "tuff", BingusExtrasMod.ToolType.PICKAXE);
    
    public static StairBlockWithBase OBSIDIAN_STAIRS = new StairBlockWithBase(Blocks.OBSIDIAN, "obsidian", BingusExtrasMod.ToolType.PICKAXE);
    public static SlabBlockWithBase OBSIDIAN_SLAB = new SlabBlockWithBase(Blocks.OBSIDIAN, "obsidian", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase CRYING_OBSIDIAN_STAIRS = new StairBlockWithBase(Blocks.CRYING_OBSIDIAN, "crying_obsidian", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase CRYING_OBSIDIAN_SLAB = new SlabBlockWithBase(Blocks.CRYING_OBSIDIAN, "crying_obsidian", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase ICE_STAIRS = new StairBlockWithBase(Blocks.ICE, "ice", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase ICE_SLAB = new SlabBlockWithBase(Blocks.ICE, "ice", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase PACKED_ICE_STAIRS = new StairBlockWithBase(Blocks.PACKED_ICE, "packed_ice", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase PACKED_ICE_SLAB = new SlabBlockWithBase(Blocks.PACKED_ICE, "packed_ice", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase BLUE_ICE_STAIRS = new StairBlockWithBase(Blocks.BLUE_ICE, "blue_ice", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase BLUE_ICE_SLAB = new SlabBlockWithBase(Blocks.BLUE_ICE, "blue_ice", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase SNOW_STAIRS = new StairBlockWithBase(Blocks.SNOW_BLOCK, "snow", BingusExtrasMod.ToolType.SHOVEL);
    public static final SlabBlockWithBase SNOW_SLAB = new SlabBlockWithBase(Blocks.SNOW_BLOCK, "snow", BingusExtrasMod.ToolType.SHOVEL);
    
    public static final StairBlockWithBase MAGMA_STAIRS = new StairBlockWithBase(Blocks.MAGMA_BLOCK, "magma", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase MAGMA_SLAB = new SlabBlockWithBase(Blocks.MAGMA_BLOCK, "magma", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase GLOWSTONE_STAIRS = new StairBlockWithBase(Blocks.GLOWSTONE, "glowstone", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase GLOWSTONE_SLAB = new SlabBlockWithBase(Blocks.GLOWSTONE, "glowstone", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase SEA_LANTERN_STAIRS = new StairBlockWithBase(Blocks.SEA_LANTERN, "sea_lantern", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase SEA_LANTERN_SLAB = new SlabBlockWithBase(Blocks.SEA_LANTERN, "sea_lantern", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase SHROOMLIGHT_STAIRS = new StairBlockWithBase(Blocks.SHROOMLIGHT, "shroomlight", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase SHROOMLIGHT_SLAB = new SlabBlockWithBase(Blocks.SHROOMLIGHT, "shroomlight", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase VERDANT_FROGLIGHT_STAIRS = new StairBlockWithBase(Blocks.VERDANT_FROGLIGHT, "verdant_froglight_side", "verdant_froglight_top", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase VERDANT_FROGLIGHT_SLAB = new SlabBlockWithBase(Blocks.VERDANT_FROGLIGHT, "verdant_froglight_side", "verdant_froglight_top", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase OCHRE_FROGLIGHT_STAIRS = new StairBlockWithBase(Blocks.OCHRE_FROGLIGHT, "ochre_froglight_side", "ochre_froglight_top", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase OCHRE_FROGLIGHT_SLAB = new SlabBlockWithBase(Blocks.OCHRE_FROGLIGHT, "ochre_froglight_side", "ochre_froglight_top", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase PEARLESCENT_FROGLIGHT_STAIRS = new StairBlockWithBase(Blocks.PEARLESCENT_FROGLIGHT, "pearlescent_froglight_side", "pearlescent_froglight_top", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase PEARLESCENT_FROGLIGHT_SLAB = new SlabBlockWithBase(Blocks.PEARLESCENT_FROGLIGHT, "pearlescent_froglight_side", "pearlescent_froglight_top", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase AMETHYST_BLOCK_STAIRS = new StairBlockWithBase(Blocks.AMETHYST_BLOCK, "amethyst_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase AMETHYST_BLOCK_SLAB = new SlabBlockWithBase(Blocks.AMETHYST_BLOCK, "amethyst_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase SOUL_SAND_STAIRS = new StairBlockWithBase(Blocks.SOUL_SAND, "soul_sand", BingusExtrasMod.ToolType.SHOVEL);
    public static final SlabBlockWithBase SOUL_SAND_SLAB = new SlabBlockWithBase(Blocks.SOUL_SAND, "soul_sand", BingusExtrasMod.ToolType.SHOVEL);
    
    public static final StairBlockWithBase SOUL_SOIL_STAIRS = new StairBlockWithBase(Blocks.SOUL_SOIL, "soul_soil", BingusExtrasMod.ToolType.SHOVEL);
    public static final SlabBlockWithBase SOUL_SOIL_SLAB = new SlabBlockWithBase(Blocks.SOUL_SOIL, "soul_soil", BingusExtrasMod.ToolType.SHOVEL);
    
    public static final StairBlockWithBase SCULK_STAIRS = new StairBlockWithBase(Blocks.SCULK, "sculk", BingusExtrasMod.ToolType.HOE);
    public static final SlabBlockWithBase SCULK_SLAB = new SlabBlockWithBase(Blocks.SCULK, "sculk", BingusExtrasMod.ToolType.HOE);

    public static final StairBlockWithBase MUD_STAIRS = new StairBlockWithBase(Blocks.MUD, "mud", BingusExtrasMod.ToolType.SHOVEL);
    public static final SlabBlockWithBase MUD_SLAB = new SlabBlockWithBase(Blocks.MUD, "mud", BingusExtrasMod.ToolType.SHOVEL);
    
    public static final StairBlockWithBase COARSE_DIRT_STAIRS = new StairBlockWithBase(Blocks.COARSE_DIRT, "coarse_dirt", BingusExtrasMod.ToolType.SHOVEL);
    public static final SlabBlockWithBase COARSE_DIRT_SLAB = new SlabBlockWithBase(Blocks.COARSE_DIRT, "coarse_dirt", BingusExtrasMod.ToolType.SHOVEL);
    
    public static final StairBlockWithBase DIRT_STAIRS = new StairBlockWithBase(Blocks.DIRT, "dirt", BingusExtrasMod.ToolType.SHOVEL);
    public static final SlabBlockWithBase DIRT_SLAB = new SlabBlockWithBase(Blocks.DIRT, "dirt", BingusExtrasMod.ToolType.SHOVEL);
    
    public static final StairBlockWithBase MOSS_STAIRS = new StairBlockWithBase(Blocks.MOSS_BLOCK, "moss_block", BingusExtrasMod.ToolType.HOE);
    public static final SlabBlockWithBase MOSS_SLAB = new SlabBlockWithBase(Blocks.MOSS_BLOCK, "moss_block", BingusExtrasMod.ToolType.HOE);
    
    public static final StairBlockWithBase NETHERRACK_STAIRS = new StairBlockWithBase(Blocks.NETHERRACK, "netherrack", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase NETHERRACK_SLAB = new SlabBlockWithBase(Blocks.NETHERRACK, "netherrack", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase ENDSTONE_STAIRS = new StairBlockWithBase(Blocks.END_STONE, "end_stone", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase ENDSTONE_SLAB = new SlabBlockWithBase(Blocks.END_STONE, "end_stone", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final StairBlockWithBase HONEYCOMB_STAIRS = new StairBlockWithBase(Blocks.HONEYCOMB_BLOCK, "honeycomb_block");
    public static final SlabBlockWithBase HONEYCOMB_SLAB = new SlabBlockWithBase(Blocks.HONEYCOMB_BLOCK, "honeycomb_block");
    
    public static final BingusExtrasBlock ENDER_PEARL_BLOCK = new EnderPearlBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).emissiveLighting(Blocks::always).luminance(state -> 5).sounds(BlockSoundGroup.BONE).requiresTool().strength(1.5F, 6.0F), BingusExtrasMod.ToolType.PICKAXE);
    public static final BingusExtrasBlock WHAT = new BingusExtrasBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).emissiveLighting(Blocks::always).sounds(BlockSoundGroup.SCULK).strength(-1.0f, 3600000.0f).dropsNothing().allowsSpawning(Blocks::never).pistonBehavior(PistonBehavior.BLOCK));
    public static final BingusExtrasBlock RORY_BLOCK = new BingusExtrasBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).sounds(BlockSoundGroup.BONE).strength(1.5F, 6.0F).requiresTool().luminance(state -> 1));
    public static final StairBlockWithBase RORY_STAIRS = new StairBlockWithBase(RORY_BLOCK, "rory_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase RORY_SLAB = new SlabBlockWithBase(RORY_BLOCK, "rory_block", BingusExtrasMod.ToolType.PICKAXE);
    
    @Override
    public BlockItem createBlockItem(Block block, String identifier) {
        if (block == NETHERITE_STAIRS)  return new BlockItem(block, new OwoItemSettings().group(BingusExtrasMod.GROUP).fireproof());
        if (block == NETHERITE_SLAB)  return new BlockItem(block, new OwoItemSettings().group(BingusExtrasMod.GROUP).fireproof());

        return new BlockItem(block, new OwoItemSettings().group(BingusExtrasMod.GROUP));
    }
}
