package com.example.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class HomePage extends MainActivity {

    ImageView destination1, destination2, destination3, destination4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        destination1 = findViewById(R.id.destination1);
        destination2 = findViewById(R.id.destination2);
        destination3 = findViewById(R.id.destination3);
        destination4 = findViewById(R.id.destination4);

        destination1.setOnClickListener(view -> {
        Intent intent = new Intent(HomePage.this, Destination1.class);
        startActivity(intent);
    });

        destination2.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Destination2.class);
            startActivity(intent);
        });

        destination3.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Destination3.class);
            startActivity(intent);
        });

        destination4.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Destination4.class);
            startActivity(intent);
        });


    }
}