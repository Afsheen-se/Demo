package com.example.alc_p2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecActivity extends AppCompatActivity {
    private static final String TAG = "It is second acvtivity";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //xml_binding
        setContentView(R.layout.activity_sec);
        Log.d(TAG,":::this is onCreate of SecActivity:::");

        TextView t = findViewById(R.id.tv2);
        if(getIntent() != null && getIntent().hasExtra("counter") ) {
        int counter2 = getIntent().getIntExtra("counter" , 0);
        t.setText("I am activity2 with counter" +counter2);

        }

    }
}