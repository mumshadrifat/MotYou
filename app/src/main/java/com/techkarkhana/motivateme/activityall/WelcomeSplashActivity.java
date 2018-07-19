package com.techkarkhana.motivateme.activityall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.techkarkhana.motivateme.R;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomeSplashActivity extends AppCompatActivity {

    Timer timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_splash);

        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent=new Intent(WelcomeSplashActivity.this,welcomeActivity2.class);
                startActivity(intent);
                finish();

            }
        },3000);   //this activity will wait for 5 sec
    }
}
