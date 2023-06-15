package com.example.recipefinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRecipe1Click(View view) {
        // Handle recipe item click
        Intent intent = new Intent(MainActivity.this, Recipe_1.class);
        startActivity(intent);
    }

    public void onRecipe2Click(View view) {
        // Handle recipe item click
        Intent intent = new Intent(MainActivity.this, Recipe_2.class);
        startActivity(intent);
    }

    public void onRecipe3Click(View view) {
        // Handle recipe item click
        Intent intent = new Intent(MainActivity.this, Recipe_3.class);
        startActivity(intent);
    }

    public void onRecipe4Click(View view) {
        // Handle recipe item click
        Intent intent = new Intent(MainActivity.this, Recipe_4.class);
        startActivity(intent);
    }

    public void onRecipe5Click(View view) {
        // Handle recipe item click
        Intent intent = new Intent(MainActivity.this, Recipe_5.class);
        startActivity(intent);
    }

    public void onRecipe6Click(View view) {
        // Handle recipe item click
        Intent intent = new Intent(MainActivity.this, Recipe_6.class);
        startActivity(intent);
    }

    public void onRecipe7Click(View view) {
        // Handle recipe item click
        Intent intent = new Intent(MainActivity.this, Recipe_7.class);
        startActivity(intent);
    }

    public void onRecipe8Click(View view) {
        // Handle recipe item click
        Intent intent = new Intent(MainActivity.this, Recipe_8.class);
        startActivity(intent);
    }
}