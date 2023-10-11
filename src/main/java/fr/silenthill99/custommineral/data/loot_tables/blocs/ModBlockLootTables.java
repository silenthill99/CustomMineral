package fr.silenthill99.custommineral.data.loot_tables.blocs;

import fr.silenthill99.custommineral.init.ModBlocks;
import fr.silenthill99.custommineral.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;

import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLootTables {
    @Override
    protected void addTables() {
        this.dropSelf(ModBlocks.ULINITE_BLOCK.get());
        this.dropSelf(ModBlocks.ULINITE_ORE.get());
        this.add(ModBlocks.AMETHYST_ORE.get(), (ore) -> createOreDrop(ore, ModItems.AMETHYST.get()));
    }

    @SuppressWarnings("NullableProblems")
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCK.getEntries().stream()
                .map(RegistryObject::get)
                .collect(Collectors.toList());
    }
}
