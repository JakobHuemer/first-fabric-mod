package at.huemer.firstfabricmod.block;

import at.huemer.firstfabricmod.FirstFabricMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    // public static final Block REDSTONE_BLOCK = Blocks.register("redstone_block", new RedstoneBlock( AbstractBlock.Settings.create().mapColor( MapColor.BRIGHT_RED).requiresTool().strength(5.0f, 6.0f).sounds( BlockSoundGroup.METAL).solidBlock(Blocks::never)));

    public static final Block SD_CARD_BLOCK = registerBlock( "sd_card_block",
            new Block( FabricBlockSettings
                    .create()
                    .mapColor( MapColor.LIME )
                    .requiresTool()
                    .strength( 5.0f, 6.0f )
                    .sounds( BlockSoundGroup.AMETHYST_CLUSTER )
                    .solidBlock( Blocks::never )
            ) );


    private static Block registerBlock( String name, Block block ) {
        registerBlockItem( name, block );
        return Registry.register( Registries.BLOCK, new Identifier( FirstFabricMod.MOD_ID, name ), block );
    }

    private static Item registerBlockItem( String name, Block block ) {
        return Registry.register( Registries.ITEM, new Identifier( FirstFabricMod.MOD_ID, name ),
                new BlockItem( block, new FabricItemSettings() ) );
    }

    public static void registerModBlocks() {
        FirstFabricMod.LOGGER.info( "Registering ModBlocks for " + FirstFabricMod.MOD_ID );


    }
}
