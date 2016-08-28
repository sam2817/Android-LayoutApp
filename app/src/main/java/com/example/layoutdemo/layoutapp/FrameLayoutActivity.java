package com.example.layoutdemo.layoutapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FrameLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
    }

    public void loadMainActivity(View view) {
        Intent i = new Intent(FrameLayoutActivity.this, MainActivity.class);
        startActivity(i);
    }

    public void createToast(String msg) {
        Toast t = Toast.makeText(FrameLayoutActivity.this, msg, Toast.LENGTH_SHORT);
        t.show();
    }

    public void displayToastTLF(View view) {
        createToast("You tapped-on Top Left Frame");
    }

    public void displayToastTCF(View view) {
        createToast("You tapped-on Top Center Frame");
    }

    public void displayToastTRF(View view) {
        createToast("You tapped-on Top Right Frame");
    }

    public void displayToastCLF(View view) {
        createToast("You tapped-on Center Left Frame");
    }

    public void displayToastCF(View view) {
        createToast("You tapped-on Center Frame");
    }

    public void displayToastCRF(View view) {
        createToast("You tapped-on Center Right Frame");
    }

    public void displayToastBLF(View view) {
        createToast("You tapped-on Bottom Left Frame");
    }

    public void displayToastBCF(View view) {
        createToast("You tapped-on Bottom Center Frame");
    }

    public void displayToastBRF(View view) {
        createToast("You tapped-on Bottom Right Frame");
    }
}
