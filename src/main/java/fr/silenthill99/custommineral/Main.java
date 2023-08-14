package fr.silenthill99.custommineral;

import fr.silenthill99.custommineral.init.ModBlocks;
import fr.silenthill99.custommineral.init.ModFeatures;
import fr.silenthill99.custommineral.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {

    public static final String MODID = "custom_mineral";

    public Main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the setup method for modloading
        bus.addListener(this::setup);
        // Register the doClientStuff method for modloading
        bus.addListener(this::doClientStuff);
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCK.register(bus);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        ModFeatures features = new ModFeatures();
        features.init();
        MinecraftForge.EVENT_BUS.register(features);
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
    }
}