package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.loginactivitybutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent neww = new Intent(MainActivity.this, LoginMPOS.class);
                startActivity(neww);
            }
        });
    }
}