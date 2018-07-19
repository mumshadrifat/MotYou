package com.techkarkhana.motivateme.activityall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.techkarkhana.motivateme.R;

import java.util.Timer;
import java.util.TimerTask;

public class BreathWithMeActivity extends AppCompatActivity {

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breath_with_me);

        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent=new Intent(BreathWithMeActivity.this,MazeOneActivity.class);
                startActivity(intent);
                finish();

            }
        },5000);   //this activity will wait for 5 sec
    }
}
