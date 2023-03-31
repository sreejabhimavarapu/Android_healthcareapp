package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FindADoctorActivity2 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_adoctor2);


        CardView Covid = findViewById(R.id.cardCOVID);
        Covid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindADoctorActivity2.this, CovidActivity2.class));
            }
        });


        CardView Dermatology = findViewById(R.id.cardDermatology);
        Dermatology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindADoctorActivity2.this, DiarrheaActivity2.class));
            }
        });

        CardView Diabetology = findViewById(R.id.cardDiabetology);
        Diabetology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindADoctorActivity2.this, DiabetesActivity2.class));
            }
        });


        CardView Cardiology = findViewById(R.id.cardCardiology);
        Cardiology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindADoctorActivity2.this, HeartDiseaseActivity2.class));
            }
        });

        CardView Nephralogy = findViewById(R.id.cardNephralogy);
        Nephralogy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindADoctorActivity2.this, BloodPressureActivity2.class));
            }
        });

        CardView ENT = findViewById(R.id.cardENT);
        ENT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindADoctorActivity2.this, RespiratoryProblemsActivity2.class));
            }
        });
        CardView LOGOUT = findViewById(R.id.cardlogout);
        LOGOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindADoctorActivity2.this, HomeActivity2.class));
            }
        });

    }
}