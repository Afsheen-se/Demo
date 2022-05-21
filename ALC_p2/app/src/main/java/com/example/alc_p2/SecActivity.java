package com.example.alc_p2;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SecActivity extends AppCompatActivity {
    private static final String TAG = "It is second acvtivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //xml_binding
        setContentView(R.layout.activity_sec);
        Log.d(TAG,":::this is onCreate of SecActivity:::");
    }
}