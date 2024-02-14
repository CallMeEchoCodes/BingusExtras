package dev.callmeecho.bingusextras.mixin;

import net.minecraft.server.PlayerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(PlayerManager.class)
public class PlayerManagerMixin {
    // if player fexema joins the game, replace the login message with "fexema finally joined the game"
//    @ModifyVariable(method = "onPlayerConnect", at = @At("HEAD"), ordinal = 0)
//    private String modifyLoginMessage(String originalMessage) {
//        if (originalMessage.equals("fexema joined the game")) {
//            return "fexema finally joined the game";
//        }
//        return originalMessage;
//    }
}
