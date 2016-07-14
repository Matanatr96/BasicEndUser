package com.example.anush.basicenduser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v) {
        //verify login
        if (true) {
            Intent in = new Intent(this, MainActivity.class);
            startActivity(in);
        }
    }
}
