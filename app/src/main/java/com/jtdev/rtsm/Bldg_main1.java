package com.jtdev.rtsm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bldg_main1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bldg_main1);

        Button Floor2_1 = findViewById(R.id.Floor2_1);
        Button Floor2_2 = findViewById(R.id.Floor2_2);
        Floor2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bldg_main1.this, bldg_main2.class);
                startActivity(intent);
            }
        });

        Floor2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bldg_main1.this, bldg_main2.class);
                startActivity(intent);
            }
        });



    }
}