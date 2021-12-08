package com.example.swipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class screen2 extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        btn = findViewById(R.id.buttonMain);

        btn.setOnClickListener(v -> {
            Intent i = new Intent(screen2.this, MainActivity.class);
            startActivity(i);
        });
    }
}