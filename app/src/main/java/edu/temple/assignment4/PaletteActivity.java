package edu.temple.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;

public class PaletteActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    ArrayList<String> colors = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Cyan");
        colors.add("Gray");
        colors.add("Magenta");
        colors.add("Silver");
        colors.add("Teal");
        colors.add("Green");

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        ColorAdaptor adaptor = new ColorAdaptor(this, colors );

        spinner.setAdapter(adaptor);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
