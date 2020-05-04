package com.example.intellitourist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class OptionsActivity extends AppCompatActivity {

    private FirebaseAuth mfirebaseAuth;
    private Button Chat;
    private Button Question;
    private Button Logout;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_page);



        Logout = findViewById(R.id.SignoutBtn);
        Chat = (Button) (findViewById(R.id.Chatbtn));
        Question = (Button) (findViewById(R.id.QuestionnaireBtn));


        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseAuth.getInstance().signOut();
                Intent I = new Intent(OptionsActivity.this, LoginActivity.class);
                startActivity(I);

            }
        });
        Chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenChat();
            }
        });

        Question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenQuestion();
            }
        });
    }


    // directs user to chat bot page
        public void OpenChat() {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        }

        // directs user to questionnaire
        public void OpenQuestion() {
            Intent intent = new Intent(this, GuidedActivity.class);
            startActivity(intent);
        }


    }

