package net.trique.metalsreforged.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.trique.metalsreforged.MetalsReforged;
import net.trique.metalsreforged.block.ReforgedBlocks;

public class ReforgedItemGroup {
    public static ItemGroup REFORGEDITEMGROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(MetalsReforged.MOD_ID, "reforgeditemgroup"),
            FabricItemGroup.builder().displayName(Text.literal("Metals Reforged"))
                    .icon(() -> new ItemStack(Items.MINECART))
                    .entries((displayContext, entries) -> {
                        entries.add(ReforgedItems.AMETHYST_INGOT);
                        entries.add(ReforgedItems.REFORGED_GOLD_HELMET);
                        entries.add(ReforgedItems.REFORGED_GOLD_CHESTPLATE);
                        entries.add(ReforgedItems.REFORGED_GOLD_LEGGINGS);
                        entries.add(ReforgedItems.REFORGED_GOLD_BOOTS);
                    }).build());

            public static void registerReforgedGroups() {}
}