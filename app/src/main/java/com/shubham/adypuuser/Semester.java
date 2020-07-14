package com.shubham.adypuuser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Semester extends AppCompatActivity {

    private Button SEM_1;
    private Button SEM_2;
    private Button SEM_3;
    private Button SEM_4;
    private Button SEM_5;
    private Button SEM_6;
    private Button SEM_7;
    private Button SEM_8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);

        SEM_1 = findViewById(R.id.sem_1);
        SEM_2 = findViewById(R.id.sem_2);
        SEM_3 = findViewById(R.id.sem_3);
        SEM_4 = findViewById(R.id.sem_4);
        SEM_5 = findViewById(R.id.sem_5);
        SEM_6 = findViewById(R.id.sem_6);
        SEM_7 = findViewById(R.id.sem_7);
        SEM_8 = findViewById(R.id.sem_8);




        SEM_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/SEM-1" ;

                Intent intent = new Intent(Semester.this, ImagesActivity.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });

        SEM_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/SEM-2" ;

                Intent intent = new Intent(Semester.this, ImagesActivity.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });
        SEM_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/SEM-3" ;

                Intent intent = new Intent(Semester.this, ImagesActivity.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });
        SEM_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/SEM-4" ;

                Intent intent = new Intent(Semester.this, ImagesActivity.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });
        SEM_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/SEM-5" ;

                Intent intent = new Intent(Semester.this, ImagesActivity.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });
        SEM_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/SEM-6" ;

                Intent intent = new Intent(Semester.this, ImagesActivity.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });
        SEM_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/SEM-7" ;

                Intent intent = new Intent(Semester.this, ImagesActivity.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });
        SEM_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/SEM-8" ;

                Intent intent = new Intent(Semester.this, ImagesActivity.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });

    }
}
