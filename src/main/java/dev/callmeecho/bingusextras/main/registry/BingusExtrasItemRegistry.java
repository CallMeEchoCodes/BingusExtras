package dev.callmeecho.bingusextras.main.registry;

import dev.callmeecho.bingusextras.main.BingusExtrasMod;
import dev.callmeecho.bingusextras.main.item.trinket.CloudInABottle;
import dev.callmeecho.bingusextras.main.item.trinket.EnderArtifact;
import io.wispforest.owo.itemgroup.OwoItemSettings;
import io.wispforest.owo.registration.reflect.ItemRegistryContainer;

@SuppressWarnings("unused")
public class BingusExtrasItemRegistry implements ItemRegistryContainer {
    public static final CloudInABottle CLOUD_IN_A_BOTTLE = new CloudInABottle(new OwoItemSettings().maxCount(1).group(BingusExtrasMod.GROUP));
    public static final EnderArtifact ENDER_ARTIFACT = new EnderArtifact(new OwoItemSettings().maxCount(1).group(BingusExtrasMod.GROUP));
}
