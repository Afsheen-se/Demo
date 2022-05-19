package com.example.activitylifecycle_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.tech.TagTechnology;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "it's main activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, ":::this is  onCreate:::");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,":::THIS IS onStart:::");
    }
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,":::THIS IS onRestart:::");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,":::THIS IS onDestroy:::");
    }
    protected void onPause() {
        super. onPause();
        Log.d(TAG,":::THIS IS  onPause:::");
    }
    protected void onResume() {
        super.onResume();
        Log.d(TAG,":::THIS IS onResume:::");
    }
    protected void onStop() {
        super.onStop();
        Log.d(TAG,":::THIS IS onStop:::");
    }
}