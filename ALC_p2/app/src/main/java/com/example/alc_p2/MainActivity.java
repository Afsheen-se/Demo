package com.example.alc_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "It is main activity";
    Button mButtonView , mButtonCntr;
    TextView mTextView;
    private int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, ":::this is onCreate of MainActivity:::");
        mButtonView = findViewById(R.id.bt1);
        mButtonCntr = findViewById(R.id.btn2);
        mTextView = findViewById(R.id.t1);

        mButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecActivity.class);
                startActivity(i);
            }
        });

        mButtonCntr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++counter;
                mTextView.setText("Total " + counter);
            }
        });

        if(savedInstanceState!=null) {
         String count = savedInstanceState.getString("count");
         if(mTextView!=null) {
             mTextView.setText(count);
         }
        }
    }
        public void onSaveInstanceState(Bundle outState)
        {
            super.onSaveInstanceState(outState);
            outState.putString("count", String.valueOf(mTextView.getText()));
        }



    }

