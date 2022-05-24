package com.example.mybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnlsn , btnlrn , btnrep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlsn=findViewById(R.id.btnlsn);
        btnlrn=findViewById(R.id.btnlrn);
        btnrep=findViewById(R.id.btnrep);
        btnlsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , LsnActivity.class);
                startActivity(intent);
            }
        });
        btnlrn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , QoneAct.class);
                startActivity(intent);
            }
        });
        btnrep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebPage("https://github.com/Afsheen-se/Demo");
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