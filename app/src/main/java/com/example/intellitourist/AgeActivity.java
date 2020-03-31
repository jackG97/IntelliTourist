package com.example.intellitourist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AgeActivity extends AppCompatActivity {

    private Button over;
    private Button under;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);


        over = (Button) findViewById(R.id.over18Btn);
        under = (Button) findViewById(R.id.button14);


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

    public void Over18(){
        Intent intent = new Intent(this, BarsViewsActivity.class);
        startActivity(intent);
        Toast.makeText(AgeActivity.this, "Make sure you bring your ID", Toast.LENGTH_LONG).show();
    }

    public void under18(){
        Intent intent = new Intent(this, QuestionnaireActivity.class);
        startActivity(intent);
        Toast.makeText(AgeActivity.this, "You must be over 18 to enter these venues", Toast.LENGTH_LONG).show();
    }
}
