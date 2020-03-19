package com.aie.easyfinderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdminViewFoods extends AppCompatActivity {

    Intent selectSponge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_view_foods);
    }

    public void sponge (View view){

        selectSponge = new Intent(this, AdminViewSponge.class);
        startActivity(selectSponge);
    }
}
