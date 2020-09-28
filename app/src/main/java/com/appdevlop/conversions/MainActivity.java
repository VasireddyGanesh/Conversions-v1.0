package com.appdevlop.conversions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Age(View view) {
        startActivity(new Intent(MainActivity.this,AgeCaluclation.class));
    }

    public void Convert(View view) {
        startActivity(new Intent(MainActivity.this,Converstions.class));
    }

    public void Calc(View view) {
        startActivity(new Intent(MainActivity.this,Simple_Caluclator.class));
    }
}