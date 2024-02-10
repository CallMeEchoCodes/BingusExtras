package dev.callmeecho.bingusextras.client;

import dev.callmeecho.bingusextras.client.render.entity.model.NetheriteTridentEntityModel;
import dev.callmeecho.bingusextras.main.BingusExtrasMod;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.resource.ResourceReloadListenerKeys;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import java.util.Collection;
import java.util.Collections;

public class NetheriteTridentItemRenderer implements BuiltinItemRendererRegistry.DynamicItemRenderer, SimpleSynchronousResourceReloadListener {
    private ItemRenderer itemRenderer;
    private NetheriteTridentEntityModel tridentModel;
    private BakedModel inventoryTridentModel;

    @Override
    public Identifier getFabricId() {
        return new Identifier(BingusExtrasMod.MODID, "netherite_trident_renderer");
    }

    @Override
    public Collection<Identifier> getFabricDependencies() {
        return Collections.singletonList(ResourceReloadListenerKeys.MODELS);
    }

    @Override
    public void reload(ResourceManager manager) {
        MinecraftClient mc = MinecraftClient.getInstance();
        this.itemRenderer = mc.getItemRenderer();
        this.tridentModel = new NetheriteTridentEntityModel(mc.getEntityModelLoader().getModelPart(EntityModelLayers.TRIDENT));
        this.inventoryTridentModel = mc.getBakedModelManager().getModel(new ModelIdentifier(BingusExtrasMod.MODID, "netherite_trident_in_inventory", "inventory"));
    }

    @Override
    public void render(ItemStack stack, ModelTransformationMode renderMode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        assert this.tridentModel != null;
        if (renderMode == ModelTransformationMode.GUI || renderMode == ModelTransformationMode.GROUND || renderMode == ModelTransformationMode.FIXED) {
            matrices.pop();
            matrices.push();
            itemRenderer.renderItem(stack, renderMode, false, matrices, vertexConsumers, light, overlay, this.inventoryTridentModel);
        } else {
            matrices.push();
            matrices.scale(1.0F, -1.0F, -1.0F);
            VertexConsumer vertexConsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers, this.tridentModel.getLayer(new Identifier(BingusExtrasMod.MODID, "textures/entity/netherite_trident.png")), false, stack.hasGlint());
            this.tridentModel.render(matrices, vertexConsumer, light, overlay, 1.0F, 1.0F, 1.0F, 1.0F);
            matrices.pop();
        }
    }
}
