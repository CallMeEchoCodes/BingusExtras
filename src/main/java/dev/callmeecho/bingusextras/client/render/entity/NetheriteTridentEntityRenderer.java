package dev.callmeecho.bingusextras.client.render.entity;

import dev.callmeecho.bingusextras.client.render.entity.model.NetheriteTridentEntityModel;
import dev.callmeecho.bingusextras.main.BingusExtrasMod;
import dev.callmeecho.bingusextras.main.entity.projectile.NetheriteTridentEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.TridentEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

@Environment(value= EnvType.CLIENT)
public class NetheriteTridentEntityRenderer extends EntityRenderer<NetheriteTridentEntity> {
    public static final Identifier TEXTURE = new Identifier(BingusExtrasMod.MODID, "textures/entity/netherite_trident.png");
    private final NetheriteTridentEntityModel model;

    public NetheriteTridentEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new NetheriteTridentEntityModel(context.getPart(EntityModelLayers.TRIDENT));
    }

    @Override
    public void render(NetheriteTridentEntity tridentEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(g, tridentEntity.prevYaw, tridentEntity.getYaw()) - 90.0f));
        matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.lerp(g, tridentEntity.prevPitch, tridentEntity.getPitch()) + 90.0f));
        VertexConsumer vertexConsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumerProvider, this.model.getLayer(this.getTexture(tridentEntity)), false, tridentEntity.isEnchanted());
        this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 1.0f);
        matrixStack.pop();
        super.render(tridentEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(NetheriteTridentEntity tridentEntity) {
        return TEXTURE;
    }
}

