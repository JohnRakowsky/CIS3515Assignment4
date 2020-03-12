package edu.temple.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

import static java.lang.System.in;

public class CanvasActivity extends AppCompatActivity {

    TextView palleteView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        this.setTitle("Canvas Activity");

        palleteView = (TextView) findViewById(R.id.newColor);

        Intent recievedIntent = getIntent();
        String colordata = recievedIntent.getStringExtra("message_key");

        palleteView.setText(colordata);

        String language = Locale.getDefault().getDisplayLanguage();
        if(language == "es") {


            if(colordata == "Blanco"){
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);
            }
            else if(colordata == "Rojo"){
                getWindow().getDecorView().setBackgroundColor(Color.RED);
            }
            else if(colordata == "Amarillo"){
                getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
            }
            else if(colordata == "Cian"){
                getWindow().getDecorView().setBackgroundColor(Color.CYAN);
            }
            else if(colordata == "Gris"){
                getWindow().getDecorView().setBackgroundColor(Color.GRAY);
            }
            else if(colordata == "Magenta"){
                getWindow().getDecorView().setBackgroundColor(Color.MAGENTA);
            }
            else if(colordata == "Plata"){
                getWindow().getDecorView().setBackgroundColor(Color.LTGRAY);
            }
            else if(colordata == "Verde Azulado"){
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
            }
            else if(colordata == "Azul"){
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
            }
            else if(colordata == "Verde"){
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
            }
        }
        else {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor(colordata));
        }
    }
}
