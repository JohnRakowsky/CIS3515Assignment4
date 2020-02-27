package edu.temple.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

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

        getWindow().getDecorView().setBackgroundColor(Color.parseColor(colordata));

    }
}
