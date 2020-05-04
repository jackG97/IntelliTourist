package com.example.intellitourist;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {


    //variables

    private Button Login;
    private Button RegisterHere;
    private EditText Email;
    private EditText Name;
    private EditText Password;
    Boolean ValidateEmail = false;
    Boolean ValidatePassword = false;
    Boolean ValidateName1 = false;
    String name;
    String email;
    String password;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    MediaPlayer mp = null;
    private FirebaseAuth mfirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mfirebaseAuth = FirebaseAuth.getInstance();

        //find id method for variables and items
        RegisterHere = (Button) findViewById(R.id.button2);
        Login = (Button) findViewById(R.id.Login);
        Name = (EditText) findViewById(R.id.NameTF);
        Email = (EditText) findViewById(R.id.EmailTF);
        Password = (EditText) findViewById(R.id.PasswordTF);

        // This method checks if the user still logged, if so they will be automatically signed back to the app with out having to enter in their login details.
        // if they are not automatically logged in they must enter in their details.
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    Toast.makeText(LoginActivity.this, "User logged in ", Toast.LENGTH_SHORT).show();
                    Intent I = new Intent(LoginActivity.this, OptionsActivity.class);
                    startActivity(I);
                } else {
                    Toast.makeText(LoginActivity.this, "Login to continue", Toast.LENGTH_SHORT).show();
                }
            }
        };

        // button to direct user
        RegisterHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        // login button checks for conditions before logging user in
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // gets text from text boxes and reads it
                String email = Email.getText().toString();
                String password = Password.getText().toString();
                String name = Name.getText().toString();
                // if any of the text boxes are empty it will not log the user in.
                if (email.isEmpty() && password.isEmpty() && name.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Fields Empty!", Toast.LENGTH_SHORT).show();
                }
                else if (name.isEmpty()) {
                    Name.setError("Please Provide User-Name!");
                    Name.requestFocus();
                }else if (email.isEmpty()) {
                    Email.setError("Enter Email!");
                    Email.requestFocus();
                } else if (password.isEmpty()) {
                    Password.setError("Enter Password!");
                    Password.requestFocus();
                    // if the text boxes are not empty (have text) they will be will be logged in.
                }  else if (!(email.isEmpty() && password.isEmpty() && name.isEmpty())) {
                    //firebase method used to log the user in with email and password. It will recognise the account if the user has one
                    mfirebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(LoginActivity.this, new OnCompleteListener() {
                        @Override
                        public void onComplete(@NonNull Task task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(LoginActivity.this, "Not successful", Toast.LENGTH_SHORT).show();
                            } else {
                                startActivity(new Intent(LoginActivity.this, OptionsActivity.class));
                            }
                        }
                    });
                } else {
                    Toast.makeText(LoginActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        if (mp != null) {//this plays a beep noise when the users clicks the login button
            mp.reset();
            mp.release();
        }
        mp = MediaPlayer.create(getApplicationContext(), R.raw.ring1);
        mp.start();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mfirebaseAuth.addAuthStateListener(mAuthStateListener);
    }

    public void onButtonClick(View view) {
    }
}

