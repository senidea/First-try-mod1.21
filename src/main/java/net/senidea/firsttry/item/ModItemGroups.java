package net.senidea.firsttry.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.senidea.firsttry.FirstTry;
import net.senidea.firsttry.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FirstTry.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.firsttry.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                    }).build());
    public static final ItemGroup PENGLING_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FirstTry.MOD_ID, "pengling_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.PENGLING))
                    .displayName(Text.translatable("itemgroup.firsttry.pengling_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PENGLING);
                        entries.add(ModBlocks.PENGLING_BLOCK);
                        entries.add(ModBlocks.PENGWING_BLOCK);
                        entries.add(ModItems.PENGWING);

                    }).build());


    public static void registerItemGroups() {
        FirstTry.LOGGER.info("Registering Item Groups for " + FirstTry.MOD_ID);
    }
}
