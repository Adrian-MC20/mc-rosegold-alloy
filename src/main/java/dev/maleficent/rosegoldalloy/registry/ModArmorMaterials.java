package dev.maleficent.rosegoldalloy.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.Map;

import static dev.maleficent.rosegoldalloy.RoseGoldAlloy.MOD_ID;

public class ModArmorMaterials {

    // 1. Define a TagKey for the repair items.
    // This creates a unique ID for a list of items that can be used for repair
    public static final TagKey<Item> ROSE_GOLD_REPAIR_INGREDIENTS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "rose_gold_repair_ingredients"));

    private static final Map<ArmorType, Integer> defenceMap = Map.of(
            ArmorType.HELMET, 2,
            ArmorType.CHESTPLATE, 7,
            ArmorType.LEGGINGS, 5,
            ArmorType.BOOTS, 2
    );

    // We will define the ROSE_GOLD Armor material here.
    /*
    Rose Gold Armor will have the following stats (Full Set)
    Armor: 16 (8 armor pieces)
    Toughness: 6 (3 armor pieces)
    Knockback resistance: 0
    Enchantability: 23 (almost as high as Gold)
    Durability multiplier: 21
    Repair ingredients: ROSE_GOLD_REPAIR_INGREDIENTS

    Helmet
    Armor: 2
    Toughness: 1
    Durability: 231

    Chestplate
    Armor: 7
    Toughness: 3
    Durability: 336

    Leggings
    Armor: 5
    Toughness: 2
    Durability: 315

    Boots
    Armor: 2
    Toughness: 0
    Durability: 273
     */
    public static final ArmorMaterial ROSE_GOLD = new ArmorMaterial(
            21,
            defenceMap,
            23,
            SoundEvents.ARMOR_EQUIP_GOLD,
            1.5f,
            0,
            ROSE_GOLD_REPAIR_INGREDIENTS,
            ModEquipmentAssets.ROSE_GOLD
    );
}
