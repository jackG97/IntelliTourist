package com.example.intellitourist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MuseumsViewActivity extends AppCompatActivity {


    private Button museumtype;
    private Button museumprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums_view);

        museumtype = (Button) findViewById(R.id.MTypeBtn);
        museumprice = (Button) findViewById(R.id.button16);


        museumtype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type();
            }
        });

        museumprice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                price();
            }
        });
    }


    public void type (){
        Intent intent = new Intent(MuseumsViewActivity.this, MuseumsTypeMapsActivity.class);
        startActivity(intent);
    }

    public void price (){
        Intent intent = new Intent(MuseumsViewActivity.this, MuseumsPriceMapsActivity.class);
        startActivity(intent);
    }
}
