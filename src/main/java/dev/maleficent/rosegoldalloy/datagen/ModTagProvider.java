package dev.maleficent.rosegoldalloy.datagen;

import dev.maleficent.rosegoldalloy.registry.ModItems;
import dev.maleficent.rosegoldalloy.registry.ModToolMaterials;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;

import java.util.concurrent.CompletableFuture;

public class ModTagProvider extends FabricTagProvider {
    public ModTagProvider(FabricDataOutput output, ResourceKey registryKey, CompletableFuture registriesFuture) {
        super(output, registryKey, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateRawBuilder(ModToolMaterials.ROSE_GOLD_REPAIR_INGREDIENTS).addOptionalTag(ModItems.ROSE_GOLD_INGOT_KEY.location());
    }
}
