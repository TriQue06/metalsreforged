package net.trique.metalsreforged.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.trique.metalsreforged.item.ReforgedItems;

public class ReforgedModelProvider extends FabricModelProvider {
    public ReforgedModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ReforgedItems.ROSE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ReforgedItems.AMETHYST_INGOT, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ReforgedItems.ROSE_GOLD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ReforgedItems.ROSE_GOLD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ReforgedItems.ROSE_GOLD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ReforgedItems.ROSE_GOLD_BOOTS));

    }
}
