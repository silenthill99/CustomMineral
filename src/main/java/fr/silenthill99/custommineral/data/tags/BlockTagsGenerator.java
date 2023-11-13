package fr.silenthill99.custommineral.data.tags;

import fr.silenthill99.custommineral.Main;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class BlockTagsGenerator extends BlockTagsProvider {
    public BlockTagsGenerator(DataGenerator generator, @Nullable ExistingFileHelper helper) {
        super(generator, Main.MODID, helper);
    }
}
