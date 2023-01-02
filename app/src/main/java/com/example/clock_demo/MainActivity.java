package com.example.clock_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;

public class MainActivity extends AppCompatActivity {
    AnalogClock a;
    DigitalClock d;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(AnalogClock) findViewById(R.id.ac);
        d=(DigitalClock) findViewById(R.id.dc);
        b=(Button) findViewById(R.id.b1);
        show();
    }

    private void show() {
        d.setVisibility(View.INVISIBLE);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setVisibility(View.INVISIBLE);
                d.setVisibility(View.VISIBLE);
                b.setText("show analog");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        a.setVisibility(View.VISIBLE);
                        b.setText("show digital");
                        show();
                    }
                });
            }
        });
    }
}