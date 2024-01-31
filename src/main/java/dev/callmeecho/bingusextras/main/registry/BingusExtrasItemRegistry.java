package dev.callmeecho.bingusextras.main.registry;

import dev.callmeecho.bingusextras.main.BingusExtrasMod;
import dev.callmeecho.bingusextras.main.item.InvisibleMaterial;
import dev.callmeecho.bingusextras.main.item.trinket.CloudInABottle;
import dev.callmeecho.bingusextras.main.item.trinket.EnderArtifact;
import io.wispforest.owo.itemgroup.OwoItemSettings;
import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;

@SuppressWarnings("unused")
public class BingusExtrasItemRegistry implements ItemRegistryContainer {
    public static final CloudInABottle CLOUD_IN_A_BOTTLE = new CloudInABottle(new OwoItemSettings().maxCount(1).group(BingusExtrasMod.GROUP));
    public static final EnderArtifact ENDER_ARTIFACT = new EnderArtifact(new OwoItemSettings().maxCount(1).group(BingusExtrasMod.GROUP));

    public static final ArmorMaterial InvisibleMaterial = new InvisibleMaterial();
    
    public static final Item INVISIBLE_HELMET = new ArmorItem(InvisibleMaterial, ArmorItem.Type.HELMET, new OwoItemSettings().maxCount(1).group(BingusExtrasMod.GROUP));
    public static final Item INVISIBLE_CHESTPLATE = new ArmorItem(InvisibleMaterial, ArmorItem.Type.CHESTPLATE, new OwoItemSettings().maxCount(1).group(BingusExtrasMod.GROUP));
    public static final Item INVISIBLE_LEGGINGS = new ArmorItem(InvisibleMaterial, ArmorItem.Type.LEGGINGS, new OwoItemSettings().maxCount(1).group(BingusExtrasMod.GROUP));
    public static final Item INVISIBLE_BOOTS = new ArmorItem(InvisibleMaterial, ArmorItem.Type.BOOTS, new OwoItemSettings().maxCount(1).group(BingusExtrasMod.GROUP));
}
