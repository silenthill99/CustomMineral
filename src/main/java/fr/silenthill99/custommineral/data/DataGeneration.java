package fr.silenthill99.custommineral.data;

import fr.silenthill99.custommineral.Main;
import fr.silenthill99.custommineral.data.loot_tables.ModlootTables;
import fr.silenthill99.custommineral.data.models_and_blockstates.BlockStateGenerator;
import fr.silenthill99.custommineral.data.models_and_blockstates.ItemModelGenerator;
import fr.silenthill99.custommineral.data.recipe.RecipeGenerator;
import fr.silenthill99.custommineral.data.tags.BlockTagsGenerator;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        if (event.includeClient()) {
            generator.addProvider(new BlockStateGenerator(generator, existingFileHelper));
            generator.addProvider(new ItemModelGenerator(generator, existingFileHelper));
        }

        if (event.includeServer())
        {
            generator.addProvider(new RecipeGenerator(generator));
            generator.addProvider(new ModlootTables(generator));
            generator.addProvider(new BlockTagsGenerator(generator, existingFileHelper));
        }
    }
}
