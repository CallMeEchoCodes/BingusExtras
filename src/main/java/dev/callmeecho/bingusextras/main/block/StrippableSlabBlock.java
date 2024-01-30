package dev.callmeecho.bingusextras.main.block;

import dev.callmeecho.bingusextras.main.BingusExtrasMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StrippableSlabBlock extends SlabBlockWithBase {
    private final SlabBlockWithBase strippedBlock;

    public StrippableSlabBlock(Block base, SlabBlockWithBase strippedBlock) {
        super(base, BingusExtrasMod.ToolType.AXE);
        this.strippedBlock = strippedBlock;
    }

    public StrippableSlabBlock(Block base, SlabBlockWithBase strippedBlock, String sideTexture, String bottomTexture, String topTexture) {
        super(base, sideTexture, bottomTexture, topTexture, BingusExtrasMod.ToolType.AXE);
        this.strippedBlock = strippedBlock;
    }

    public StrippableSlabBlock(Block base, SlabBlockWithBase strippedBlock, String texture) {
        super(base, texture, BingusExtrasMod.ToolType.AXE);
        this.strippedBlock = strippedBlock;
    }

    public StrippableSlabBlock(Block base, SlabBlockWithBase strippedBlock, String sideTexture, String topBottomTexture) {
        super(base, sideTexture, topBottomTexture, BingusExtrasMod.ToolType.AXE);
        this.strippedBlock = strippedBlock;
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!(player.getMainHandStack().getItem() instanceof AxeItem)) return ActionResult.PASS;

        if (world.isClient()) world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0f, 1.0f);
        else {
            world.setBlockState(pos, strippedBlock.getStateWithProperties(state));
            player.getMainHandStack().damage(1, player, (p) -> p.sendToolBreakStatus(hand));
        }

        return ActionResult.SUCCESS;
    }
}
