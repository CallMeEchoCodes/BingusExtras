package dev.callmeecho.bingusextras.client;

import dev.callmeecho.bingusextras.client.render.entity.NetheriteTridentEntityRenderer;
import dev.callmeecho.bingusextras.client.render.entity.TwilightChakramEntityRenderer;
import dev.callmeecho.bingusextras.main.BingusExtrasMod;
import dev.callmeecho.bingusextras.main.entity.projectile.TwilightChakramEntity;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasEntityTypeRegistry;
import dev.callmeecho.bingusextras.main.registry.BingusExtrasItemRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;

import static dev.callmeecho.bingusextras.main.registry.BingusExtrasItemRegistry.NETHERITE_TRIDENT;

public class BingusExtrasModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        NetheriteTridentItemRenderer tridentItemRenderer = new NetheriteTridentItemRenderer();
        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(tridentItemRenderer);
        BuiltinItemRendererRegistry.INSTANCE.register(NETHERITE_TRIDENT, tridentItemRenderer);
        EntityRendererRegistry.register(BingusExtrasEntityTypeRegistry.NETHERITE_TRIDENT, NetheriteTridentEntityRenderer::new);
        ModelPredicateProviderRegistry.register(NETHERITE_TRIDENT, new Identifier("throwing"), (itemStack, clientWorld, livingEntity, i) -> {
            return livingEntity != null && livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack ? 1.0F : 0.0F;
        });
        ModelLoadingRegistry.INSTANCE.registerModelProvider((manager, out) -> out.accept(new ModelIdentifier(BingusExtrasMod.MODID, "netherite_trident_in_inventory", "inventory")));
    
        EntityRendererRegistry.register(BingusExtrasEntityTypeRegistry.TWILIGHT_CHAKRAM, TwilightChakramEntityRenderer::new);
    }
}
