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

    public static final StairBlockWithBase NETHERITE_STAIRS = new StairBlockWithBase(Blocks.NETHERITE_BLOCK, "netherite_block", BingusExtrasMod.ToolType.PICKAXE);
    public static final SlabBlockWithBase NETHERITE_SLAB = new SlabBlockWithBase(Blocks.NETHERITE_BLOCK, "netherite_block", BingusExtrasMod.ToolType.PICKAXE);
    
    public static final BingusExtrasBlock ENDER_PEARL_BLOCK = new EnderPearlBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).emissiveLighting(Blocks::always).luminance(state -> 5).sounds(BlockSoundGroup.BONE).requiresTool().strength(1.5F, 6.0F), BingusExtrasMod.ToolType.PICKAXE);
    public static final BingusExtrasBlock WHAT = new BingusExtrasBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).emissiveLighting(Blocks::always).sounds(BlockSoundGroup.SCULK).strength(-1.0f, 3600000.0f).dropsNothing().allowsSpawning(Blocks::never).pistonBehavior(PistonBehavior.BLOCK));
    
    @Override
    public BlockItem createBlockItem(Block block, String identifier) {
        if (block == NETHERITE_STAIRS)  return new BlockItem(block, new OwoItemSettings().group(BingusExtrasMod.GROUP).fireproof());
        if (block == NETHERITE_SLAB)  return new BlockItem(block, new OwoItemSettings().group(BingusExtrasMod.GROUP).fireproof());

        return new BlockItem(block, new OwoItemSettings().group(BingusExtrasMod.GROUP));
    }
}
