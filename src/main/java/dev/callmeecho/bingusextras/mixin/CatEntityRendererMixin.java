package dev.callmeecho.bingusextras.mixin;

import dev.callmeecho.bingusextras.main.BingusExtrasMod;
import net.minecraft.client.render.entity.CatEntityRenderer;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CatEntityRenderer.class)
public class CatEntityRendererMixin {
    @Inject(method = "getTexture(Lnet/minecraft/entity/passive/CatEntity;)Lnet/minecraft/util/Identifier;", at = @At("HEAD"), cancellable = true)
    public void getTexture(CatEntity catEntity, CallbackInfoReturnable<Identifier> cir) {
        String string = Formatting.strip(catEntity.getName().getString().toLowerCase());
        if ("bingus".equals(string) || "bingu".equals(string)) {
            cir.setReturnValue(new Identifier(BingusExtrasMod.MODID, "textures/entity/cat_bingus.png"));
        }
    }
}
