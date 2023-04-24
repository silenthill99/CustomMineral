package fr.silenthill99.custommineral.init;

import fr.silenthill99.custommineral.Main;
import fr.silenthill99.custommineral.utils.CustomArmorMaterial;
import fr.silenthill99.custommineral.utils.CustomItemTiers;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
    
    public static final RegistryObject<Item> ULINITE = ITEMS.register("ulinite", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    //Items de blocs
    public static final RegistryObject<Item> ULINITE_ORE = ITEMS.register("ulinite_ore", () -> new BlockItem(ModBlocks.ULINITE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    //Items d'outils
    public static final RegistryObject<Item> ULINITE_PICKAXE = ITEMS.register("ulinite_pickaxe", () -> new PickaxeItem(CustomItemTiers.ULINITE_ITEMS, 0, 0, new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item> ULINITE_SWORD = ITEMS.register("ulinite_sword", () -> new SwordItem(CustomItemTiers.ULINITE_ITEMS, 0, 0, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    //Armures
    public static final RegistryObject<Item> ULINITE_HELMET = ITEMS.register("ulinite_helmet", () -> new ArmorItem(CustomArmorMaterial.ULINITE, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<Item> ULINITE_CHESTPLATE = ITEMS.register("ulinite_chestplate", () -> new ArmorItem(CustomArmorMaterial.ULINITE, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<Item> ULINITE_LEGGINGS = ITEMS.register("ulinite_leggings", () -> new ArmorItem(CustomArmorMaterial.ULINITE, EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<Item> ULINITE_BOOTS = ITEMS.register("ulinite_boots", () -> new ArmorItem(CustomArmorMaterial.ULINITE, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
}
