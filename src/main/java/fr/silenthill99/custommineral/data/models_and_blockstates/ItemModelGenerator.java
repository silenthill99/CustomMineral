package fr.silenthill99.custommineral.data.models_and_blockstates;

import fr.silenthill99.custommineral.Main;
import fr.silenthill99.custommineral.init.ModBlocks;
import fr.silenthill99.custommineral.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

public class ItemModelGenerator extends ItemModelProvider {
    public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        generatedItem(ModItems.AMETHYST);
        handheldItem(ModItems.AMETHYST_AXE);
        handheldItem(ModItems.AMETHYST_HOE);
        handheldItem(ModItems.AMETHYST_PICKAXE);
        handheldItem(ModItems.AMETHYST_SHOVEL);
        handheldItem(ModItems.AMETHYST_SWORD);
        generatedItem(ModItems.ULINITE);
        handheldItem(ModItems.ULINITE_AXE);
        generatedItem(ModItems.ULINITE_BOOTS);
        generatedItem(ModItems.ULINITE_CHESTPLATE);
        generatedItem(ModItems.ULINITE_HELMET);
        handheldItem(ModItems.ULINITE_HOE);
        generatedItem(ModItems.ULINITE_LEGGINGS);
        generatedItem(ModItems.ULINITE_NUGGET);
        handheldItem(ModItems.ULINITE_PICKAXE);
        handheldItem(ModItems.ULINITE_SHOVEL);
        handheldItem(ModItems.ULINITE_SWORD);
        customBlock(ModBlocks.ULINITE_STAIRS);
    }

    private ItemModelBuilder generatedItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(Main.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld"))
                .texture("layer0", new ResourceLocation(Main.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder customBlock(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation(Main.MODID, "block/" + block.getId().getPath()));
    }
}
