package com.example.intellitourist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {

    //varibles
    private ImageView BotImage;
    Animation animation;
    private Button RequestButton;
    private TextView Answer;
    private EditText Request;
    private String request;
    private String answer;
    private Button ClearBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        BotImage = (ImageView) findViewById(R.id.BotView);
        Answer = (TextView) findViewById(R.id.AnswerTV);
        Request = (EditText) findViewById(R.id.RequestTF);
        RequestButton = (Button) findViewById(R.id.button12);
        ClearBtn = (Button) findViewById(R.id.button13);


        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        BotImage.startAnimation(animation);


        RequestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Festival information
                if (Request.getText().toString().contains("festivals") || Request.getText().toString().contains(" festivals "))
                {
                    Answer.setText("Dublin has many festivals that take place throughout the year. \n" +
                            "•\tLongitude (July)\n" +
                            "•\tForbidden Fruit (June)\n" +
                            "•\tLGBTQ Pride (June)\n" +
                            "•\tSt Patricks Day (March)\n" +
                            "•\tDublin Dance Festival (May)\n" +
                            "•\tOktoberfest (October)\n" +
                            "\n" +
                            "Is there anything else you would like to ask?");
                }
                // pub information

                else if (Request.getText().toString().contains(" prices ") &&  Request.getText().toString().contains(" pubs "))
                {
                    Answer.setText("The average price of alcoholic drinks in pubs is 5.50 euro. Sometimes it depends on the pubs, in terms of location and quality of services" +
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().contains(" recommend ") && Request.getText().toString().contains(" pubs "))
                {
                    Answer.setText("Temple bar has great pubs to visit. Its a Very popular tourist area with a large amount of visitors every year." +
                            " Georges Street has some great pubs as well."+
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().contains(" cheap ") && Request.getText().toString().contains(" pubs "))
                {
                    Answer.setText("Yes!!! You are in luck, Dublin has a chain of wetherspoons pubs. The prices of drinks in wetherspoons range from as little as 2 to 5 euro" +
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().contains(" wetherspoons "))
                {
                    Answer.setText("Yes!!! You are in luck, Dublin has a chain of wetherspoons pubs. The prices of drinks in wehter spoons range from as little as 2 to 5 euro" +
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().contains("pubs") || Request.getText().toString().contains(" pubs "))
                {
                    Answer.setText("Dublin has a wide range of over 100's of different pubs throughout the city. Popular spots like Temple Bar has the best Pubs in Dublin." +
                            "The pubs have friendly staff  and a terrific Atmosphere" +
                            "The price range of bars across the city start from an average amount of 5 euro onwards depending on the location and quality of the pubs" +
                            "Is there anything else you would like to ask?");
                }

                //nightclub information
                else if (Request.getText().toString().contains(" nightclubs ") && (Request.getText().toString().contains(" opening hours ")))
                {
                    Answer.setText("Dont worry night clubs stay open very late in Dublin."+
                            "Most clubs open at 11pm and close at 3am, our longest opened nightclub is copper face jacks which is 5am");
                }

                else if (Request.getText().toString().contains(" nightclubs ")|| Request.getText().toString().contains("nightclubs"))
                {
                    Answer.setText("Dublin has several nightclubs in the city. They are full of a lot of energy." +
                            "We have clubs such as the Academy, Club M, Diceys and many more. Get great deals on drinks and listen to some of the best DJ's in Dublin");
                }

                else {
                   Answer.setText("I'm sorry but I am only programmed to understand certain sentences and phrases");
                }
            }
        });

        ClearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Request.getText().clear();
                Answer.setText(null);
            }
        });

    }



}
