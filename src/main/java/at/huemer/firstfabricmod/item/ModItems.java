package at.huemer.firstfabricmod.item;

import at.huemer.firstfabricmod.FirstFabricMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem( "ruby", new Item( new FabricItemSettings() ) );
    public static final Item SD_CARD = registerItem( "sd_card", new Item( new FabricItemSettings() ) );

    public static void addItemsToIngredientTabItemGroup( FabricItemGroupEntries entries ) {
        entries.add( RUBY );
        entries.add( SD_CARD );
    }

    private static Item registerItem( String name, Item item ) {
        return Registry.register( Registries.ITEM, new Identifier( FirstFabricMod.MOD_ID, name ), item );
    }

    public static void registerModItems() {
        FirstFabricMod.LOGGER.info( "Registering Mod Items for " + FirstFabricMod.MOD_ID );

        ItemGroupEvents.modifyEntriesEvent( ItemGroups.INGREDIENTS ).register( ModItems::addItemsToIngredientTabItemGroup );
    }
}
