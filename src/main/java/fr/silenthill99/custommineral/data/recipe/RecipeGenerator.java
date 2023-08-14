package fr.silenthill99.custommineral.data.recipe;

import fr.silenthill99.custommineral.Main;
import fr.silenthill99.custommineral.init.ModBlocks;
import fr.silenthill99.custommineral.init.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider
{
    public RecipeGenerator(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.ULINITE_ORE.get()), ModItems.ULINITE.get(), 0.15f, 200)
            .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ULINITE_BLOCK.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ULINITE_PICKAXE.get())
            .pattern("000")
            .pattern(" 1 ")
            .pattern(" 1 ")
            .define('0', ModItems.ULINITE.get())
            .define('1', Items.STICK)
            .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.ULINITE.get(), Items.STICK))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ULINITE_SWORD.get())
            .pattern("0")
            .pattern("0")
            .pattern("1")
            .define('0', ModItems.ULINITE.get())
            .define('1', Items.STICK)
            .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.ULINITE.get(), Items.STICK))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ULINITE_HELMET.get())
            .pattern("000")
            .pattern("0 0")
            .define('0', ModItems.ULINITE.get())
            .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.ULINITE.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ULINITE_CHESTPLATE.get())
            .pattern("0 0")
            .pattern("000")
            .pattern("000")
            .define('0', ModItems.ULINITE.get())
            .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.ULINITE.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ULINITE_LEGGINGS.get())
            .pattern("000")
            .pattern("0 0")
            .pattern("0 0")
            .define('0', ModItems.ULINITE.get())
            .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.ULINITE.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ULINITE_BOOTS.get())
            .pattern("0 0")
            .pattern("0 0")
            .define('0', ModItems.ULINITE.get())
            .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.ULINITE.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ULINITE_BLOCK.get())
            .pattern("000")
            .pattern("000")
            .pattern("000")
            .define('0', ModItems.ULINITE.get())
            .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.ULINITE.get()))
            .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.ULINITE_NUGGET.get(), 9)
            .requires(ModItems.ULINITE.get())
            .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.ULINITE.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ULINITE.get())
                .pattern("000")
                .pattern("000")
                .pattern("000")
                .define('0', ModItems.ULINITE_NUGGET.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.ULINITE.get()))
                .save(consumer, new ResourceLocation(Main.MODID, "ulinite_ingot_recipe"));
    }
}
