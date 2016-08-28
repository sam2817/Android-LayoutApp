package com.example.layoutdemo.layoutapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TableRowLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_row_layout);
    }

    public void loadMainActivity(View view) {
        Intent i = new Intent(TableRowLayoutActivity.this, MainActivity.class);
        startActivity(i);
    }
}
