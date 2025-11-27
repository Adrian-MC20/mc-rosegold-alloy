package dev.maleficent.rosegoldalloy.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

import static dev.maleficent.rosegoldalloy.RoseGoldAlloy.MOD_ID;

public class ModToolMaterials {

    // 1. Define a TagKey for the repair items.
    // This creates a unique ID for a list of items that can be used for repair
    public static final TagKey<Item> ROSE_GOLD_REPAIR_INGREDIENTS = TagKey.create(Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "rose_gold_repair_ingredients"));

    // We will define the ROSE_GOLD material here.
    public static final ToolMaterial ROSE_GOLD = new ToolMaterial(
            BlockTags.NEEDS_DIAMOND_TOOL,
            650,
            6.0f,
            1.0f,
            18,
            ROSE_GOLD_REPAIR_INGREDIENTS
    );
}
