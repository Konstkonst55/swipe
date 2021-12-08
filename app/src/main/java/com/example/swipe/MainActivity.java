package com.example.swipe;


import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rl = findViewById(R.id.main_layout);

        rl.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
            public void onSwipeTop() {
                Intent i = new Intent(MainActivity.this, screen2.class);
                startActivity(i);
            }
            public void onSwipeRight() {
                Intent i = new Intent(MainActivity.this, screen3.class);
                startActivity(i);
            }
            public void onSwipeLeft() {
                Intent i = new Intent(MainActivity.this, screen4.class);
                startActivity(i);
            }
            public void onSwipeBottom() {
                Intent i = new Intent(MainActivity.this, screen1.class);
                startActivity(i);
            }
        });
    }
}

