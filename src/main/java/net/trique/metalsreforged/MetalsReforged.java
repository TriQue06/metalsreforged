package net.trique.metalsreforged;

import net.fabricmc.api.ModInitializer;

import net.trique.metalsreforged.block.ReforgedBlocks;
import net.trique.metalsreforged.item.ReforgedItemGroup;
import net.trique.metalsreforged.item.ReforgedItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetalsReforged implements ModInitializer {
	public static final String MOD_ID = "metalsreforged";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ReforgedBlocks.registerReforgedBlocks();
		ReforgedItems.registerReforgedItems();
		ReforgedItemGroup.registerReforgedGroups();
		LOGGER.info("Tüm PGM'ye sevgilerle <3");
	}
}