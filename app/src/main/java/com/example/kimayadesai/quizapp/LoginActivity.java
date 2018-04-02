package com.example.kimayadesai.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button facebookButton, emailButton, googleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        facebookButton = (Button)findViewById(R.id.facebookButton);
        emailButton = (Button)findViewById(R.id.emailButton);
        googleButton = (Button)findViewById(R.id.googleButton);


        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this,LoginEmailActivity.class);
                startActivity(loginIntent);
            }
        });


    }
}
