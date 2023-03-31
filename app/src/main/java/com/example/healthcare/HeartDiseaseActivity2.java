package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeartDiseaseActivity2 extends AppCompatActivity {
    private Button btnbacks;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_disease2);

        btnbacks = findViewById(R.id.buttonbacks);

        btnbacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HeartDiseaseActivity2.this, FindADoctorActivity2.class));
            }
        });
    }
}