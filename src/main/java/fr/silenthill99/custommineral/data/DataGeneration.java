package fr.silenthill99.custommineral.data;

import fr.silenthill99.custommineral.Main;
import fr.silenthill99.custommineral.data.loot_tables.ModlootTables;
import fr.silenthill99.custommineral.data.recipe.RecipeGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();

        if (event.includeServer())
        {
            generator.addProvider(new RecipeGenerator(generator));
            generator.addProvider(new ModlootTables(generator));
        }
    }
}
