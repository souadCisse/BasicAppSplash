package com.example.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    TextView user;
    TextView password;
    ImageView homeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        user = findViewById(R.id.username);
        password = findViewById(R.id.password);
        homeImage = findViewById(R.id.image_home);

        user.setText(getIntent().getStringExtra("user"));
        password.setText(getIntent().getStringExtra("password"));

        homeImage.setOnClickListener(view -> {
            finish();
        });
    }
}