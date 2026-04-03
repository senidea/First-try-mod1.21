package net.senidea.firsttry.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.TransparentBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.senidea.firsttry.FirstTry;

public class ModBlocks {


    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block PENGLING_BLOCK = registerBlock("pengling_block",
            new TransparentBlock(AbstractBlock.Settings.create()
                    .breakInstantly()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .requiresTool()
                    .nonOpaque()
                    .sounds(BlockSoundGroup.SCULK_SENSOR)));

    public static final Block PENGWING_BLOCK = registerBlock("pengwing_block",
            new TransparentBlock(AbstractBlock.Settings.create()
                    .allowsSpawning(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .requiresTool()
                    .nonOpaque()
                    .strength(1f)
                    .sounds(BlockSoundGroup.SCULK_SHRIEKER)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FirstTry.MOD_ID, name), block );
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FirstTry.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        FirstTry.LOGGER.info("Registering Mod Blocks for" + FirstTry.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries ->{
            fabricItemGroupEntries.add(ModBlocks.PINK_GARNET_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.PENGLING_BLOCK);
                });

    }
}
