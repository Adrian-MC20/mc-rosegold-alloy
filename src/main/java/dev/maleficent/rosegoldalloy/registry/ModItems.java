package dev.maleficent.rosegoldalloy.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import static dev.maleficent.rosegoldalloy.RoseGoldAlloy.MOD_ID;

public class ModItems {
    public static final ResourceKey<Item> ROSE_GOLD_INGOT_KEY = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "rose_gold_ingot"));

    public static final Item ROSE_GOLD_INGOT = Items.registerItem(ROSE_GOLD_INGOT_KEY, Item::new, new Item.Properties());

    public static void register(){
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {
            entries.accept(ROSE_GOLD_INGOT);
        });
    }
}
