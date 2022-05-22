package com.example.myactint2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btnweb ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btnweb = findViewById(R.id.btn1);
        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openWebPage("https://online.pucit.edu.pk");
            }
        });
    }
    public void openWebPage(String url)
    {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW , uri);
        startActivity(intent);
    }


}