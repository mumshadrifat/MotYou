package com.techkarkhana.motivateme.activityall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.techkarkhana.motivateme.R;

public class MazeTwoActivity extends AppCompatActivity {

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maze_two);

        next=findViewById(R.id.buttonID);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MazeTwoActivity.this,QuestionPageOneActivity.class);
                startActivity(intent);
            }
        });
    }
}
