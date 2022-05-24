package com.example.mybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LsnActivity extends AppCompatActivity {
    Button btnA , btnB , btnC , btnD , btnE , btnF , btnG , btnH ,btnI , btnJ , btnK ,btnL , btnM , btnN , btnO,btnP,btnQ,btnR,btnS,btnT,btnU,btnV,btnW,btnX,btnY,btnZ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lsn);
        btnA=findViewById(R.id.btnA);
        btnB=findViewById(R.id.btnB);
        btnC=findViewById(R.id.btnC);
        btnD=findViewById(R.id.btnD);
        btnE=findViewById(R.id.btnE);
        btnF=findViewById(R.id.btnF);
        btnG=findViewById(R.id.btnG);
        btnH=findViewById(R.id.btnH);
        btnI=findViewById(R.id.btnI);
        btnJ=findViewById(R.id.btnJ);
        btnK=findViewById(R.id.btnK);
        btnL=findViewById(R.id.btnL);
        btnM=findViewById(R.id.btnM);
        btnN=findViewById(R.id.btnN);
        btnO=findViewById(R.id.btnO);
        btnP=findViewById(R.id.btnP);
        btnQ=findViewById(R.id.btnQ);
        btnR=findViewById(R.id.btnR);
        btnS=findViewById(R.id.btnS);
        btnT=findViewById(R.id.btnT);
        btnU=findViewById(R.id.btnU);
        btnV=findViewById(R.id.btnV);
        btnW=findViewById(R.id.btnW);
        btnX=findViewById(R.id.btnX);
        btnY=findViewById(R.id.btnY);
        btnZ=findViewById(R.id.btnZ);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , PicActivity.class);
                startActivity(intent);
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , BAct.class);
                startActivity(intent);
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , CAct.class);
                startActivity(intent);
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , DAct.class);
                startActivity(intent);
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , EAct.class);
                startActivity(intent);
            }
        });
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , FAct.class);
                startActivity(intent);
            }
        });
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , GAct.class);
                startActivity(intent);
            }
        });
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , HAct.class);
                startActivity(intent);
            }
        });
        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , IAct.class);
                startActivity(intent);
            }
        });
        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , JAct.class);
                startActivity(intent);
            }
        });
        btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , KAct.class);
                startActivity(intent);
            }
        });
        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , LAct.class);
                startActivity(intent);
            }
        });
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , MAct.class);
                startActivity(intent);
            }
        });
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , NAct.class);
                startActivity(intent);
            }
        });
        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , OAct.class);
                startActivity(intent);
            }
        });
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , PAct.class);
                startActivity(intent);
            }
        });
        btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , QAct.class);
                startActivity(intent);
            }
        });
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , RAct.class);
                startActivity(intent);
            }
        });
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , SAct.class);
                startActivity(intent);
            }
        });
        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , TAct.class);
                startActivity(intent);
            }
        });
        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , UAct.class);
                startActivity(intent);
            }
        });
        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , VAct.class);
                startActivity(intent);
            }
        });
        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , WAct.class);
                startActivity(intent);
            }
        });
        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , XAct.class);
                startActivity(intent);
            }
        });
        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , YAct.class);
                startActivity(intent);
            }
        });
        btnZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LsnActivity.this , ZAct.class);
                startActivity(intent);
            }
        });

    }
}