package net.trique.metalsreforged.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trique.metalsreforged.MetalsReforged;

public class ReforgedItems {

    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot",
            new Item(new Item.Settings()));

    public static final Item AMETHYST_INGOT = registerItem("amethyst_ingot",
            new Item(new Item.Settings()));

    public static final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet",
            new ArmorItem(ReforgedArmorMaterials.ROSE_GOLD, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(24))));

    public static final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate",
            new ArmorItem(ReforgedArmorMaterials.ROSE_GOLD, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(24))));

    public static final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings",
            new ArmorItem(ReforgedArmorMaterials.ROSE_GOLD, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(24))));

    public static final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots",
            new ArmorItem(ReforgedArmorMaterials.ROSE_GOLD, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(24))));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MetalsReforged.MOD_ID, name), item);
    }

    public static void registerReforgedItems() {
        MetalsReforged.LOGGER.info("Registering Reforged Items for " + MetalsReforged.MOD_ID);
    }
}