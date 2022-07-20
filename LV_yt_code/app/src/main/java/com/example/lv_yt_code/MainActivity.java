package com.example.lv_yt_code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String[] cities = {"Quetta" , "karachi" , "islambad" , "lahore" , "okara"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this , android.R.layout.simple_dropdown_item_1line , cities);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "clicked "+ cities[position] , Toast.LENGTH_SHORT ).show();
            }
        });

    }
}