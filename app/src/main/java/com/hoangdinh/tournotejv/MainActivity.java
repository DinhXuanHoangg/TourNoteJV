package com.hoangdinh.tournotejv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final  String TAG = "TourNote_MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, " This Is Error Log");
        Log.w(TAG, " This Is Warning Log");
        Log.i(TAG, " This Is Information Log");
        Log.d(TAG, " This Is Debug Log");
        Log.v(TAG," This Is Verbose Log");

//        throw  new RuntimeException("This Is Crash");
    }
}