package com.example.customaarraylistbaseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String daysList[]= {"Monday", "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday"};
    int daysIcon[]= {R.mipmap.mon,R.mipmap.tue , R.mipmap.wed , R.mipmap.thur , R.mipmap.fri , R.mipmap.sat , R.mipmap.sun};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList= findViewById(R.id.simpleListView);
        //ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView , daysList);
        //simpleList.setAdapter(arrayAdapter);
        CustomAdapter arrayAdapter = new CustomAdapter(getApplicationContext() , daysList , daysIcon);
        simpleList.setAdapter(arrayAdapter);

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Clicked On  " + daysList[position] , Toast.LENGTH_LONG).show();
            }
        });

    }
}