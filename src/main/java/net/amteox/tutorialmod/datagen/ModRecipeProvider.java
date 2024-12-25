package net.amteox.tutorialmod.datagen;


import net.amteox.tutorialmod.TutorialMod;
import net.amteox.tutorialmod.block.ModBlocks;
import net.amteox.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {


    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {


//        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlock.END_STONE_PALE_BLOCK)
//                .pattern("WL")
//                .input('W', Items.WATER_BUCKET)
//                .input('L', Items.LAVA_BUCKET)
//                .criterion(hasItem(Items.LAVA_BUCKET),conditionsFromItem(Items.LAVA_BUCKET))
//                .offerTo(exporter);



//        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERIUM_INGOT,9)
//                .pattern("R")
//                .input('R', ModBlock.ENDERIUM_BLOCK)
//                .criterion(hasItem(ModBlock.ENDERIUM_BLOCK),conditionsFromItem(ModBlock.ENDERIUM_BLOCK))
//                .offerTo(exporter);

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERIUM_INGOT,9)
                    .input(ModBlocks.ENDERIUM_BLOCK)
                    .criterion(hasItem(ModBlocks.ENDERIUM_BLOCK),conditionsFromItem(ModBlocks.ENDERIUM_BLOCK))
                    .offerTo(exporter, Identifier.of(TutorialMod.MOD_ID, "enderium_ingot_from_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERIUM_INGOT,1)
                .pattern("SDS")
                .pattern("DPD")
                .pattern("SDS")
                .input('S', ModItems.ENDERIUM_SHARD)
                .input('D', ModItems.END_DUST)
                .input('P', Items.ENDER_PEARL)
                .criterion(hasItem(ModItems.ENDERIUM_SHARD),conditionsFromItem(ModItems.ENDERIUM_SHARD))
                .offerTo(exporter, Identifier.of(TutorialMod.MOD_ID, "enderium_ingot_from_shard"));






        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDERIUM_BLOCK,1)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.ENDERIUM_INGOT)
                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR,1)
                .pattern("R")
                .pattern("R")
                .input('R', Blocks.END_STONE_BRICK_SLAB)
                .criterion(hasItem(Blocks.END_STONE_BRICK_SLAB),conditionsFromItem(Blocks.END_STONE_BRICK_SLAB))
                .offerTo(exporter);





        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_SWORD,1)
                .pattern(" E ")
                .pattern(" E ")
                .pattern(" S ")
                .input('E', ModItems.ENDERIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_PICKAXE,1)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .input('E', ModItems.ENDERIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_AXE,1)
                .pattern(" EE")
                .pattern(" SE")
                .pattern(" S ")
                .input('E', ModItems.ENDERIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_SHOVEL,1)
                .pattern(" E ")
                .pattern(" S ")
                .pattern(" S ")
                .input('E', ModItems.ENDERIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_HOE,1)
                .pattern(" EE")
                .pattern(" S ")
                .pattern(" S ")
                .input('E', ModItems.ENDERIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
                .offerTo(exporter);










        //WOOD






        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STICK,4)
                .pattern("R")
                .pattern("R")
                .input('R', ModBlocks.PALE_PLANKS)
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BOWL)
                .pattern("X X")
                .pattern(" X ")
                .input('X', ModBlocks.PALE_PLANKS)
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_WOOD,3)
                .pattern("XX")
                .pattern("XX")
                .input('X', ModBlocks.PALE_LOG)
                .criterion(hasItem(ModBlocks.PALE_LOG),conditionsFromItem(ModBlocks.PALE_LOG))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_PALE_WOOD,3)
                .pattern("XX")
                .pattern("XX")
                .input('X', ModBlocks.STRIPPED_PALE_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_PALE_LOG),conditionsFromItem(ModBlocks.STRIPPED_PALE_LOG))
                .offerTo(exporter);






        FabricRecipeProvider.createFenceRecipe(ModBlocks.PALE_FENCE, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createFenceGateRecipe(ModBlocks.PALE_FENCE_GATE, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createStairsRecipe(ModBlocks.PALE_STAIRS, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_SLAB, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PALE_BUTTON)
                .pattern("X")
                .input('X', ModBlocks.PALE_PLANKS)
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PALE_PRESSURE_PLATE)
                .pattern("RR")
                .input('R', ModBlocks.PALE_PLANKS)
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);






        FabricRecipeProvider.createDoorRecipe(ModBlocks.PALE_DOOR, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createTrapdoorRecipe(ModBlocks.PALE_TRAPDOOR, Ingredient.ofItems(ModBlocks.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PALE_PLANKS),conditionsFromItem(ModBlocks.PALE_PLANKS))
                .offerTo(exporter);


    }


}
