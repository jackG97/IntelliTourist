package com.example.intellitourist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

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


    //directs user to the museums type maps
    public void type (){
        Intent intent = new Intent(MuseumsViewActivity.this, MuseumsTypeMapsActivity.class);
        startActivity(intent);
    }

    //directs user to the museums price maps
    public void price (){
        Intent intent = new Intent(MuseumsViewActivity.this, MuseumsPriceMapsActivity.class);
        startActivity(intent);
    }
}
