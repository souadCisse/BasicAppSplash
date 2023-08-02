package com.example.basicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button envoyerButton;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.installSplashScreen(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle(R.string.compte);

        envoyerButton = findViewById(R.id.envoyerButton);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        envoyerButton.setOnClickListener(view -> {
            envoyer();
        });
    }

    private void envoyer() {
        Intent intent = new Intent(this, StartActivity.class);
        intent.putExtra("user", username.getText().toString());
        intent.putExtra("password", password.getText().toString());

        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();

        showAppState("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        showAppState("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        showAppState("onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        showAppState("onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();

        showAppState("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showAppState("onDestroy");
    }

    void showAppState(String state) {
        Toast.makeText(this, state, Toast.LENGTH_SHORT).show();
    }
}