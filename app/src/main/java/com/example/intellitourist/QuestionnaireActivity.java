package com.example.intellitourist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class QuestionnaireActivity extends AppCompatActivity {

    private Button submit;
    private RadioButton Ryes;
    private RadioButton Rno;
    private RadioButton Byes;
    private RadioButton Bno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        submit = (Button) findViewById(R.id.SubmitBtn);
        Ryes = (RadioButton) findViewById(R.id.radioButton1);
        Rno = (RadioButton) findViewById(R.id.radioButton2);
        Byes = (RadioButton) findViewById(R.id.radioButton3);
        Bno = (RadioButton) findViewById(R.id.radioButton4);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Ryes.isChecked()){
                    Intent intent = new Intent(QuestionnaireActivity.this, RestuarantsMapActivity.class);
                    startActivity(intent);
                } else if(Byes.isChecked()){
                    Intent intent = new Intent(QuestionnaireActivity.this, BarsMapActivity.class);
                    startActivity(intent);
                }
            }
        });

    }


}
