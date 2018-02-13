package com.example.harrywang.dijkstrapathfinder;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * The welcome screen that has both a login and register button leading to the respective activities
 */

public class WelcomeScreen extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
    }

    /**
     * Sends user to login screen if login button is tapped.
     */
    public void goToLogin(View view) {
        Intent intent = new Intent(this, LoginScreen.class);
        startActivity(intent);
    }
}
