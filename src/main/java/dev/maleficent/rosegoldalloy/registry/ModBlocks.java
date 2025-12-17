package dev.maleficent.rosegoldalloy.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

import static dev.maleficent.rosegoldalloy.RoseGoldAlloy.MOD_ID;

public class ModBlocks {

    public static final ResourceKey<Block> ROSE_GOLD_BLOCK_KEY = keyOfBlock("rose_gold_block");
    public static final Block ROSE_GOLD_BLOCK = register(
            "rose_gold_block",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK),
            true // also register a BlockItem
    );

    private static Block register(String name,
                                  Function<BlockBehaviour.Properties, Block> blockFactory,
                                  BlockBehaviour.Properties settings,
                                  boolean shouldRegisterItem) {
        // Create registry key for the block
        ResourceKey<Block> blockKey = keyOfBlock(name);
        // Attach the id to the block properties, required since 1.21.2+
        Block block = blockFactory.apply(settings.setId(blockKey));

        if (shouldRegisterItem) {
            // Item registry key uses the same id
            ResourceKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(
                    block,
                    new Item.Properties()
                            .setId(itemKey)
                            .useBlockDescriptionPrefix()
            );

            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(
                Registries.BLOCK,
                Identifier.fromNamespaceAndPath(MOD_ID, name)
        );
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(
                Registries.ITEM,
                Identifier.fromNamespaceAndPath(MOD_ID, name)
        );
    }

    public static void init() {
        // Since the BlockItem is registered automatically, use asItem() here
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS)
                .register(entries -> entries.accept(ROSE_GOLD_BLOCK.asItem()));
    }
}