package com.jtdev.rtsm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bldg_main4th extends AppCompatActivity {

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bldg_main4th);

        Button Floor3 = findViewById(R.id.Floor3_2);
        Floor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bldg_main4th.this, bldg_main3rd.class);
                startActivity(intent);
            }
        });
    }}
