package dev.maleficent.rosegoldalloy.datagen;

import dev.maleficent.rosegoldalloy.registry.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModBlocksTagProvider extends FabricTagProvider<Block> {
    public ModBlocksTagProvider(FabricDataOutput output, ResourceKey<? extends Registry<Block>> registryKey, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registryKey, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        // Register Block of Rose Gold to be minable by pickaxes
        builder(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.ROSE_GOLD_BLOCK_KEY);
    }
}
