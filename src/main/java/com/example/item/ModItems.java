package com.example.item;

import com.example.BreedingVillager;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        // Using Mojang's official factory method for 26.1
        return Registry.register(
                BuiltInRegistries.ITEM,
                Identifier.fromNamespaceAndPath(BreedingVillager.MOD_ID, name),
                item
        );
    }

    public static void registerModItems() {
        BreedingVillager.LOGGER.info("Registering Mod Items for " + BreedingVillager.MOD_ID);
    }
}