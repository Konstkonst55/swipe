package com.example.swipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screen1 extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        btn = findViewById(R.id.buttonMain);

        btn.setOnClickListener(v -> {
            Intent i = new Intent(screen1.this, MainActivity.class);
            startActivity(i);
        });
    }


}