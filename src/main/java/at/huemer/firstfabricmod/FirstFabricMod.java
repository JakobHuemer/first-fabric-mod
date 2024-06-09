package at.huemer.firstfabricmod;

import at.huemer.firstfabricmod.block.ModBlocks;
import at.huemer.firstfabricmod.item.ModItemGroups;
import at.huemer.firstfabricmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstFabricMod implements ModInitializer {
	public static final String MOD_ID = "firstfabricmod";

	public static final Logger LOGGER = LoggerFactory.getLogger( MOD_ID );

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}