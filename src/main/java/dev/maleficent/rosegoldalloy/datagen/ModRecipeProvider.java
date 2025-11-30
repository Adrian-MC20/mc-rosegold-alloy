package dev.maleficent.rosegoldalloy.datagen;

import dev.maleficent.rosegoldalloy.registry.ModBlocks;
import dev.maleficent.rosegoldalloy.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output,
                             CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput output) {
        return new RecipeProvider(registryLookup, output) {
            @Override
            public void buildRecipes() {
                // Rose Gold Ingot Recipe
                shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT, 2)
                        .pattern("GA")
                        .pattern("CC")
                        .define('C', Items.COPPER_INGOT)
                        .define('G', Items.GOLD_INGOT)
                        .define('A', Items.AMETHYST_SHARD)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .save(output);

                // Rose Gold Block (Compression)
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_GOLD_BLOCK)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ModItems.ROSE_GOLD_INGOT)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output);

                // Rose Gold Ingots (Decompression)
                shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT, 9)
                        .requires(ModBlocks.ROSE_GOLD_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.ROSE_GOLD_BLOCK), has(ModBlocks.ROSE_GOLD_BLOCK))
                        .save(output, "rose_gold_ingots_from_block");

                // Rose Gold Sword
                shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_SWORD)
                        .pattern("I")
                        .pattern("I")
                        .pattern("/")
                        .define('I', ModItems.ROSE_GOLD_INGOT)
                        .define('/', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output);

                // Rose Gold Pickaxe
                shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_PICKAXE)
                        .pattern("III")
                        .pattern(" / ")
                        .pattern(" / ")
                        .define('I', ModItems.ROSE_GOLD_INGOT)
                        .define('/', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output);

                // Rose Gold Axe
                shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_AXE)
                        .pattern("II")
                        .pattern("I/")
                        .pattern(" /")
                        .define('I', ModItems.ROSE_GOLD_INGOT)
                        .define('/', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output);

                // Rose Gold Shovel
                shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_SHOVEL)
                        .pattern("I")
                        .pattern("/")
                        .pattern("/")
                        .define('I', ModItems.ROSE_GOLD_INGOT)
                        .define('/', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output);

                // Rose Gold Hoe
                shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_HOE)
                        .pattern("II")
                        .pattern(" /")
                        .pattern(" /")
                        .define('I', ModItems.ROSE_GOLD_INGOT)
                        .define('/', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "RoseGoldAlloy Recipe Provider";
    }
}
