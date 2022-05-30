package com.example.customaarraylistbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class  CustomAdapter extends BaseAdapter {
    Context context;
    String daysList[];
    int flags[];
    LayoutInflater infl;

    public CustomAdapter(Context context, String[] daysList, int flags, LayoutInflater infl) {

        this.context = context;
        this.daysList = daysList;
        this.flags = flags;
        //Context applicationContext;
        infl = (LayoutInflater.from(applicationContext));
    }

    public int getCount() {
        return daysList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = infl.inflate(R.layout.activity_listview , null);
        TextView day = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        day.setText(daysList[i]);
        icon.setImageResource(flags[i]);
        return view;
    }
}
