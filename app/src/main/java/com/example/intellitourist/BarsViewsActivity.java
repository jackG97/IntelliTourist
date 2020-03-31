package com.example.intellitourist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BarsViewsActivity extends AppCompatActivity {


    private Button barsprice;
    private Button barshours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars_views);


        barshours = (Button) findViewById(R.id.barshoursbtn);
        barsprice = (Button) findViewById(R.id.barspricebtn);



        barsprice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BarsViewsActivity.this, BarsPriceMapsActivity.class);
                startActivity(intent);
            }
        });


    }
}
