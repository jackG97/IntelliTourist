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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {

    //varibles

    private Button Register;
    private EditText Email1;
    private EditText Name1;
    private EditText Password1;
    private Boolean ValidateName = false;
    private Boolean ValidateEmail1= false;
    private Boolean ValidatePassword1 = false;
    public String tempEmail;
    public String tempPass;
    String email1;
    String name1;
    String password1;
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
                validate(view);
            }
        });
    }
    public void validate(View view) {
        EditText checkPassword = (EditText) findViewById(R.id.PasswordTF);
        //takes the input and stores it to the variable.
        tempPass = checkPassword.getText().toString();
        EditText checkEmail = (EditText) findViewById(R.id.EmailAddressTF);
        //takes the input and stores it to the variable.
        tempEmail = checkEmail.getText().toString();

        //loads in the pattern used to validate the email
        Pattern patternEmail = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        //compares the email input to the validation pattern
        Matcher matcherEmail = patternEmail.matcher(tempEmail);

        //loads in the pattern used to validate the password
        Pattern patternPassword = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$");
        //compares the password input to the validation pattern
        Matcher matcherPassword = patternPassword.matcher(tempPass);

        // if the input matches returns a variable as true, else it returns it as false
        if (matcherPassword.matches() == true) {
            ValidatePassword1 = true;
        } else {
            ValidatePassword1 = false;
            checkPassword.setError(checkPassword.getHint() +" "+ getResources().getString(R.string.invalid));
        }

        // if the input matches returns a variable as true, else it returns it as false
        if (matcherEmail.matches() == true) {
            ValidateEmail1 = true;
        } else {
            ValidateEmail1 = false;
            checkEmail.setError(checkEmail.getHint() +" "+ getResources().getString(R.string.invalid));
        }
        //if both the email and password are valid then do this code
        if (ValidatePassword1 == true && ValidateEmail1 == true) {
//takes the temp password and temp email and stores them as password and email
            password1 = tempPass;
            email1 = tempEmail;
            //this code takes the email and the password and uses them to create the account
            mfirebaseAuth.createUserWithEmailAndPassword(email1, password1)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        //@Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            //if the account is created successfully then do this
                            if (task.isSuccessful()) {
                                Toast.makeText(getApplicationContext(), getResources().getString(R.string.toast_reg_success), Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                                //else do this
                            } else {
                                Toast.makeText(getApplicationContext(), getResources().getString(R.string.toast_reg_failed), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
    }
}