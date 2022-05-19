package com.example.alc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "It's activity one";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,":::It's onCreate():::");
        setContentView(R.layout.activity_main);
    }
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG,":::It's onStart():::");

    }
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG,":::It's onRestart():::");

    }
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG,":::It's onResume():::");

    }
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG,":::It's onPause():::");

    }
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG,":::It's onStop():::");

    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG,":::It's onDestroy():::");

    }
}