package net.amteox.tutorialmod.datagen;

import net.amteox.tutorialmod.block.ModBlocks;
import net.amteox.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.PALE_LOG).log(ModBlocks.PALE_LOG).wood(ModBlocks.PALE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALE_LOG).log(ModBlocks.STRIPPED_PALE_LOG).wood(ModBlocks.STRIPPED_PALE_WOOD);
        BlockStateModelGenerator.BlockTexturePool palePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_PALE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_MAGIC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALE_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.END_STONE_PILLAR).log(ModBlocks.END_STONE_PILLAR);

        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_STEM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_ROOT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_ROOTS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);



        palePlanksPool.stairs(ModBlocks.PALE_STAIRS);
        palePlanksPool.slab(ModBlocks.PALE_SLAB);
        palePlanksPool.button(ModBlocks.PALE_BUTTON);
        palePlanksPool.pressurePlate(ModBlocks.PALE_PRESSURE_PLATE);
        palePlanksPool.fence(ModBlocks.PALE_FENCE);
        palePlanksPool.fenceGate(ModBlocks.PALE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PALE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PALE_TRAPDOOR);

        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);






    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.END_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERIUM_SHARD, Models.GENERATED);




        itemModelGenerator.register(ModItems.ENDERIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERIUM_HOE, Models.HANDHELD);





    }
}
