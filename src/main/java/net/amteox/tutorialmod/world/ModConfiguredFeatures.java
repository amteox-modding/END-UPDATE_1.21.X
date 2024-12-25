package net.amteox.tutorialmod.world;

import net.amteox.tutorialmod.TutorialMod;
import net.amteox.tutorialmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> ENDERIUM_ORE_KEY = registerKey("enderium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALEWOOD_KEY = registerKey("palewood");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> EnderiumOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.ENDERIUM_ORE.getDefaultState()));

        register(context, ENDERIUM_ORE_KEY, Feature.ORE , new OreFeatureConfig(EnderiumOres,  4));

        register(context, PALEWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PALE_LOG),
                new StraightTrunkPlacer(4, 5, 2),

                BlockStateProvider.of(ModBlocks.PALE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(2), 5),

                new TwoLayersFeatureSize(2, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(TutorialMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }



}
