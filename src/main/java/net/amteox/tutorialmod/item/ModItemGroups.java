package net.amteox.tutorialmod.item;

import net.amteox.tutorialmod.TutorialMod;
import net.amteox.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup END_UPDATE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "end_update_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.END_STONE_PALE_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.end_update_blocks"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModBlocks.END_STONE_PALE_BLOCK);
                      entries.add(ModBlocks.PALE_LOG);
                      entries.add(ModBlocks.PALE_WOOD);
                      entries.add(ModBlocks.STRIPPED_PALE_LOG);
                      entries.add(ModBlocks.STRIPPED_PALE_WOOD);
                      entries.add(ModBlocks.PALE_PLANKS);


                      entries.add(ModBlocks.PALE_STAIRS);
                      entries.add(ModBlocks.PALE_SLAB);
                      entries.add(ModBlocks.PALE_BUTTON);
                      entries.add(ModBlocks.PALE_PRESSURE_PLATE);
                      entries.add(ModBlocks.PALE_FENCE);
                      entries.add(ModBlocks.PALE_FENCE_GATE);
                      entries.add(ModBlocks.PALE_DOOR);
                      entries.add(ModBlocks.PALE_TRAPDOOR);
                      entries.add(ModBlocks.ENDERIUM_ORE);
                      entries.add(ModBlocks.ENDERIUM_BLOCK);
                        entries.add(ModBlocks.PALE_LEAVES);
                        entries.add(ModBlocks.PALE_SAPLING);
                        entries.add(ModBlocks.PALE_GRASS);
                        entries.add(ModBlocks.PALE_BUSH);
                        entries.add(ModBlocks.PALE_ROOT);
                        entries.add(ModBlocks.PALE_ROOTS);
                        entries.add(ModBlocks.PALE_STEM);
                        entries.add(ModBlocks.END_MAGIC_BLOCK);
                        entries.add(ModBlocks.END_STONE_PILLAR);


                    }).build());



    public static final ItemGroup END_UPDATE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "end_update_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.END_DUST))
                    .displayName(Text.translatable("itemgroup.tutorialmod.end_update_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.END_DUST);
                        entries.add(ModItems.ENDERIUM_INGOT);
                        entries.add(ModItems.ENDERIUM_SHARD);


                    }).build());

    public static final ItemGroup END_UPDATE_TOOL_ARMOR_GROUPS = Registry.register(Registries.ITEM_GROUP,
    Identifier.of(TutorialMod.MOD_ID, "end_update_tools_armor"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ENDERIUM_SWORD))
            .displayName(Text.translatable("itemgroup.tutorialmod.end_update_tools_armor"))
            .entries((displayContext, entries) -> {
            entries.add(ModItems.ENDERIUM_SWORD);
            entries.add(ModItems.ENDERIUM_PICKAXE);
            entries.add(ModItems.ENDERIUM_AXE);
            entries.add(ModItems.ENDERIUM_SHOVEL);
            entries.add(ModItems.ENDERIUM_HOE);


    }).build());


    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering item groups for " + TutorialMod.MOD_ID);
    }


}
