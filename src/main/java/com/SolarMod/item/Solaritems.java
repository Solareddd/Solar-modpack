package com.SolarMod.item;

import com.SolarMod.SolarMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class Solaritems {
    /*public static final Item CONDENSED_EMERALD_BLOCK = registerItem("condensed_emerald_block");
    //9 emerald blocks, 81 emeralds
    public static final Item SUPER_CONDENSED_EMERALD_BLOCK = registerItem("super_condensed_emerald_block");
    //9 condensed emerald blocks, 81 emerald blocks, 729 emeralds
    public static final Item HYPER_CONDENSED_EMERALD_BLOCK = registerItem("hyper_condensed_emerald_block");
    //9 super condensed emerald blocks -->  6561 emeralds
    public static final Item ABSOLUTELY_CONDENSED_EMERALD_BLOCK = registerItem("absolutely_condensed_emerald_block");
    //9 hyper condensed emerald blocks --> 59,049 emeralds

     */


    private static Item registerItem(String name) {
        Identifier id = Identifier.of(SolarMod.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = new Item.Settings().registryKey(key);

        return Registry.register(Registries.ITEM, key, new Item(settings));
    }

    public static void registerItems() {
        SolarMod.LOGGER.info("Registering Solar Items for " + SolarMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
               /* entries.add(CONDENSED_EMERALD_BLOCK);
                entries.add(SUPER_CONDENSED_EMERALD_BLOCK);

                */
        });
    }
}
