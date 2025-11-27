package dev.maleficent.rosegoldalloy.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static dev.maleficent.rosegoldalloy.RoseGoldAlloy.MOD_ID;

public class ModBlocks {
    public static final ResourceKey<Block> ROSE_GOLD_BLOCK_KEY = ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, "rose_gold_block"));

    public static final Block ROSE_GOLD_BLOCK = Blocks.register(ROSE_GOLD_BLOCK_KEY, Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK));

    public static final BlockItem ROSE_GOLD_BLOCK_ITEM = (BlockItem) Items.registerBlock(ROSE_GOLD_BLOCK, BlockItem::new, new Item.Properties());

    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
            entries.accept(ROSE_GOLD_BLOCK_ITEM);
        });
    }
}
