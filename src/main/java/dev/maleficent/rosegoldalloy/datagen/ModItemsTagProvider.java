package dev.maleficent.rosegoldalloy.datagen;

import dev.maleficent.rosegoldalloy.registry.ModItems;
import dev.maleficent.rosegoldalloy.registry.ModToolMaterials;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

public class ModItemsTagProvider extends FabricTagProvider<Item> {
    public ModItemsTagProvider(FabricDataOutput output, ResourceKey<Registry<Item>> registryKey, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registryKey, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Register ROSE_GOLD_INGOT as repair ingredient for all rose gold tools
        builder(ModToolMaterials.ROSE_GOLD_REPAIR_INGREDIENTS).add(ModItems.ROSE_GOLD_INGOT_KEY);

        // Register tags for Rose Gold Sword
        builder(ItemTags.SWORDS).add(ModItems.ROSE_GOLD_SWORD_KEY);

        // Register tags for Rose Gold Pickaxe
        builder(ItemTags.PICKAXES).add(ModItems.ROSE_GOLD_PICKAXE_KEY);


        // Register tags for Rose Gold Axe
        builder(ItemTags.AXES).add(ModItems.ROSE_GOLD_AXE_KEY);

        // Register tags for Rose Gold Shovel
        builder(ItemTags.SHOVELS).add(ModItems.ROSE_GOLD_SHOVEL_KEY);

        // Register tags for Rose Gold Hoe
        builder(ItemTags.HOES).add(ModItems.ROSE_GOLD_HOE_KEY);

        // Register tags for Rose Gold Armor
        builder(ItemTags.HEAD_ARMOR).add(ModItems.ROSE_GOLD_HELMET_KEY);
        builder(ItemTags.CHEST_ARMOR).add(ModItems.ROSE_GOLD_CHESTPLATE_KEY);
        builder(ItemTags.LEG_ARMOR).add(ModItems.ROSE_GOLD_LEGGINGS_KEY);
        builder(ItemTags.FOOT_ARMOR).add(ModItems.ROSE_GOLD_BOOTS_KEY);
    }
}
