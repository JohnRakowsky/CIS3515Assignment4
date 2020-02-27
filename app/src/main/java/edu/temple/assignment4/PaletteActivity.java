package edu.temple.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;

public class PaletteActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    int i = 0;
    ArrayList<String> colors = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Pallete Activity");

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
        i++;
        if(i != 1) {
            Intent launchActivityIntent = new Intent(PaletteActivity.this, CanvasActivity.class);


            String colorString = colors.get(position);

            launchActivityIntent.putExtra("message_key", colorString);

            //  Launch the activity using the created intent. Fire and Forget method.
            startActivity(launchActivityIntent);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
