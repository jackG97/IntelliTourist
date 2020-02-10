package com.example.intellitourist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static int SPLASH_TIME = 4000;
    private ImageView Logo;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logo = (ImageView) findViewById(R.id.logoIT);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        Logo.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent HomeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(HomeIntent);

                finish();

            }
        }, SPLASH_TIME);
    }
}
