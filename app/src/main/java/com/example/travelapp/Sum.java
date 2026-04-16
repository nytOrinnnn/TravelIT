package com.example.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Sum extends Fillup{

    TextView sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);

        sum = findViewById(R.id.description);

        Intent intent = getIntent();
        String sumContent = intent.getStringExtra("SUMMARY");

        sum.setText("Thank you for booking \n " + sumContent);
    }
}
