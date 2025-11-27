package dev.maleficent.rosegoldalloy.datagen;

import dev.maleficent.rosegoldalloy.registry.ModItems;
import dev.maleficent.rosegoldalloy.registry.ModToolMaterials;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

public class ModTagProvider extends FabricTagProvider<Item> {
    public ModTagProvider(FabricDataOutput output, ResourceKey<Registry<Item>> registryKey, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registryKey, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateRawBuilder(ModToolMaterials.ROSE_GOLD_REPAIR_INGREDIENTS).addOptionalTag(ModItems.ROSE_GOLD_INGOT_KEY.location());
    }
}
