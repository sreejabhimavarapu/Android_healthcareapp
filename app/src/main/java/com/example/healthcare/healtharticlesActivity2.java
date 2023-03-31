package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class healtharticlesActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healtharticles2);

        CardView Dermatology = findViewById(R.id.cardDermatology);
        Dermatology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(healtharticlesActivity2.this, dermatologyarticleActivity2.class));
            }
        });
        CardView Covid = findViewById(R.id.cardCOVID);
        Covid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(healtharticlesActivity2.this, covidarticleActivity2.class));
            }
        });
        CardView Diabetes= findViewById(R.id.cardDiabetology);
        Diabetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(healtharticlesActivity2.this, diabetesarticleActivity2.class));
            }
        });
        CardView Cardiology = findViewById(R.id.cardCardiology);
        Cardiology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(healtharticlesActivity2.this, CardiologyarticleActivity2.class));
            }
        });
        CardView Nephralogy = findViewById(R.id.cardNephralogy);
        Nephralogy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(healtharticlesActivity2.this, nephralogyarticleActivity2.class));
            }
        });
        CardView Ent = findViewById(R.id.cardENT);
        Ent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(healtharticlesActivity2.this, entarticleActivity2.class));
            }
        });

        CardView LOGOUT = findViewById(R.id.cardback);
        LOGOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(healtharticlesActivity2.this, HomeActivity2.class));
            }
        });



    }
}