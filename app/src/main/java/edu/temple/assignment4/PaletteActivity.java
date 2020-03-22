package edu.temple.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;

public class PaletteActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, PalleteFragment.OnFragmentInteractionListener {

    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Pallete Activity");


        PalleteFragment pallete = PalleteFragment.newInstance("Test");

        getSupportFragmentManager().beginTransaction().add(R.id.container1, pallete).commit();




        //Resources res = getResources();
        //String[] colors = res.getStringArray(R.array.colorsarray);

        //Spinner spinner = (Spinner) findViewById(R.id.spinner);
        //spinner.setOnItemSelectedListener(this);

        //ColorAdaptor adaptor = new ColorAdaptor(this, colors );

        //spinner.setAdapter(adaptor);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Resources res = getResources();
        String[] colors = res.getStringArray(R.array.colorsarray);
        i++;
        if(i != 1) {
            Intent launchActivityIntent = new Intent(PaletteActivity.this, CanvasActivity.class);


            String colorString = colors[position];

            launchActivityIntent.putExtra("message_key", colorString);

            //  Launch the activity using the created intent. Fire and Forget method.
            startActivity(launchActivityIntent);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
    public void buttonClicked(int id) {


    }



}
