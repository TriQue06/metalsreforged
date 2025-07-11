package net.trique.metalsreforged.block;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.trique.metalsreforged.MetalsReforged;

public class ReforgedBlocks {
    public static final Block COPPER_ANVIL = registerBlock("copper_anvil",
            new AnvilBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_ORANGE).requiresTool().strength(5.0F, 1200F).pistonBehavior(PistonBehavior.BLOCK).sounds(BlockSoundGroup.COPPER).sounds(BlockSoundGroup.ANVIL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MetalsReforged.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(MetalsReforged.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
        return item;
    }

    public static void registerReforgedBlocks() {
        MetalsReforged.LOGGER.info("Registering Reforged Blocks for " + MetalsReforged.MOD_ID);
    }
}
