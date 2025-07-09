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

    public static final RegistryEntry<ArmorMaterial> ROSE_GOLD = registerMaterial("rose_gold",
            Map.of(
                    Type.HELMET,2,
                    Type.CHESTPLATE, 5,
                    Type.LEGGINGS, 3,
                    Type.BOOTS,1
            ),15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            () -> Ingredient.ofItems(ReforgedItems.ROSE_GOLD_INGOT),3.0f,0.1f,false);

}