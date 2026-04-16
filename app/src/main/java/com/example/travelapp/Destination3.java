package com.example.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Destination3 extends HomePage{


    ImageView nxtBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.destination3);

        nxtBtn = findViewById(R.id.nxtBtn);

        nxtBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Destination3.this, Fillup.class);
            startActivity(intent);
        });




}
}
