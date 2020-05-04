package com.example.intellitourist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BarsViewsActivity extends AppCompatActivity {


    private Button barsprice;
    private Button barstype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars_views);


        barstype = (Button) findViewById(R.id.barshoursbtn);
        barsprice = (Button) findViewById(R.id.barspricebtn);



        // bars/nightclubs price map view
        barsprice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BarsViewsActivity.this, BarsPriceMapsActivity.class);
                startActivity(intent);
            }
        });

        // bars/nightclubs type map view
        barstype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BarsViewsActivity.this, BarsTypeMapsActivity.class);
                startActivity(intent);
            }
        });


    }
}
