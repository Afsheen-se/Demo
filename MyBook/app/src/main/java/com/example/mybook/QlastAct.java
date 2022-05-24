package com.example.mybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class QlastAct extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qlast);
        tv=findViewById(R.id.tv);
        if(getIntent() != null && getIntent().hasExtra("marks")) {
           int counter=getIntent().getIntExtra("marks" , 0);
           tv.setText("You have scored " + counter  +" out of 5");
        }
        }
    }
