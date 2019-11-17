package com.example.freefoodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.freefoodtracker.Model.FoodType;

public class AddFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);


        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);

        mySpinner.setAdapter(new ArrayAdapter<FoodType>(this, android.R.layout.simple_spinner_item, FoodType.values()));



    }
}
