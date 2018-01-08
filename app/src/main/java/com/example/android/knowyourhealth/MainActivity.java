package com.example.android.knowyourhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //called when the user taps the login button
    public void logInMethod(View view) {
        Intent intent = new Intent(MainActivity.this, logInActivity.class);
        startActivity(intent);


    }

    //called when the user taps the signUp button
    public void SignUpMethod(View view) {
        Intent intent = new Intent(MainActivity.this, signUpActivity.class);
        startActivity(intent);
    }

    //called when the user taps the MainLogin button
    public void MainLogInMethod(View view) {
        Intent intent = new Intent(MainActivity.this, welcomeActivity.class);
        startActivity(intent);


    }

    public void QuestionsMethod(View view) {
        Intent intent = new Intent(MainActivity.this, QuestionsActivity.class);
        startActivity(intent);
    }
}


