package com.example.androidstudioprojects.a1020test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.VectorEnabledTintResources;
import android.view.View;

public class a1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
    }
    public void ona2Click (View view) {
        Intent intent = new Intent(a1.this,a2.class);
        startActivity(intent);
    }
    public void ona3Click (View view) {
        Intent intent = new Intent(a1.this,a3.class);
        startActivity(intent);
    }
}
