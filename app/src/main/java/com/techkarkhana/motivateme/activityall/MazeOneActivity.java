package com.techkarkhana.motivateme.activityall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.techkarkhana.motivateme.R;

public class MazeOneActivity extends AppCompatActivity {
    TextView questionTV;

    Button yes_button, maybe_button, donnotKnow_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maze_one);

        initializer();

        yes_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MazeOneActivity.this,MazeTwoActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initializer() {

        questionTV=findViewById(R.id.question_id);

        yes_button=findViewById(R.id.yes_button);
        maybe_button=findViewById(R.id.maybe_button);
        donnotKnow_button=findViewById(R.id.donnot_know_button);

    }

}
