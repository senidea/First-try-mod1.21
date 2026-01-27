package net.senidea.firsttry.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.senidea.firsttry.FirstTry;

import java.util.Map;

public class ModItems {

    public static final Item PENGLING = registerItem("pengling", new Item(new Item.Settings()));
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    private static Item registerItem(String  name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(FirstTry.MOD_ID, name), item);
    }
    public static void registerModItems(){
        FirstTry.LOGGER.info("Registering Mod Items for" + FirstTry.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->{
            fabricItemGroupEntries.add(PINK_GARNET);
            fabricItemGroupEntries.add(RAW_PINK_GARNET);
            fabricItemGroupEntries.add(PENGLING);
        });
    }
}
