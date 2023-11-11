package fr.silenthill99.custommineral.data.models_and_blockstates;

import fr.silenthill99.custommineral.Main;
import fr.silenthill99.custommineral.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

public class BlockStateGenerator extends BlockStateProvider {
    public BlockStateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Main.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        createBlock(ModBlocks.ULINITE_BLOCK);
        createBlock(ModBlocks.ULINITE_ORE);
        createBlock(ModBlocks.AMETHYST_ORE);
        stairsBlock((StairsBlock) ModBlocks.ULINITE_STAIRS.get(), blockTexture(ModBlocks.ULINITE_BLOCK.get()));
    }

    private void createBlock(RegistryObject<Block> block) {
        simpleBlock(block.get());
        simpleBlockItem(block.get(), cubeAll(block.get()));
    }
}
