package com.jtdev.rtsm;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class bldg_main2nd extends AppCompatActivity {
    ImageView room202;
    TextView room202_Status;

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bldg_main2ndfloor);

        room202 = findViewById(R.id.room202_Button);
        room202_Status = findViewById(R.id.room202_Status);
        Button Floor2_1 = findViewById(R.id.Floor1);
        Button Floor2_2 = findViewById(R.id.Floor2_3);

        room202_Status = findViewById(R.id.room202_Status);

        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR); // 12-hour format
        int minute = calendar.get(Calendar.MINUTE);
        int am_pm = calendar.get(Calendar.AM_PM);

        String amPm;
        if (am_pm == Calendar.AM) {
            amPm = "AM";
        } else {
            amPm = "PM";
        }

        String currentTime = (hour + ":" + minute + " " + amPm);

        room202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (compareTime(16, 18)) {
                    Toast.makeText(bldg_main2nd.this, "A class is ongoing in this room.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(bldg_main2nd.this, "This room is currently VACANT.", Toast.LENGTH_SHORT).show();
                }
                AlertDialog.Builder comlab3Message = new AlertDialog.Builder(bldg_main2nd.this);
                comlab3Message.setTitle("Room 202");
                StringBuilder room202_content = new StringBuilder();
                room202_content.append("Schedule                           SUBJECT\n");
                room202_content.append("12:00AM - 4:00PM          VACANT\n");
                room202_content.append("4:00PM - 6:00PM             FMP\n");
                room202_content.append("\nCurrent Time: ");
                room202_content.append(currentTime);
                comlab3Message.setMessage(room202_content);
                comlab3Message.show();

            }
        });

        Floor2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bldg_main2nd.this, bldg_main2.class);
                startActivity(intent);
            }
        });

        Floor2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bldg_main2nd.this, bldg_main3rd.class);
                startActivity(intent);
            }
        });

updateTime();
    }
public boolean compareTime(int time1, int time2) {
    Calendar calendar = Calendar.getInstance();
    int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour format

    return hour >= time1 && hour < time2;
}
void updateTime(){
    if (compareTime(12, 4)){
        room202_Status.setText("Available");
        room202_Status.setTextColor(Color.GREEN);
    }else{
        room202_Status.setText("Occupied");
        room202_Status.setTextColor(Color.RED);
        if (compareTime(18,24)){
            room202_Status.setText("Available");
            room202_Status.setTextColor(Color.GREEN);
        }else{
            room202_Status.setText("Occupied");
            room202_Status.setTextColor(Color.RED);
        }
    }
}
}