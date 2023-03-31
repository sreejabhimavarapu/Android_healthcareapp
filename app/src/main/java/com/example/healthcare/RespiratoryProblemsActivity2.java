package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RespiratoryProblemsActivity2 extends AppCompatActivity {
    private Button btnEnter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respiratory_problems2);

            btnEnter = findViewById(R.id.buttonBACK);
            btnEnter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(RespiratoryProblemsActivity2.this, FindADoctorActivity2.class));
                }
            });
    }
}