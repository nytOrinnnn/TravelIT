package com.example.travelapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Sum extends Fillup{

    TextView sum;

    ImageView nxtBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);

        nxtBtn = findViewById(R.id.nxtBtn);
        sum = findViewById(R.id.description);

        nxtBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Sum.this, HomePage.class);
            startActivity(intent);
        });



        Intent intent = getIntent();
        String sumContent = intent.getStringExtra("SUMMARY");

        sum.setText("Thank you for booking \n " + sumContent);


    }
}
