package dev.maleficent.rosegoldalloy.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

import static dev.maleficent.rosegoldalloy.RoseGoldAlloy.MOD_ID;

public class ModItems {
    // 1. Resource Keys for all items (used for registry, tags, datagen etc.)
    public static final ResourceKey<Item> ROSE_GOLD_INGOT_KEY =
            ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "rose_gold_ingot"));

    public static final ResourceKey<Item> ROSE_GOLD_SWORD_KEY =
            ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "rose_gold_sword"));

    public static final ResourceKey<Item> ROSE_GOLD_PICKAXE_KEY =
            ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "rose_gold_pickaxe"));

    public static final ResourceKey<Item> ROSE_GOLD_AXE_KEY =
            ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "rose_gold_axe"));

    public static final ResourceKey<Item> ROSE_GOLD_SHOVEL_KEY =
            ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "rose_gold_shovel"));

    public static final ResourceKey<Item> ROSE_GOLD_HOE_KEY =
            ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "rose_gold_hoe"));

    public static final ResourceKey<Item> ROSE_GOLD_HELMET_KEY =
            ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "rose_gold_helmet"));

    public static final ResourceKey<Item> ROSE_GOLD_CHESTPLATE_KEY =
            ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "rose_gold_chestplate"));

    public static final ResourceKey<Item> ROSE_GOLD_LEGGINGS_KEY =
            ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "rose_gold_leggings"));

    public static final ResourceKey<Item> ROSE_GOLD_BOOTS_KEY =
            ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "rose_gold_boots"));

    // 2. Item instances
    public static final Item ROSE_GOLD_INGOT =
            register(ROSE_GOLD_INGOT_KEY, key ->
                    new Item(new Item.Properties().setId(key))
            );

    public static final Item ROSE_GOLD_SWORD =
            register(ROSE_GOLD_SWORD_KEY, key ->
                    new Item(
                            new Item.Properties()
                                    .sword(ModToolMaterials.ROSE_GOLD, 4.0F, -2.4F)
                                    .setId(key)
                    )
            );

    public static final Item ROSE_GOLD_PICKAXE =
            register(ROSE_GOLD_PICKAXE_KEY, key ->
                    new Item(
                            new Item.Properties()
                                    .pickaxe(ModToolMaterials.ROSE_GOLD, 1.0F, -2.8F)
                                    .setId(key)
                    )
            );

    // Axe, Shovel and Hoe need to use their dedicated classes to get right-click behaviour
    public static final Item ROSE_GOLD_AXE =
            register(ROSE_GOLD_AXE_KEY, key ->
                    new AxeItem(ModToolMaterials.ROSE_GOLD, 6.0F, -3.1F, new Item.Properties().setId(key))
            );

    public static final Item ROSE_GOLD_SHOVEL =
            register(ROSE_GOLD_SHOVEL_KEY, key ->
                    new ShovelItem(ModToolMaterials.ROSE_GOLD, 1.5F, -3.0F, new Item.Properties().setId(key))
            );

    public static final Item ROSE_GOLD_HOE =
            register(ROSE_GOLD_HOE_KEY, key ->
                    new HoeItem(ModToolMaterials.ROSE_GOLD, -2.0F, -1.0F, new Item.Properties().setId(key))
            );

    public static final Item ROSE_GOLD_HELMET =
            register(ROSE_GOLD_HELMET_KEY,
                    key -> new Item(new Item.Properties().humanoidArmor(ModArmorMaterials.ROSE_GOLD, ArmorType.HELMET).setId(key)));

    public static final Item ROSE_GOLD_CHESTPLATE =
            register(ROSE_GOLD_CHESTPLATE_KEY,
                    key -> new Item(new Item.Properties().humanoidArmor(ModArmorMaterials.ROSE_GOLD, ArmorType.CHESTPLATE).setId(key)));

    public static final Item ROSE_GOLD_LEGGINGS =
            register(ROSE_GOLD_LEGGINGS_KEY,
                    key -> new Item(new Item.Properties().humanoidArmor(ModArmorMaterials.ROSE_GOLD, ArmorType.LEGGINGS).setId(key)));
    public static final Item ROSE_GOLD_BOOTS =
            register(ROSE_GOLD_BOOTS_KEY,
                    key -> new Item(new Item.Properties().humanoidArmor(ModArmorMaterials.ROSE_GOLD, ArmorType.BOOTS).setId(key)));


    private static Item register(ResourceKey<Item> itemKey, Function<ResourceKey<Item>, Item> itemFactory) {
        // Create the item instance
        Item item = itemFactory.apply(itemKey);

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
                    entries.accept(ROSE_GOLD_AXE);
                    entries.accept(ROSE_GOLD_HELMET);
                    entries.accept(ROSE_GOLD_CHESTPLATE);
                    entries.accept(ROSE_GOLD_LEGGINGS);
                    entries.accept(ROSE_GOLD_BOOTS);
                });
    }
}
