package com.example.intellitourist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuidedActivity extends AppCompatActivity {

    private Button travel;
    private Button guide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guided);

        travel = (Button) findViewById(R.id.travelBtn);
        guide = (Button) findViewById(R.id.Guidebtn);

        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GuidedActivity.this, QuestionnaireActivity.class);
                startActivity(intent);
            }
        });

        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GuidedActivity.this, TouristPointsMapsActivity.class);
                startActivity(intent);
            }
        });


    }
}
