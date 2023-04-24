package fr.silenthill99.custommineral.data.recipe;

import fr.silenthill99.custommineral.init.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider
{
    public RecipeGenerator(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        CookingRecipeBuilder.smelting(Ingredient.of(ModItems.ULINITE_ORE.get()), ModItems.ULINITE.get(), 0.15f, 200)
            .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.ULINITE_ORE.get()))
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
    }
}
