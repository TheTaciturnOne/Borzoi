package net.thetaciturnone.borzoi.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registries;
import net.thetaciturnone.borzoi.Borzoi;
import net.thetaciturnone.borzoi.entity.ModEntities;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Borzoi.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Borzoi.LOGGER.debug("Registering mod items for " + Borzoi.MOD_ID);

        addItemsToItemGroups();
    }

    public static final Item BORZOI_SPAWN_EGG = registerItem("borzoi_spawn_egg",
            new SpawnEggItem(ModEntities.BORZOI,0xd0d5d9, 0x1f2614,
                    new FabricItemSettings()));

    public static void addItemsToItemGroups() {
        addToItemGroup(ItemGroups.SPAWN_EGGS, BORZOI_SPAWN_EGG);
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
}
