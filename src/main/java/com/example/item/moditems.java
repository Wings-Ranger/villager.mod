package com.example.item;

import com.example.BreedingVillager;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // 1. Helper method to register items using your Mod ID
    private static Item registerItem(String name, Item item) {
        // We use ExampleMod.MOD_ID because that is where your ID is defined
        return Registry.register(Registries.ITEM, Identifier.of(BreedingVillager.MOD_ID, name), item);
    }

    // 2. This is where you will add your items later
    // public static final Item VILLAGER_CORE = registerItem("villager_core", new Item(new Item.Settings()));

    public static void registerModItems() {
        ExampleMod.LOGGER.info("Registering Mod Items for " + ExampleMod.MOD_ID);
    }
}