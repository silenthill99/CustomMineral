package fr.silenthill99.custommineral.init;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModFeatures
{
    public ConfiguredFeature<?,?> ULINITE_ORE_FEATURE;
    public ConfiguredFeature<?,?> AMETHYST_ORE_FEATURE;

    public void init()
    {
        ULINITE_ORE_FEATURE = register("ulinite_ore_feature", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.ULINITE_ORE.get().defaultBlockState(), 7))
                .squared()
                .range(18)
                .count(20));

        AMETHYST_ORE_FEATURE = register("amethyst_ore_feature", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.AMETHYST_ORE.get().defaultBlockState(), 3))
                .squared()
                .range(6)
                .range(3));
    }

    public <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> feature)
    {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, name, feature);
    }

    @SubscribeEvent
    public void biomeLoadion(BiomeLoadingEvent event)
    {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        if (event.getCategory() != Biome.Category.NETHER)
        {
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ULINITE_ORE_FEATURE);
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, AMETHYST_ORE_FEATURE);
        }
    }
}
