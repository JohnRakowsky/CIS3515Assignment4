package edu.temple.assignment4;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdaptor extends BaseAdapter {
    Context context;
    String[] colors;
    LayoutInflater inflater;

    public ColorAdaptor(Context c, String[] co){
        this.context = c;
        this.colors = co;
    }

    @Override
    public int getCount() {

        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView newview = new TextView(context);

        newview.setText(colors[position]);
        newview.setBackgroundColor(Color.parseColor(colors[position]));

        return newview;
    }


}
