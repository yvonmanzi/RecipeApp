package com.example.yvonmanzi.recipeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecylerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //get handle to the recyclerView
        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);

        //create new adapter instance

        RecipeListAdapter adapter = new RecipeListAdapter(this, RecipeBank.getInstance(this).getRecipes());

        //connect adapter to rv
        mRecyclerView.setAdapter(adapter);

        //give the rv a default layoutM
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
