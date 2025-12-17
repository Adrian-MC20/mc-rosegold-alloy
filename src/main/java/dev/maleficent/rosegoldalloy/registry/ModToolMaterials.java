package dev.maleficent.rosegoldalloy.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

import static dev.maleficent.rosegoldalloy.RoseGoldAlloy.MOD_ID;

public class ModToolMaterials {

    // 1. Define a TagKey for the repair items.
    // This creates a unique ID for a list of items that can be used for repair
    public static final TagKey<Item> ROSE_GOLD_REPAIR_INGREDIENTS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "rose_gold_repair_ingredients"));

    // We will define the ROSE_GOLD Tool material here.
    /*
    Rose Gold Tools/Weapons will have the following stats
    Mining level: 2 (like Iron)
    Durability: 650
    Efficiency: 7 (exactly between Iron and Diamond)
    Damage Bonus: 1 (weaker than Iron, same level as Copper and Stone)
    Enchantability: 20 (almost as high as Gold)
    Repair ingredients: ROSE_GOLD_REPAIR_INGREDIENTS
     */
    public static final ToolMaterial ROSE_GOLD = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            650,
            7.0f,
            1.0f,
            20,
            ROSE_GOLD_REPAIR_INGREDIENTS
    );
}
