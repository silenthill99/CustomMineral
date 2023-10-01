package fr.silenthill99.custommineral.utils;

import fr.silenthill99.custommineral.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum CustomItemTiers implements IItemTier
{
    ULINITE_ITEMS(5, 200, 8.0f, 3.0f, 18, () -> Ingredient.of(ModItems.ULINITE.get())),
    AMETHYST_ITEMS(10, 1000, 24F, 40F, 50, () -> Ingredient.of(ModItems.AMETHYST.get()))
    ;
    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> ingredient;

    CustomItemTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> ingredient)
    {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.ingredient = new LazyValue<>(ingredient);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }
}
