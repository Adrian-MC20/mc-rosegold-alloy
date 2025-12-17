package dev.maleficent.rosegoldalloy.registry;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import static dev.maleficent.rosegoldalloy.RoseGoldAlloy.MOD_ID;

public class ModEquipmentAssets {
    public static final ResourceKey<EquipmentAsset> ROSE_GOLD =
            ResourceKey.create(EquipmentAssets.ROOT_ID,
                    Identifier.fromNamespaceAndPath(MOD_ID, "rose_gold"));

    private ModEquipmentAssets() {

    }
}
