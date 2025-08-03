package net.trique.metalsreforged.item;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import net.minecraft.item.*;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.trique.metalsreforged.MetalsReforged;

public class ReforgedArmorMaterials{
    public static void initialize(){}

    public static RegistryEntry<ArmorMaterial> registerMaterial(String id, Map<Type, Integer> defensePoints, int enchantability, RegistryEntry<SoundEvent> equipSound, Supplier<Ingredient> repairIngredientSupplier, float toughness, float knockbackResistance, boolean dyeable){
        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(Identifier.of(MetalsReforged.MOD_ID,id),"",dyeable)
        );

        ArmorMaterial material = new ArmorMaterial(defensePoints, enchantability, equipSound, repairIngredientSupplier, layers, toughness, knockbackResistance);
        material = Registry.register(Registries.ARMOR_MATERIAL, Identifier.of(MetalsReforged.MOD_ID, id),material);
        return RegistryEntry.of(material);
    }

    public static final RegistryEntry<ArmorMaterial> AMARYLLIUM = registerMaterial("amaryllium",
            Map.of(
                    Type.BOOTS,3,
                    Type.LEGGINGS, 6,
                    Type.CHESTPLATE, 8,
                    Type.HELMET,3,
                    Type.BODY, 11
            ),15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ReforgedItems.AMARYLLIUM_INGOT),3.0f,0.1f,false);

    public static final RegistryEntry<ArmorMaterial> CRIMSONITE = registerMaterial("crimsonite",
            Map.of(
                    Type.BOOTS,3,
                    Type.LEGGINGS, 6,
                    Type.CHESTPLATE, 8,
                    Type.HELMET,3,
                    Type.BODY, 11
            ),15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ReforgedItems.CRIMSONITE_INGOT),3.0f,0.1f,false);
}