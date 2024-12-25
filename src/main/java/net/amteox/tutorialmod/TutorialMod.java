package net.amteox.tutorialmod;

import net.amteox.tutorialmod.block.ModBlocks;
import net.amteox.tutorialmod.item.ModItemGroups;
import net.amteox.tutorialmod.item.ModItems;
import net.amteox.tutorialmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();


		StrippableBlockRegistry.register(ModBlocks.PALE_LOG, ModBlocks.STRIPPED_PALE_LOG);
		StrippableBlockRegistry.register(ModBlocks.PALE_WOOD, ModBlocks.STRIPPED_PALE_WOOD);


		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_BUTTON, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_PLANKS, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_SLAB, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_PRESSURE_PLATE, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_SAPLING, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_LEAVES, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_FENCE, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_FENCE_GATE, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PALE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PALE_LOG, 5, 5);
	}
}