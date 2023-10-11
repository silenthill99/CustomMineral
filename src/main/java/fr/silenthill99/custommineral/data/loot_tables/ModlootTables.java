package fr.silenthill99.custommineral.data.loot_tables;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import fr.silenthill99.custommineral.data.loot_tables.blocs.ModBlockLootTables;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

@SuppressWarnings("all")
public class ModlootTables extends LootTableProvider {
    public ModlootTables(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(Pair.of(ModBlockLootTables::new, LootParameterSets.BLOCK));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((v1, v2) -> LootTableManager.validate(validationtracker, v1, v2));
    }
}
