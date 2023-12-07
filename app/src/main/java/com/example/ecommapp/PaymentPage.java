package com.example.ecommapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentPage extends AppCompatActivity {

    Button upi, cod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_page);

        upi = findViewById(R.id.upi);
        cod = findViewById(R.id.cod);

        upi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentPage.this,LoadingScreen.class);
                startActivity(intent);
            }
        });

        cod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentPage.this,LoadingScreen.class);
                startActivity(intent);
            }
        });
    }
}