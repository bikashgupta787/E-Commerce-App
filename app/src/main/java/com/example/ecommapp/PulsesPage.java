package com.example.ecommapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PulsesPage extends AppCompatActivity {

    ImageView home, cart,faq,profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulses_page);
        home = findViewById(R.id.homeBtn);
        cart = findViewById(R.id.cartBtn);
        faq = findViewById(R.id.faqBtn);
        profile = findViewById(R.id.profileBtn);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PulsesPage.this,MainActivity.class);
                startActivity(intent);
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PulsesPage.this,CartActivity.class);
                startActivity(intent);
            }
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PulsesPage.this,FaqActivity.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PulsesPage.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}