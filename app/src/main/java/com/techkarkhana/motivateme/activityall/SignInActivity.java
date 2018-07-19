package com.techkarkhana.motivateme.activityall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.techkarkhana.motivateme.R;

public class SignInActivity extends AppCompatActivity {

    TextView createAccount, forgotAccount;
    EditText userEmailEditText, userPassEditText;
    Button sign_in_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        initializer();

        sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signIn=new Intent(SignInActivity.this,BreathWithMeActivity.class);
                startActivity(signIn);
            }
        });

    }

    private void initializer() {
        createAccount=findViewById(R.id.create_account_id);
        forgotAccount=findViewById(R.id.forgot_account_id);

        userEmailEditText=findViewById(R.id.user_email_id);
        userPassEditText=findViewById(R.id.user_password_id);

        sign_in_button=findViewById(R.id.sign_in_button);
    }
}
