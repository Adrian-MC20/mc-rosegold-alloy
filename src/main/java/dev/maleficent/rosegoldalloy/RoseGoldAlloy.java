package dev.maleficent.rosegoldalloy;

import dev.maleficent.rosegoldalloy.registry.ModBlocks;
import dev.maleficent.rosegoldalloy.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class RoseGoldAlloy implements ModInitializer {
	public static final String MOD_ID = "rosegoldalloy";

	@Override
	public void onInitialize() {
        ModItems.init();
        ModBlocks.init();
	}
}
