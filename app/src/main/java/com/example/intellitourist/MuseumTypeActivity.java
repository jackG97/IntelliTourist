package com.example.intellitourist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MuseumTypeActivity extends AppCompatActivity {

    private Button artb;
    private Button hisb;
    private Button scib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_type);


        artb = (Button) findViewById(R.id.art);
        hisb = (Button) findViewById(R.id.his);
        scib = (Button) findViewById(R.id.sci);

        artb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MuseumTypeActivity.this, MuseumsMapsActivity.class);
                startActivity(intent);
            }
        });

        scib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MuseumTypeActivity.this, MuseumsMapsActivity.class);
                startActivity(intent);
            }
        });

        hisb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MuseumTypeActivity.this, MuseumsMapsActivity.class);
                startActivity(intent);
            }
        });


    }
}
