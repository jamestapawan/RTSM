package com.jtdev.rtsm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bldg_main3rd extends AppCompatActivity {

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bldg_main3rd);

        Button Floor4 = findViewById(R.id.Floor4);
        Button Floor3_2 = findViewById(R.id.Floor3_2);
        Floor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bldg_main3rd.this, bldg_main4th.class);
                startActivity(intent);
            }
        });

        Floor3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bldg_main3rd.this, bldg_main2nd.class);
                startActivity(intent);
            }
        });
    }}
