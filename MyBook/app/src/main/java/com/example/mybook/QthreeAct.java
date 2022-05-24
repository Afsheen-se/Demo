package com.example.mybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QthreeAct extends AppCompatActivity {
    TextView tv1 ;
    Button btn1 , btn2;
    RadioButton rb1 , rb2 ;
    int marks=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qthree);
        tv1=findViewById(R.id.tv1);
        btn1 = findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        // Intent intent;
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rb1.isChecked() && !rb2.isChecked())
                    btn1.setText("Wrong Answer!");
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!rb1.isChecked() && rb2.isChecked())
                    btn1.setText("Right Answer!");
                marks++;
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QthreeAct.this, QfourAct.class);
                if(rb1.isChecked() && !rb2.isChecked())
                    //intent = new Intent(QoneAct.this , QtwoAct.class);
                    startActivity(intent);
                if(!rb1.isChecked() && rb2.isChecked())
                    //intent = new Intent(QoneAct.this , QtwoAct.class);
                    marks=marks+1;
                    intent.putExtra("marks" , marks);
                    startActivity(intent);
                if(!rb1.isChecked() && !rb2.isChecked())
                    btn1.setText("choose any option to move further!");


            }
        });
    }
}