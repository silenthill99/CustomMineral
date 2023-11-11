package fr.silenthill99.custommineral.init;

import fr.silenthill99.custommineral.Main;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);
    public static final RegistryObject<Block> ULINITE_ORE = createBlock("ulinite_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops().strength(10.0f, 15f)));
    public static final RegistryObject<Block> ULINITE_BLOCK = createBlock("ulinite_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops().strength(10.0f, 15f)));
    public static final RegistryObject<Block> AMETHYST_ORE = createBlock("amethyst_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops().strength(10f, 15f)));
    public static final RegistryObject<Block> ULINITE_STAIRS = createBlock("ulinite_stairs", () -> new StairsBlock(() -> ModBlocks.ULINITE_BLOCK.get().defaultBlockState(), AbstractBlock.Properties.copy(ModBlocks.ULINITE_BLOCK.get())));

    private static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> block)
    {
        RegistryObject<Block> bloc = BLOCK.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(bloc.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return bloc;
    }
}
