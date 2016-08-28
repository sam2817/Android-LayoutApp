package com.example.layoutdemo.layoutapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LinearVerticalLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_vertical_layout);
    }

    public void loadMainActivity(View view) {
        Intent i = new Intent(LinearVerticalLayoutActivity.this, MainActivity.class);
        startActivity(i);
    }
}
