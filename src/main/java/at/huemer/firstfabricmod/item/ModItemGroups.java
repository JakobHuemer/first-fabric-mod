package at.huemer.firstfabricmod.item;

import at.huemer.firstfabricmod.FirstFabricMod;
import at.huemer.firstfabricmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup NEW_ITEMS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier( FirstFabricMod.MOD_ID, "new_items" ),
            FabricItemGroup
                    .builder()
                    .displayName( Text.translatable( "itemgroup.new_items" ) )
                    .icon(
                            () -> new ItemStack( ModItems.RUBY ) ).entries( ( displayContext, entries ) -> {
                                entries.add( ModItems.RUBY );
                                entries.add( ModItems.SD_CARD );
                                entries.add( Items.DIAMOND );
                                entries.add( ModBlocks.SD_CARD_BLOCK );

                            }
                    )
                    .build()
    );

    public static void registerItemGroups() {
        FirstFabricMod.LOGGER.info( "Registering Item Groups for " + FirstFabricMod.MOD_ID );

    }

}
