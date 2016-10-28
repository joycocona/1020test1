package com.example.androidstudioprojects.a1020test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class a3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);
    }
    public void onaClick (View view) {
        Intent intent = new Intent(a3.this,a1.class);
        startActivity(intent);
    }
}
