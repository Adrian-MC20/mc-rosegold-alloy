package dev.maleficent.rosegoldalloy.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

import static dev.maleficent.rosegoldalloy.RoseGoldAlloy.MOD_ID;

public class ModItems {
    public static final ResourceKey<Item> ROSE_GOLD_INGOT_KEY = ResourceKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "rose_gold_ingot")
    );
    public static final Item ROSE_GOLD_INGOT = register(
            "rose_gold_ingot",
            Item::new,
            new Item.Properties()
    );

    public static final ResourceKey<Item> ROSE_GOLD_SWORD_KEY = ResourceKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "rose_gold_sword")
    );
    public static final Item ROSE_GOLD_SWORD = register(
            "rose_gold_sword",
            Item::new,
            new Item.Properties().sword(ModToolMaterials.ROSE_GOLD, 4.0F, -2.4F)
    );

    public static final ResourceKey<Item> ROSE_GOLD_PICKAXE_KEY = ResourceKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "rose_gold_pickaxe")
    );
    public static final Item ROSE_GOLD_PICKAXE = register(
            "rose_gold_pickaxe",
            Item::new,
            new Item.Properties().pickaxe(ModToolMaterials.ROSE_GOLD, 1.0F, -2.8F)
    );

    public static final ResourceKey<Item> ROSE_GOLD_AXE_KEY = ResourceKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "rose_gold_axe")
    );
    public static final Item ROSE_GOLD_AXE = register(
            "rose_gold_axe",
            Item::new,
            new Item.Properties().axe(ModToolMaterials.ROSE_GOLD, 6.0F, -3.1F)
    );

    public static final ResourceKey<Item> ROSE_GOLD_SHOVEL_KEY = ResourceKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "rose_gold_shovel")
    );
    public static final Item ROSE_GOLD_SHOVEL = register(
            "rose_gold_shovel",
            Item::new,
            new Item.Properties().shovel(ModToolMaterials.ROSE_GOLD, 1.5F, -3.0F)
    );

    public static final ResourceKey<Item> ROSE_GOLD_HOE_KEY = ResourceKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "rose_gold_hoe")
    );
    public static final Item ROSE_GOLD_HOE = register(
            "rose_gold_hoe",
            Item::new,
            new Item.Properties().shovel(ModToolMaterials.ROSE_GOLD, -2.0F, -1.0F)
    );

    private static Item register(String name, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        // Create the item key
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name));

        // Create the item instance
        Item item = itemFactory.apply(settings.setId(itemKey));

        // Register the item
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register(entries -> {
            entries.accept(ROSE_GOLD_INGOT);
                });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register(entries -> {
            entries.accept(ROSE_GOLD_PICKAXE);
            entries.accept(ROSE_GOLD_AXE);
            entries.accept(ROSE_GOLD_SHOVEL);
            entries.accept(ROSE_GOLD_SHOVEL);
            entries.accept(ROSE_GOLD_HOE);
                });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register(entries -> {
                    entries.accept(ROSE_GOLD_SWORD);
                });
    }
}
