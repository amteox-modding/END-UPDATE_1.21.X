package net.amteox.tutorialmod.datagen;

import net.amteox.tutorialmod.block.ModBlocks;
import net.amteox.tutorialmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.END_STONE_PALE_BLOCK)
                .add(ModBlocks.ENDERIUM_ORE)
                .add(ModBlocks.ENDERIUM_BLOCK)
                .add(ModBlocks.END_MAGIC_BLOCK)
                .add(ModBlocks.END_STONE_PILLAR);


        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.PALE_LEAVES);






        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.PALE_LOG)
                .add(ModBlocks.PALE_WOOD)
                .add(ModBlocks.PALE_PLANKS);


        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PALE_LOG)
                .add(ModBlocks.PALE_WOOD)
                .add(ModBlocks.STRIPPED_PALE_LOG)
                .add(ModBlocks.STRIPPED_PALE_WOOD);


        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.PALE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PALE_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ENDERIUM_BLOCK)
                .add(ModBlocks.ENDERIUM_ORE);



        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ENDERIUM_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ENDERIUM_BLOCK)
                .add(ModBlocks.ENDERIUM_ORE);





    }
}
