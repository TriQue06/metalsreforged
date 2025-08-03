package net.trique.metalsreforged.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trique.metalsreforged.MetalsReforged;

public class ReforgedItems {

    public static final Item AMARYLLIUM_INGOT = registerItem("amaryllium_ingot",
            new Item(new Item.Settings()));

    public static final Item CRIMSONITE_INGOT = registerItem("crimsonite_ingot",
            new Item(new Item.Settings()));

    // CRIMSONITE ITEMS
    public static final Item CRIMSONITE_SWORD = registerItem("crimsonite_sword",
            new SwordItem(ReforgedToolMaterials.CRIMSONITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ReforgedToolMaterials.CRIMSONITE, 5, -2.4f))));
    public static final Item CRIMSONITE_PICKAXE = registerItem("crimsonite_pickaxe",
            new PickaxeItem(ReforgedToolMaterials.CRIMSONITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ReforgedToolMaterials.CRIMSONITE, 1.0F, -2.8f))));
    public static final Item CRIMSONITE_SHOVEL = registerItem("crimsonite_shovel",
            new ShovelItem(ReforgedToolMaterials.CRIMSONITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ReforgedToolMaterials.CRIMSONITE, 1.5F, -3.0f))));
    public static final Item CRIMSONITE_AXE = registerItem("crimsonite_axe",
            new AxeItem(ReforgedToolMaterials.CRIMSONITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ReforgedToolMaterials.CRIMSONITE, 6.0F, -3.2f))));
    public static final Item CRIMSONITE_HOE = registerItem("crimsonite_hoe",
            new HoeItem(ReforgedToolMaterials.CRIMSONITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ReforgedToolMaterials.CRIMSONITE, 0F, -3.0f))));

    public static final Item CRIMSONITE_HELMET = registerItem("crimsonite_helmet",
            new ArmorItem(ReforgedArmorMaterials.CRIMSONITE, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(19))));
    public static final Item CRIMSONITE_CHESTPLATE = registerItem("crimsonite_chestplate",
            new ArmorItem(ReforgedArmorMaterials.CRIMSONITE, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(19))));
    public static final Item CRIMSONITE_LEGGINGS = registerItem("crimsonite_leggings",
            new ArmorItem(ReforgedArmorMaterials.CRIMSONITE, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(19))));
    public static final Item CRIMSONITE_BOOTS = registerItem("crimsonite_boots",
            new ArmorItem(ReforgedArmorMaterials.CRIMSONITE, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(19))));

    // AMARYLLIUM ITEMS
    public static final Item AMARYLLIUM_SWORD = registerItem("amaryllium_sword",
            new SwordItem(ReforgedToolMaterials.AMARYLLIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ReforgedToolMaterials.AMARYLLIUM, 5, -2.4f))));
    public static final Item AMARYLLIUM_PICKAXE = registerItem("amaryllium_pickaxe",
            new PickaxeItem(ReforgedToolMaterials.AMARYLLIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ReforgedToolMaterials.AMARYLLIUM, 1.0F, -2.8f))));
    public static final Item AMARYLLIUM_SHOVEL = registerItem("amaryllium_shovel",
            new ShovelItem(ReforgedToolMaterials.AMARYLLIUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ReforgedToolMaterials.AMARYLLIUM, 1.5F, -3.0f))));
    public static final Item AMARYLLIUM_AXE = registerItem("amaryllium_axe",
            new AxeItem(ReforgedToolMaterials.AMARYLLIUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ReforgedToolMaterials.AMARYLLIUM, 6.0F, -3.2f))));
    public static final Item AMARYLLIUM_HOE = registerItem("amaryllium_hoe",
            new HoeItem(ReforgedToolMaterials.AMARYLLIUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ReforgedToolMaterials.AMARYLLIUM, 0F, -3.0f))));

    public static final Item AMARYLLIUM_HELMET = registerItem("amaryllium_helmet",
            new ArmorItem(ReforgedArmorMaterials.AMARYLLIUM, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(19))));
    public static final Item AMARYLLIUM_CHESTPLATE = registerItem("amaryllium_chestplate",
            new ArmorItem(ReforgedArmorMaterials.AMARYLLIUM, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(19))));
    public static final Item AMARYLLIUM_LEGGINGS = registerItem("amaryllium_leggings",
            new ArmorItem(ReforgedArmorMaterials.AMARYLLIUM, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(19))));
    public static final Item AMARYLLIUM_BOOTS = registerItem("amaryllium_boots",
            new ArmorItem(ReforgedArmorMaterials.AMARYLLIUM, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(19))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MetalsReforged.MOD_ID, name), item);
    }

    public static void registerReforgedItems() {
        MetalsReforged.LOGGER.info("Registering Reforged Items for " + MetalsReforged.MOD_ID);
    }
}
