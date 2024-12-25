package net.amteox.tutorialmod.datagen;

import net.amteox.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.END_STONE_PALE_BLOCK);
        addDrop(ModBlocks.ENDERIUM_ORE);
        addDrop(ModBlocks.ENDERIUM_BLOCK);
        addDrop(ModBlocks.PALE_LOG);
        addDrop(ModBlocks.PALE_WOOD);
        addDrop(ModBlocks.STRIPPED_PALE_LOG);
        addDrop(ModBlocks.STRIPPED_PALE_LOG);
        addDrop(ModBlocks.PALE_PLANKS);
        addDrop(ModBlocks.END_MAGIC_BLOCK);
        addDrop(ModBlocks.END_STONE_PILLAR);


        addDrop(ModBlocks.PALE_STAIRS);
        addDrop(ModBlocks.PALE_SLAB, slabDrops(ModBlocks.PALE_SLAB));
        addDrop(ModBlocks.PALE_BUTTON);
        addDrop(ModBlocks.PALE_PRESSURE_PLATE);
        addDrop(ModBlocks.PALE_FENCE);
        addDrop(ModBlocks.PALE_FENCE_GATE);
        addDrop(ModBlocks.PALE_DOOR, doorDrops(ModBlocks.PALE_DOOR));
        addDrop(ModBlocks.PALE_TRAPDOOR);
        addDrop(ModBlocks.PALE_SAPLING);

        addDrop(ModBlocks.PALE_LEAVES, leavesDrops(ModBlocks.PALE_LEAVES, ModBlocks.PALE_SAPLING, 0.0625f));


        addDrop(ModBlocks.ENDERIUM_BLOCK);
        addDrop(ModBlocks.ENDERIUM_ORE);





    }
}
