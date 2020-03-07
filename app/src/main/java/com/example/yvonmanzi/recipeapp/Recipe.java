package com.example.yvonmanzi.recipeapp;

import java.util.List;

class Recipe {
    private String mTitle;
    private String mShortDescription;
    private List<String> mIngredients;

    public Recipe(String title, String shortDescription, List<String> ingredients){
        this.mShortDescription = shortDescription;
        this.mTitle = title;
        this.mIngredients = ingredients;

    }
    public Recipe(){}

    public String getTitle() {
        return mTitle;
    }

    public String getShortDescription() {
        return mShortDescription;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setShortDescription(String shortDescription) {
        mShortDescription = shortDescription;
    }

    public List<String> getIngredients() {
        return mIngredients;
    }

    public void setIngredients(List<String> ingredients) {
        mIngredients = ingredients;
    }
}
