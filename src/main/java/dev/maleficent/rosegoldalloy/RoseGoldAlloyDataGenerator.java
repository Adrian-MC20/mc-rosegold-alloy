package dev.maleficent.rosegoldalloy;

import dev.maleficent.rosegoldalloy.datagen.ModLootTableProvider;
import dev.maleficent.rosegoldalloy.datagen.ModModelProvider;
import dev.maleficent.rosegoldalloy.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator.Pack;

public class RoseGoldAlloyDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        // A "pack" is a group of providers (models, recipes, loot, etc.)
        Pack pack = fabricDataGenerator.createPack();

        // Fow now we only care about the item models.
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModRecipeProvider::new);
	}
}
