package com.shubham.adypuuser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Course extends AppCompatActivity {

    private Button MACT;
    private Button CTIS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        MACT = findViewById(R.id.MACT);
        CTIS = findViewById(R.id.CTIS);


        MACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/MACT" ;

                Intent intent = new Intent(Course.this, Semester.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });

        CTIS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/CTIS" ;

                Intent intent = new Intent(Course.this, Semester.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });
    }
}
