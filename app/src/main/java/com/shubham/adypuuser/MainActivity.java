package com.shubham.adypuuser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {


    private CardView college_docs;
    private CardView job_notices;
    private CardView important_notices;
    private CardView fees;
    private CardView timetable;
    private CardView logout;
    private ImageView profilePic;
    private TextView headertext;

    GoogleSignInClient mGoogleSignInClient;
    FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        college_docs = findViewById(R.id.college_docs);
        job_notices = findViewById(R.id.job);
        important_notices = findViewById(R.id.important_notices);
        fees = findViewById(R.id.fees);
        timetable = findViewById(R.id.timetable);
        logout = findViewById(R.id.logout_card);
        profilePic = findViewById(R.id.profilePic);
        headertext = findViewById(R.id.header_text);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

       // loadUserInformation();



        college_docs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = "college_docs";
                Intent intent = new Intent(MainActivity.this, Classes.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });


        job_notices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = "job_notices";
                Intent intent = new Intent(MainActivity.this, ImagesActivity.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });

        important_notices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = "important_notices";
                Intent intent = new Intent(MainActivity.this, ImagesActivity.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });

        fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = "fees";
                Intent intent = new Intent(MainActivity.this, ImagesActivity.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });
        timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = "timetable";
                Intent intent = new Intent(MainActivity.this, Timetable.class );
                intent.putExtra("category", category);
                startActivity(intent);


            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.Logout();
            }
        });







    }

//    private void loadUserInformation() {
//
//
//
//        FirebaseUser user = mAuth.getCurrentUser();
//
//        String profilepicUrl = user.getPhotoUrl().toString();
//        String userName = user.getDisplayName();
//
//        if (user.getPhotoUrl() != null) {
//            Glide.with(this)
//                    .load(user.getPhotoUrl().toString())
//                    .into(profilePic);
//        }
//        if (user.getDisplayName() !=null) {
//
//
//            headertext.setText(user.getDisplayName());
//        }
//
//
//    }

    private void Logout() {
        FirebaseAuth.getInstance().signOut();
        mGoogleSignInClient.signOut().addOnCompleteListener(this,
                new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        LaunchLoginActivity();
                        Toast.makeText(MainActivity.this, "Logout Successful",
                                Toast.LENGTH_SHORT).show();

                        //LoginActivity.this.updateUI(null);
                    }
                });
    }

    private void LaunchLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();

    }


}

