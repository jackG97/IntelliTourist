package com.example.intellitourist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class QuestionnaireActivity extends AppCompatActivity {

    private Button submit;
    private RadioButton Ryes;
    private RadioButton Rno;
    private RadioButton Byes;
    private RadioButton Bno;
    private RadioButton Myes;
    private RadioButton Mno;
    private RadioButton Pyes;
    private RadioButton Pno;
    private RadioButton Syes;
    private RadioButton Sno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        submit = (Button) findViewById(R.id.SubmitBtn);
        Ryes = (RadioButton) findViewById(R.id.radioButton1);
        Rno = (RadioButton) findViewById(R.id.radioButton2);
        Byes = (RadioButton) findViewById(R.id.radioButton3);
        Bno = (RadioButton) findViewById(R.id.radioButton4);
        Myes = (RadioButton) findViewById(R.id.radioButton);
        Mno = (RadioButton) findViewById(R.id.radioButton5);
        Pyes = (RadioButton) findViewById(R.id.radioButton6);
        Pno = (RadioButton) findViewById(R.id.radioButton7);
        Syes = (RadioButton) findViewById(R.id.radioButton8);
        Sno = (RadioButton) findViewById(R.id.radioButton9);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Ryes.isChecked()){
                    Intent intent = new Intent(QuestionnaireActivity.this, RestuarantsMapActivity.class);
                    startActivity(intent);
                } else if(Byes.isChecked()){
                    Intent intent = new Intent(QuestionnaireActivity.this, MapsActivity.class);
                    startActivity(intent);
                } else if(Myes.isChecked()){
                    Intent intent = new Intent(QuestionnaireActivity.this, MuseumsMapsActivity.class);
                    startActivity(intent);
                } else if(Pyes.isChecked()) {
                    Intent intent = new Intent(QuestionnaireActivity.this, ParksMapsActivity.class);
                    startActivity(intent);
                } else if(Syes.isChecked()) {
                    Intent intent = new Intent(QuestionnaireActivity.this, SitesMapsActivity.class);
                    startActivity(intent);
                }
            }
        });

    }


}
