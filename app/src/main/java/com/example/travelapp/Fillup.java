package com.example.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Fillup extends Destination1{

    EditText number, name, email;
    TextView  total, num;

    ImageView nxtBtn;

    Button add, min;

    String NAME = "";
    String NUM = "";
    String EMAIL = "";
    String summary ="";

    int numCount = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fillup);

        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        num = findViewById(R.id.num);
        email = findViewById(R.id.email);
        total = findViewById(R.id.price);
        add = findViewById(R.id.add);
        min = findViewById(R.id.minus);
        nxtBtn = findViewById(R.id.nxtBtn);


        nxtBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Fillup.this, Sum.class);
            intent.putExtra("SUMMARY", summary);
            startActivity(intent);
        });

        add.setOnClickListener(view -> {
            numCount++;
            num.setText("" + numCount);

            total.setText("PRICE: $" + 500 * numCount);
        });

        min.setOnClickListener(view -> {
            if (numCount < 1){
                num.setText("1");
            } else if (numCount > 1){
                numCount--;
                num.setText("" + numCount);

                total.setText("PRICE: $" + 500 * numCount);
            }

        });


        NAME = name.getText().toString();
        NUM = number.getText().toString();
        EMAIL = email.getText().toString();

        summary = "NAME: " + NAME  + "\n" + "NUMBER: " + NUM + "\n" + "EMAIL: " + EMAIL + "\n";




    }
}
