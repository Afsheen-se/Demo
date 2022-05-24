package com.example.mybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QfiveAct extends AppCompatActivity {
    TextView tv1 ;
    Button btn1 , btn2 , btn3;
    RadioButton rb1 , rb2 ;
    int marks=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qfive);
        tv1=findViewById(R.id.tv1);
        btn1 = findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        btn3=findViewById(R.id.btn3);
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
                    marks=marks+1;

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QfiveAct.this,QlastAct.class);
                //if(rb1.isChecked() && !rb2.isChecked())
                    //intent = new Intent(QfiveAct.this , QlastAct.class);
                     //startActivity(intent);
                //if(!rb1.isChecked() && rb2.isChecked())
                    //intent = new Intent(QfiveAct.this , QtwoAct.class);

                     marks=marks+1;
                     intent.putExtra("marks" , marks);
                     startActivity(intent);
                if(!rb1.isChecked() && !rb2.isChecked())
                    btn1.setText("choose any option to move further!");


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marks=marks;
                Intent intent = new Intent(QfiveAct.this , QlastAct.class);
                intent.putExtra("marks" , marks);
                startActivity(intent);
            }
        });
    }
}