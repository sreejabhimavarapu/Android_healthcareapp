package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PATIENTDETAILSActivity2 extends AppCompatActivity {
    EditText ed1, ed2, ed3, ed4;
    TextView tv;
    private Button btnEnter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientdetailsactivity2);

        tv = findViewById(R.id.textViewtitle);
        ed1 = findViewById(R.id.editTextFullName);
        ed2 = findViewById(R.id.editTextAddress);
        ed3 = findViewById(R.id.editTextContactNumber);
        ed4 = findViewById(R.id.editTextAge);
        btnEnter = findViewById(R.id.buttonEnter);

        Intent it = getIntent();
        String title = it.getStringExtra("text1");
        String fullname = it.getStringExtra("text2");
        String address = it.getStringExtra("text3");
        String contact = it.getStringExtra("text4");
        String age = it.getStringExtra("text5");


        tv.setText(title);
        ed1.setText(fullname);
        ed2.setText(address);
        ed2.setText(contact);
        ed2.setText(age);

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PATIENTDETAILSActivity2.this, HomeActivity2.class));
            }
        });
    }
}
