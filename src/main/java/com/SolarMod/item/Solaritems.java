package com.SolarMod.item;

import com.SolarMod.SolarMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Solaritems {
    public static final Item Condensed_Emerald_Block  = registerItem("condensed_emerald_block", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SolarMod.MOD_ID, name), item);
    }

    public static void registerItems() {
        SolarMod.LOGGER.info("Registering Solar Items for " + SolarMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->  {
            fabricItemGroupEntries.add(Condensed_Emerald_Block);
        });
    }
}
