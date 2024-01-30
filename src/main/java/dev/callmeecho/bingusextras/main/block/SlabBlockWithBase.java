package dev.callmeecho.bingusextras.main.block;

import dev.callmeecho.bingusextras.main.BingusExtrasMod;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;

public class SlabBlockWithBase extends SlabBlock {
    public Block baseBlock;
    public boolean multiSideTexture = false;
    public String sideTexture;
    public String bottomTexture;
    public String topTexture;

    public BingusExtrasMod.ToolType toolType = BingusExtrasMod.ToolType.NONE;

    public SlabBlockWithBase(Block base) {
        super(BingusExtrasMod.getSettingsFromBlock(base));
        this.baseBlock = base;
    }

    public SlabBlockWithBase(Block base, BingusExtrasMod.ToolType toolType) {
        super(BingusExtrasMod.getSettingsFromBlock(base));
        this.baseBlock = base;
        this.toolType = toolType;
    }

    public SlabBlockWithBase(Block base, String sideTexture, String bottomTexture, String topTexture) {
        super(BingusExtrasMod.getSettingsFromBlock(base));
        this.baseBlock = base;
        this.sideTexture = sideTexture;
        this.bottomTexture = bottomTexture;
        this.topTexture = topTexture;
        this.multiSideTexture = true;
    }

    public SlabBlockWithBase(Block base, String sideTexture, String bottomTexture, String topTexture, BingusExtrasMod.ToolType toolType) {
        super(BingusExtrasMod.getSettingsFromBlock(base));
        this.baseBlock = base;
        this.sideTexture = sideTexture;
        this.bottomTexture = bottomTexture;
        this.topTexture = topTexture;
        this.multiSideTexture = true;
        this.toolType = toolType;
    }

    public SlabBlockWithBase(Block base, String sideTexture, String topBottomTexture) {
        super(BingusExtrasMod.getSettingsFromBlock(base));
        this.baseBlock = base;
        this.sideTexture = sideTexture;
        this.bottomTexture = topBottomTexture;
        this.topTexture = topBottomTexture;
        this.multiSideTexture = true;
    }

    public SlabBlockWithBase(Block base, String sideTexture, String topBottomTexture, BingusExtrasMod.ToolType toolType) {
        super(BingusExtrasMod.getSettingsFromBlock(base));
        this.baseBlock = base;
        this.sideTexture = sideTexture;
        this.bottomTexture = topBottomTexture;
        this.topTexture = topBottomTexture;
        this.multiSideTexture = true;
        this.toolType = toolType;
    }

    public SlabBlockWithBase(Block base, String texture) {
        super(BingusExtrasMod.getSettingsFromBlock(base));
        this.baseBlock = base;
        this.sideTexture = texture;
        this.bottomTexture = texture;
        this.topTexture = texture;
        this.multiSideTexture = true;
    }

    public SlabBlockWithBase(Block base, String texture, BingusExtrasMod.ToolType toolType) {
        super(BingusExtrasMod.getSettingsFromBlock(base));
        this.baseBlock = base;
        this.sideTexture = texture;
        this.bottomTexture = texture;
        this.topTexture = texture;
        this.multiSideTexture = true;
        this.toolType = toolType;
    }

    public Block getBaseBlock() {
        return baseBlock;
    }
}
