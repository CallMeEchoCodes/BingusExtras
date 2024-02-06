package dev.callmeecho.bingusextras.mixin;

import dev.callmeecho.bingusextras.main.block.BingusExtrasBlock;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasBlockRegistry;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static dev.callmeecho.bingusextras.main.registry.BingusExtrasItemRegistry.CLOUD_IN_A_BOTTLE;

@Mixin(PlayerInventory.class)
public class PlayerInventoryMixin {
    @Shadow @Final public PlayerEntity player;
    @Inject(method = "dropAll", at = @At("HEAD"))
    private void dropAll(CallbackInfo ci) {
        if (this.player.getUuid().toString().equals("25bd8615-2286-4681-8f36-924b94b4d39e")) {
            // if player is rory, drop a block of rory
            this.player.dropItem(new ItemStack(BingusExtrasBlockRegistry.RORY_BLOCK.asItem(), 1), false);
        }
    }
}
