package dev.callmeecho.bingusextras.main.block;

import dev.callmeecho.bingusextras.main.BingusExtrasMod;
import net.minecraft.block.Block;

public class BingusExtrasBlock extends Block {
    public BingusExtrasMod.ToolType toolType = BingusExtrasMod.ToolType.NONE;

    public BingusExtrasBlock(Settings settings) {
        super(settings);
    }

    public BingusExtrasBlock(Settings settings, BingusExtrasMod.ToolType toolType) {
        super(settings);
        this.toolType = toolType;
    }
}
