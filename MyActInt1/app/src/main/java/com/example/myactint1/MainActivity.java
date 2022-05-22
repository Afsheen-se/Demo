package com.example.myactint1;

import androidx.appcompat.app.AppCompatActivity ;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonOpenSecodActivity , buttonCallingIntent;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOpenSecodActivity = findViewById(R.id.btn1);
        buttonCallingIntent = findViewById(R.id.btn2);
        txt = findViewById(R.id.tv1);

        buttonOpenSecodActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        buttonCallingIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel: +923001234567");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });



    }



}




