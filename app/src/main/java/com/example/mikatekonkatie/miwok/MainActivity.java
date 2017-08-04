package com.example.mikatekonkatie.miwok;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumberActivity(View view) {

        Intent number = new Intent(MainActivity.this, NumbersActivity.class);
        startActivity(number);

    }


   public void openFamilyMembersActivity(View view){

       Intent family = new Intent(MainActivity.this, FamilyMembersActivity.class);
      startActivity(family);

    }


    public void openColorsActivity(View view) {
        Intent color = new Intent(MainActivity.this, ColorsActivity.class);
        startActivity(color);

    }



   public void openPhrasesActivity(View view){
        Intent phrase = new Intent(MainActivity.this, PhrasesActivity.class);
        startActivity(phrase);

    }

}