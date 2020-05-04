package com.example.intellitourist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AgeActivity extends AppCompatActivity {

    //variables
    private Button over;
    private Button under;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);


        //searching for ID of buttons
        over = (Button) findViewById(R.id.over18Btn);
        under = (Button) findViewById(R.id.button14);


        //On click methods for buttons
        over.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Over18();
            }
        });

        under.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                under18();
            }
        });
    }

    //if user is over 18 will be directed to bars/nightclubs type page
    public void Over18(){
        Intent intent = new Intent(this, BarsViewsActivity.class);
        startActivity(intent);
        Toast.makeText(AgeActivity.this, "Make sure you bring your ID", Toast.LENGTH_LONG).show();
    }

    //if user is under 18 wil be directed back to to questionnaire
    public void under18(){
        Intent intent = new Intent(this, QuestionnaireActivity.class);
        startActivity(intent);
        Toast.makeText(AgeActivity.this, "You must be over 18 to enter these venues", Toast.LENGTH_LONG).show();
    }
}
