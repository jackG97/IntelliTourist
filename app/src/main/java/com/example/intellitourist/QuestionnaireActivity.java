package com.example.intellitourist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionnaireActivity extends AppCompatActivity {


    private Button Eat;
    private Button Nightlife;
    private Button Nature;
    private Button Culture;
    private Button Movies;
    private Button Muesums;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);


        Eat = (Button) findViewById(R.id.button3);
        Nightlife = (Button) findViewById(R.id.button4);
        Muesums = (Button) findViewById(R.id.button5);
        Nature = (Button) findViewById(R.id.button6);
        Culture = (Button) findViewById(R.id.button7);
        Movies = (Button) findViewById(R.id.button8);

        Eat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionnaireActivity.this, RestaurantsViewsActivity.class);
                startActivity(intent);
            }
        });

        Nightlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionnaireActivity.this, AgeActivity.class);
                startActivity(intent);
            }
        });

        Muesums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionnaireActivity.this, MuseumsViewActivity.class);
                startActivity(intent);
            }
        });

        Nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionnaireActivity.this, ParksMapsActivity.class);
                startActivity(intent);
            }
        });
        Culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionnaireActivity.this, SitesMapsActivity.class);
                startActivity(intent);
            }
        });
        Movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionnaireActivity.this, MoviesMapsActivity.class);
                startActivity(intent);
            }
        });

    }


}
