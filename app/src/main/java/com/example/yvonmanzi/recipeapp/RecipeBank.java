package com.example.yvonmanzi.recipeapp;

import android.content.Context;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class RecipeBank {
    private static RecipeBank sRecipeBank;
    private List<Recipe> mRecipes;

    static RecipeBank getInstance(Context context) {
        if (sRecipeBank == null){
            sRecipeBank = new RecipeBank(context);
        }
        return sRecipeBank;
    }

    private RecipeBank(Context context ) {
        mRecipes = new LinkedList<>();
        for(int i = 1; i < 100; i++){
            Recipe ob = new Recipe();
            ob.setTitle("Recipe" + i);
            ob.setShortDescription("Recipe" + i + "Recipe" + i);
            ob.setIngredients(Arrays.asList(String.valueOf(i), "avocado", "carrots", "butter"));
        }
    }

    public List<Recipe> getRecipes() {
        return mRecipes;
    }
}
