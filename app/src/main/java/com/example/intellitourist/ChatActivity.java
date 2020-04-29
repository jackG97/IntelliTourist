package com.example.intellitourist;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    //variables
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
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (Request.getText().toString().equalsIgnoreCase("hi"))
                {
                    Answer.setText("Hi, nice to meet you, I'm here to provide you with extra information you may need to know about Dublin's Attractions.\n\n "+
                                    "Your next step is to enter in a topic you want to talk about.\n\n" +
                                    "Please enter in the 'Ask me here' box any of the following topics you wish to talk about.\n\n" +
                                    "Festivals, Museums, Parks, Movies, Pubs, Nightclubs, Restaurants, Tourist offices");

                }

                //topic choice
                else if (Request.getText().toString().equalsIgnoreCase("festivals") || Request.getText().toString().equalsIgnoreCase("pubs")
                || Request.getText().toString().equalsIgnoreCase("museums") || Request.getText().toString().equalsIgnoreCase("nightclubs")
                || Request.getText().toString().equalsIgnoreCase("parks") || Request.getText().toString().equalsIgnoreCase("restaurants")
                || Request.getText().toString().equalsIgnoreCase("movies") || Request.getText().toString().equalsIgnoreCase("tourist offices"))
                {
                    Answer.setText("Ok so you want to ask me about "+Request.getText().toString()+". What is it you want to know about?\n\n" +
                            "To ask me please follow this format. Enter in the topic again, followed by a dash symbol, then followed by what it is you want to talk about.\n\n" +
                            "Here is an Example ( pubs-general ). This means you want to know general information about pubs.\n\n" +
                            "You can ask about general information, opening hours, prices and recommendations");
                }

               // Festival information
                else if (Request.getText().toString().equalsIgnoreCase("festivals-general"))
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
                else if (Request.getText().toString().equalsIgnoreCase("pubs-prices"))
                {
                    Answer.setText("The average price of alcoholic drinks in pubs is 5.50 euro. Sometimes it depends on the pubs, in terms of location and quality of services\n" +
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("pubs-recommend"))
                {
                    Answer.setText("Temple bar has great pubs to visit. Its a Very popular tourist area with a large amount of visitors every year." +
                            " Georges Street has some great pubs as well."+
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("pubs-opening hours"))
                {
                    Answer.setText("Pubs that provide food services open at between 9 and 10am.\n" +
                    "pubs that only serve beverages and snacks usually open after 2 pm onwards.\n" +
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("pubs-general"))
                {
                    Answer.setText("Dublin has a wide range of over 100's of different pubs throughout the city. Popular spots like Temple Bar has the best Pubs in Dublin.\n" +
                            "The pubs have friendly staff and a terrific atmosphere.\n" +
                            "The price range of pubs across the city start from an average amount of 5 euro onwards depending on the location and quality of the pubs.\n" +
                            "Is there anything else you would like to ask?");
                }

                //nightclub information
                else if (Request.getText().toString().equalsIgnoreCase("nightclubs-opening hours"))
                {
                    Answer.setText("Don't worry night clubs stay open very late in Dublin.\n"+
                            "Most clubs open at 11pm and close at 3am, our longest opened nightclub is copper face jacks which is 5am.\n" +
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("nightclubs-general"))
                {
                    Answer.setText("Dublin has several nightclubs in the city. They are full of a lot of energy.\n" +
                            "We have clubs such as the Academy, Club M, Diceys and many more. Get great deals on drinks and listen to some of the best DJ's in Dublin.\n" +
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("nightclubs-recommend"))
                {
                    Answer.setText("Best rated nightclubs in Dublin are Diceys, The Academy, The Camden and Copper Face Jacks.\n\n " +
                            "They have tremendous music and are always packed out with customers.\n\n"+
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("nightclubs-prices"))
                {
                    Answer.setText("Dublin's nightclubs offer fantastic deals for drinks. Especially on the weekends\n" +
                            "•\tAcademy 3 Euro drinks Friday\n" +
                            "•\tOpium 3 Euro drinks Saturday\n" +
                            "•\tO'Reillys 4 Euro drinks Saturday\n\n"+
                            "And of course why not try Diceys where you can avail of 2 EURO!!! Drinks\n\n" +
                            "But thats not all folks theres many more places to visit.\n"+
                            "But be aware, nightclubs do require an entry fee of 10 Euro.\n"+
                            "Is there anything else you would like to ask?");
                }

                //museums information
                else if (Request.getText().toString().equalsIgnoreCase("museums-general"))
                {
                    Answer.setText("Big fan of museums? Great!, Dublin has loads of different museums for you.\n" +
                            "There is a wide range of museums to visit such art, history and science museums.\n" +
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("museums-opening hours"))
                {
                    Answer.setText("The museums all across the city all close at different hours\n. " +
                            "Usually between the hours of 9am and 6pm the museums are operating their services.\n" +
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("museums-prices"))
                {
                    Answer.setText("To access our museums you must pay an entry fee. All museums are different depending on the factors such as: \n" +
                            "•\tType\n" +
                            "•\tPopularity\n" +
                            "•\tSize of Museum\n" +
                            "Is there anything else you would like to ask?");
                }

                //parks information
                else if (Request.getText().toString().equalsIgnoreCase("parks-general"))
                {
                    Answer.setText("There are some great parks to visit in Dublin.\n" +
                            "Why not visit parks like St Stephens Green right in the heart of Dublin's city centre.\n" +
                            "Or take a trip to the massively wide open stretch of green land in Dublin's 7 km² Phoenix Park.\n" +
                            "Is there anything else you would like to ask?");
                }

                //restaurants information
                else if (Request.getText().toString().equalsIgnoreCase("restaurants-general"))
                {
                    Answer.setText("We have loads of great restaurants to visit. Dublin has many different type of restaurants such as: \n" +
                            "•\tFastFood\n" +
                            "•\tChinese\n" +
                            "•\tItalian\n" +
                            "•\tCafes\n" +
                            "And Many more. They are based in many locations across the city centre and considered as a warm and welcoming committee. \n" +
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("restaurants-opening hours"))
                {
                    Answer.setText("Restaurants are across Dublin start their business day at 9am and stay open late from 9pm to 11pm\n"+
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("restaurants-prices"))
                {
                    Answer.setText("If you are looking for a take away or fast food based establishment prices will range from minimum 5 euro to maximum 30 euro\n\n"+
                            "Where as with other kinds of restaurants it varies in many different ways.\n\n"+
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("movies-general"))
                {
                    Answer.setText("If your a movie lover then you are in luck. Dublin has many cinema venues across the city. visit our great venues, such as: \n" +
                            "•\tThe Savoy\n"+
                            "•\tCineWorld\n"+
                            "•\tOmniplex\n"+
                            "•\tMovies @ Dundrum\n\n"+
                            "And many more. They show the best and newest movies around." +
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("movies-prices"))
                {
                    Answer.setText("Dublin cinema ticket prices vary on the time of the day.\n"+
                            "•\tMornings 5 to 7 euro\n"+
                            "•\tAfternoon 8 to 10 euro\n"+
                            "•\tEvenings 11 to 12 euro\n"+
                            "They also offer great deals to everyone with special meal deals ranging from 10 to 20 euro where you will receive many goods to chose from.\n" +
                            "They offer deals for students on Tuesdays where you will receive popcorn, a drink and your ticket for just 10 Euro.\n "+
                            "This deal includes international students as well.");
                }

                else if (Request.getText().toString().equalsIgnoreCase("movies-opening hours"))
                {
                    Answer.setText("All cinemas operate from 9am to 12am. The last film showings start at 10pm." +
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("tourist offices-general"))
                {
                    Answer.setText("If you want to find out more about tourism and attractions you can visit the tourist guide offices here in Dublin's city centre.\n" +
                            "They will provide you with more information" +
                            "Is there anything else you would like to ask?");
                }

                else if (Request.getText().toString().equalsIgnoreCase("tourist offices-opening hours"))
                {
                    Answer.setText("The offices are open from 9am to 7pm everyday of the week." +
                            "Is there anything else you would like to ask?");
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
