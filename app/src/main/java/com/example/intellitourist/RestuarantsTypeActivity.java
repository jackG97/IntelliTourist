package com.example.intellitourist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RestuarantsTypeActivity extends RestuarantsMapActivity {


    private Button ChineseBtn;
    private Button ItallianBtn;
    private Button CafeBtn;
    private Button FastFoodBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restuarants_type);



        ChineseBtn = (Button) findViewById(R.id.button9);
        ItallianBtn = (Button) findViewById(R.id.button10);
        CafeBtn = (Button) findViewById(R.id.button11);
        FastFoodBtn = (Button) findViewById(R.id.button12);

        ChineseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestuarantsTypeActivity.this, RestuarantsMapActivity.class);
                startActivity(intent);
            }
        });

        ItallianBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestuarantsTypeActivity.this, IndianRestuarantsActivity.class);
                startActivity(intent);
            }
        });

        CafeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestuarantsTypeActivity.this, CafeRestuarantsActivity.class);
                startActivity(intent);
            }
        });

        FastFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestuarantsTypeActivity.this, FastFoodRestuarantsActivity.class);
                startActivity(intent);
            }
        });

    }







}
