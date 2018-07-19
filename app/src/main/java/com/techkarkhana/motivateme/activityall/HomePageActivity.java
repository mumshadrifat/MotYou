package com.techkarkhana.motivateme.activityall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.techkarkhana.motivateme.R;

public class HomePageActivity extends AppCompatActivity {
    Animation frombottom;
    TextView welcom_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        init();
    }

    private void init() {

        welcom_tv= findViewById(R.id.welcome_tv_id);
        frombottom= AnimationUtils.loadAnimation(this,R.anim.frombttom);
        welcom_tv.setAnimation(frombottom);
    }
}
