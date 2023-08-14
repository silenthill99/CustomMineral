package fr.silenthill99.custommineral.init;

import fr.silenthill99.custommineral.Main;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
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
    public static final RegistryObject<Block> ULINITE_ORE = createBlock("ulinite_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops().strength(10.0f, 15f)), () -> new BlockItem(ModBlocks.ULINITE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> ULINITE_BLOCK = createBlock("ulinite_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops().strength(10.0f, 15f)), () -> new BlockItem(ModBlocks.ULINITE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    private static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> block, Supplier<? extends Item> item)
    {
        RegistryObject<Block> bloc = BLOCK.register(name, block);
        ModItems.ITEMS.register(name, item);
        return bloc;
    }
}
