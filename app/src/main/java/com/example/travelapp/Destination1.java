package com.example.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Destination1 extends HomePage{


    ImageView nxtBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.destination1);

        nxtBtn = findViewById(R.id.nxtBtn);

        nxtBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Destination1.this, Fillup.class);
            startActivity(intent);
        });




}
}
