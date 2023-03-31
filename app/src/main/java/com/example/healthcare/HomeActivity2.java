package com.example.healthcare;

import static com.example.healthcare.R.id.cardHealthArticles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        CardView PATIENTDETAILS = findViewById(R.id.cardPATIENTDETAILS);
        PATIENTDETAILS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this, PATIENTDETAILSActivity2.class));
            }
        });
        CardView FindADoctor = findViewById(R.id.cardFINDDOCTOR);
        FindADoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this, FindADoctorActivity2.class));
            }
        });

        CardView HealthArticles = findViewById(R.id.cardHEALTHARTICLES);
        HealthArticles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this, healtharticlesActivity2.class));
            }
        });

        CardView exit = findViewById(R.id.cardEXIT);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity2.this, LoginActivity2.class));
            }
        });
    }
}

