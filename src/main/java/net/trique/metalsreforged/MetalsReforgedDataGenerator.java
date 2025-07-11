package net.trique.metalsreforged;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.trique.metalsreforged.data.ReforgedModelProvider;
import net.trique.metalsreforged.data.ReforgedRecipeProvider;

public class MetalsReforgedDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ReforgedModelProvider::new);
	}
}