package com.shubham.adypuuser;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.github.chrisbanes.photoview.PhotoView;
import com.squareup.picasso.Picasso;

import androidx.appcompat.app.AppCompatActivity;

public class Content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        getIncomingIntent();

    }

    private void getIncomingIntent(){


        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("location_name")){


            String imageUrl = getIntent().getStringExtra("image_url");

            String locationName = getIntent().getStringExtra("location_name");
            Toast.makeText(Content.this, locationName , Toast.LENGTH_SHORT).show();

            setImage(imageUrl, locationName);
        }
    }

    private void setImage(String imageUrl, String imageName){


        TextView name = findViewById(R.id.locationname);
        name.setText(imageName);

        PhotoView image = findViewById(R.id.imageLoaded);
        Picasso.get()
                .load(imageUrl)
                 .placeholder(R.mipmap.ic_launcher)
                .fit()
                .centerCrop()
                .into(image);


    }
}
