package com.example.kimayadesai.quizapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button logIn, signUp;

    private class MyAction extends FragmentPagerAdapter {


        private String[] titles= new String[]{"First Fragment", "Second Fragment","Third Fragment"};

        public MyAction(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0:
                    return new Screen1Fragment();
                case 1:
                    return new Screen2Fragment();

                default:
                    return new Screen1Fragment();
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
        // This class can access everything from its parent...
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logIn = (Button) findViewById(R.id.logInButton);
        signUp = (Button) findViewById(R.id.signUpButton);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        PagerAdapter pagerAdapter = new MyAction(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(loginIntent);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUpIntent = new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(signUpIntent);
            }
        });


    }


}
