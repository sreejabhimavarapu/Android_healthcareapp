package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DiarrheaActivity2 extends AppCompatActivity {
    private Button btnbackd;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diarrhea2);

        btnbackd= findViewById(R.id.buttonbackd);
        btnbackd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DiarrheaActivity2.this, FindADoctorActivity2.class));
            }
        });
    }
}