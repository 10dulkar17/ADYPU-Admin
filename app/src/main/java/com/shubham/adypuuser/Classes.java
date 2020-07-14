package com.shubham.adypuuser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Classes extends AppCompatActivity {


    private Button Btech;
    private Button Bca;
    private Button Bcom;
    private TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);

        Btech = findViewById(R.id.btech);
        Bca = findViewById(R.id.bca);
        Bcom = findViewById(R.id.bcom);
        //test = findViewById(R.id.testing);

        Btech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/Btech" ;
              //  test.setText(category);
                Intent intent = new Intent(Classes.this, Course.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });

        Bca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/BCA" ;
               // test.setText(category);
                Intent intent = new Intent(Classes.this, Course.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });
        Bcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = getIntent().getStringExtra("category") + "/Bcom" ;
          //      test.setText(category);
                Intent intent = new Intent(Classes.this, ImageUploading.class );
                intent.putExtra("category", category); 
                startActivity(intent);


            }
        });



    }
}
