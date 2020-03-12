package edu.temple.assignment4;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

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
        String language = Locale.getDefault().getDisplayLanguage();

        if(language == "es"){
            String[] colorsen = new String[10];

            colorsen[0] = "White";
            colorsen[0] = "Red";
            colorsen[0] = "Blue";
            colorsen[0] = "Yellow";
            colorsen[0] = "Cyan";
            colorsen[0] = "Gray";
            colorsen[0] = "Magenta";
            colorsen[0] = "Silver";
            colorsen[0] = "Teal";
            colorsen[0] = "Green";

            TextView newview = new TextView(context);

            newview.setText(colors[position]);
            newview.setBackgroundColor(Color.parseColor(colorsen[position]));

            return newview;
        }
        else {
            TextView newview = new TextView(context);

            newview.setText(colors[position]);
            newview.setBackgroundColor(Color.parseColor(colors[position]));

            return newview;
        }
    }


}
