package com.example.ecommapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignInPage extends AppCompatActivity {

    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_page);

        signIn = findViewById(R.id.signInBtn);
         signIn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(SignInPage.this, "User Added", Toast.LENGTH_SHORT).show();
                 Intent intent = new Intent(SignInPage.this,LoginPage.class);
                 startActivity(intent);
             }
         });

    }
}