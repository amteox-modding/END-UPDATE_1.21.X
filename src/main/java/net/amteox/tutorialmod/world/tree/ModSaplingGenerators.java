package net.amteox.tutorialmod.world.tree;

import net.amteox.tutorialmod.TutorialMod;
import net.amteox.tutorialmod.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator PALEWOOD = new SaplingGenerator(TutorialMod.MOD_ID + ":palewood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PALEWOOD_KEY), Optional.empty());
}
