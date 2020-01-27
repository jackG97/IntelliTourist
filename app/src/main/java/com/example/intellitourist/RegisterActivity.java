package com.example.intellitourist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.intellitourist.OptionsActivity;
import com.example.intellitourist.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class RegisterActivity extends AppCompatActivity {

    //varibles

    private Button Register;
    private EditText Email1;
    private EditText Name1;
    private EditText Password1;
    private Boolean ValidateName = false;
    private Boolean ValidateEmail1= false;
    private Boolean ValidatePassword1 = false;
    String email1;
    String name1;
    String password1;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    MediaPlayer mp = null;
    FirebaseAuth mfirebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //find id method for variables and items
        Register = (Button) findViewById(R.id.regBtn);
        Name1 = (EditText) findViewById(R.id.UserNameTF);
        Email1 = (EditText) findViewById(R.id.EmailAddressTF);
        Password1 = (EditText) findViewById(R.id.PasswordTF);
        mfirebaseAuth = FirebaseAuth.getInstance();

        //on click function which is triggered by the press of the register button
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email1 = Email1.getText().toString();
                String password1 = Password1.getText().toString();
                String name1 = Name1.getText().toString();
                if (name1.isEmpty()) {
                    Name1.setError("Please Provide User-Name!");
                    Name1.requestFocus();
                }else if (email1.isEmpty()) {
                    Email1.setError("Set Your Email!");
                    Email1.requestFocus();
                } else if (password1.isEmpty()) {
                    Password1.setError("Set your password");
                    Password1.requestFocus();
                } else if (email1.isEmpty() && password1.isEmpty() && name1.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Fields Empty!", Toast.LENGTH_SHORT).show();
                } else if (!(email1.isEmpty() && password1.isEmpty() && name1.isEmpty())) {
                    mfirebaseAuth.createUserWithEmailAndPassword(email1, password1).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener() {
                        @Override
                        public void onComplete(@NonNull Task task) {

                            if (!task.isSuccessful()) {
                                Toast.makeText(RegisterActivity.this.getApplicationContext(),
                                        "SignUp unsuccessful: " + task.getException().getMessage(),
                                        Toast.LENGTH_SHORT).show();
                            } else {
                                startActivity(new Intent(RegisterActivity.this, OptionsActivity.class));
                            }
                        }
                    });
                } else {
                    Toast.makeText(RegisterActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        if (mp!=null){//this plays a beep noise when the users clicks the register button
            mp.reset();
            mp.release();
        }
        mp = MediaPlayer.create(getApplicationContext(),R.raw.ring1);
        mp.start();

    }

}








