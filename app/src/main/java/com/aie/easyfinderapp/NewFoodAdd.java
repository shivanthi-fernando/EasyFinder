package com.aie.easyfinderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewFoodAdd extends AppCompatActivity {

    Intent ViewAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_food_add);
    }

    public void view_add (View view){

        ViewAdd = new Intent(this, AdminViewFoods.class);
        startActivity(ViewAdd);
    }
}
