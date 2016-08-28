package com.example.layoutdemo.layoutapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadFrameLayoutActivity(View view) {
        Intent i = new Intent(MainActivity.this, FrameLayoutActivity.class);
        startActivity(i);
    }

    public void loadLinearHorizontalLayoutActivity(View view) {
        Intent i = new Intent(MainActivity.this, LinearHorizontalLayoutActivity.class);
        startActivity(i);
    }

    public void loadLinearVerticalLayoutActivity(View view) {
        Intent i = new Intent(MainActivity.this, LinearVerticalLayoutActivity.class);
        startActivity(i);
    }

    public void loadTableLayoutActivity(View view) {
        Intent i = new Intent(MainActivity.this, TableLayoutActivity.class);
        startActivity(i);
    }

    public void loadTableRowLayoutActivity(View view) {
        Intent i = new Intent(MainActivity.this, TableRowLayoutActivity.class);
        startActivity(i);
    }

    public void loadGridLayoutActivity(View view) {
        Intent i = new Intent(MainActivity.this, GridLayoutActivity.class);
        startActivity(i);
    }

    public void loadRelativeLayoutActivity(View view) {
        Intent i = new Intent(MainActivity.this, RelativeLayoutActivity.class);
        startActivity(i);
    }
}
