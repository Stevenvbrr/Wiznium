package net.stevenvbr.wiznium.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.stevenvbr.wiznium.Wiznium;
import net.stevenvbr.wiznium.block.ModBlocks;
import net.stevenvbr.wiznium.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> WIZNIUM_SMELTABLES = List.of(ModBlocks.WIZNIUM_ORE.get());
        List<ItemLike> AZIUM_SMELTABLES = List.of(ModBlocks.AZIUM_ORE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIZNIUM_STICK.get(), 2)
                .pattern("A")
                .pattern("A")
                .define('A', ModItems.WIZNIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.WIZNIUM_INGOT.get()), has(ModItems.WIZNIUM_INGOT.get())).save(pRecipeOutput);

        oreSmelting(pRecipeOutput, WIZNIUM_SMELTABLES, RecipeCategory.MISC, ModItems.WIZNIUM_INGOT.get(),0.5f, 200,"wiznium");
        oreBlasting(pRecipeOutput, WIZNIUM_SMELTABLES, RecipeCategory.MISC, ModItems.WIZNIUM_INGOT.get(),0.5f, 100,"wiznium");
        oreSmelting(pRecipeOutput, AZIUM_SMELTABLES, RecipeCategory.MISC, ModItems.AZIUM_INGOT.get(),0.5f, 200,"azium");
        oreBlasting(pRecipeOutput, AZIUM_SMELTABLES, RecipeCategory.MISC, ModItems.AZIUM_INGOT.get(),0.5f, 100,"azium");

    }

    protected static void oreSmelting(
            RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup
    ) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(
            RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup
    ) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    private static <T extends AbstractCookingRecipe> void oreCooking(
            RecipeOutput pRecipeOutput,
            RecipeSerializer<T> pSerializer,
            AbstractCookingRecipe.Factory<T> pRecipeFactory,
            List<ItemLike> pIngredients,
            RecipeCategory pCategory,
            ItemLike pResult,
            float pExperience,
            int pCookingTime,
            String pGroup,
            String pSuffix
    ) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pSerializer, pRecipeFactory)
                    .group(pGroup)
                    .unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, Wiznium.MOD_ID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }
    }
}
