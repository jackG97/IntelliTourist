package com.example.intellitourist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RestaurantsViewsActivity extends RestuarantsMapActivity {


    private Button ViewByType;
    private Button ViewByPrice;
    private Button ViewByPopularity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_by_type);



        ViewByType = (Button) findViewById(R.id.button9);
        ViewByPrice = (Button) findViewById(R.id.button10);
        ViewByPopularity = (Button) findViewById(R.id.button11);




        //directs user to restaurants type page
        ViewByType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestaurantsViewsActivity.this, RestuarantsMapActivity.class);
                startActivity(intent);
            }
        });

        //directs user to restaurants price page
        ViewByPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestaurantsViewsActivity.this, RestuarantsPriceMapActivity.class);
                startActivity(intent);
            }
        });

        //directs user to restaurants star rating page
        ViewByPopularity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestaurantsViewsActivity.this, RestuarantsPopularityActivity.class);
                startActivity(intent);
            }
        });



    }







}
