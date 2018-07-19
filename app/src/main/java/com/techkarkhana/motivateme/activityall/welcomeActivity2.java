package com.techkarkhana.motivateme.activityall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.techkarkhana.motivateme.R;

public class welcomeActivity2 extends AppCompatActivity {

    Button sign_in_button, sign_up_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_2);

        initializer();

        //sign_in button are working here
        sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signIn=new Intent(welcomeActivity2.this,SignInActivity.class);
                startActivity(signIn);

            }
        });


        //sign_up Button s code are started here

        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    //initializer all method
    private void initializer() {

        sign_in_button=findViewById(R.id.sign_in_button);
        sign_up_button=findViewById(R.id.sign_up_button);
    }
}
