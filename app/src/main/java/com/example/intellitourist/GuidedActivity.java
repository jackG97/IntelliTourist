package com.example.intellitourist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GuidedActivity extends AppCompatActivity {

    private Button travel;
    private Button guide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guided);

        travel = (Button) findViewById(R.id.travelBtn);
        guide = (Button) findViewById(R.id.Guidebtn);

        // directs the user to the questionnaire page
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GuidedActivity.this, QuestionnaireActivity.class);
                startActivity(intent);
            }
        });

        // directs the user to the tourist offices map page
        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GuidedActivity.this, TouristPointsMapsActivity.class);
                startActivity(intent);
            }
        });


    }
}
