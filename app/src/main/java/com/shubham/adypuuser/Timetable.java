package com.shubham.adypuuser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Timetable extends AppCompatActivity {

    private Button RegTimetable;
    private Button ExamTimetable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        RegTimetable = findViewById(R.id.RegTimetable);
        ExamTimetable = findViewById(R.id.ExamTimetable);


        RegTimetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/Regular_TimeTable" ;

                Intent intent = new Intent(Timetable.this, ImagesActivity.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });

        ExamTimetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/Exam_TimeTable" ;

                Intent intent = new Intent(Timetable.this, ImagesActivity.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });
    }
}
