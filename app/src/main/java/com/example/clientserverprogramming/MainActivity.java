package com.example.clientserverprogramming;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnClient = findViewById(R.id.btnClient);
        Button btnServer = findViewById(R.id.btnServer);
        btnClient.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ClientActivity.class)));
        btnServer.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ServerActivity.class)));

    }
}