package com.example.yvonmanzi.recipeapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class RecipeListAdapter extends RecyclerView.Adapter<RecipeListAdapter.RecipeListViewHolder> {
    private LayoutInflater mInflater;
    private List<Recipe> mRecipeBank;

    //constructor
    public RecipeListAdapter(Context context, List<Recipe> recipeBank) {
        mInflater = LayoutInflater.from(context);
        mRecipeBank = recipeBank;
    }

    @NonNull
    @Override
    public RecipeListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mRecipeView = mInflater.inflate(R.layout.recipe_list_item, parent, false);
        return new RecipeListViewHolder(mRecipeView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeListViewHolder holder, int position) {
        String title = mRecipeBank.get(position).getTitle();
        String description = mRecipeBank.get(position).getShortDescription();
        holder.mIngredients = mRecipeBank.get(position).getIngredients();
        holder.mTitle.setText(title);
        holder.mDescription.setText(description);

    }

    @Override
    public int getItemCount() {
        return mRecipeBank.size();
    }

    class RecipeListViewHolder extends RecyclerView.ViewHolder {
        private View mRecipeView;
        private TextView mTitle;
        private TextView mDescription;
        private List<String> mIngredients;
        private RecipeListAdapter mAdapter;


        public RecipeListViewHolder(View recipeView, RecipeListAdapter adapter) {
            super(recipeView);

            this.mAdapter = adapter;
            mTitle = recipeView.findViewById(R.id.recipe_title);
            mDescription = recipeView.findViewById(R.id.recipe_shortDescription);
            mDescription.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //come back to this to send intents to the new activity
                }
            });


        }
    }
}
