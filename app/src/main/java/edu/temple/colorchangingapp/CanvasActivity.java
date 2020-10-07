package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AppComponentFactory;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class CanvasActivity extends AppCompatActivity {
    ConstraintLayout gridlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView gridtext = new TextView(this);
        gridtext.setGravity(4);

        gridlayout = findViewById(R.id.gridlayout);

        Intent startIntent = getIntent();
        int color = startIntent.getIntExtra("Color",0);

        if(color == 0 ){
            gridlayout.setBackgroundColor(Color.RED);
            gridtext.setText("RED");
            gridlayout.addView(gridtext);
        }else if(color == 1){
            gridlayout.setBackgroundColor(Color.YELLOW);
            gridtext.setText("YELLOW");
            gridlayout.addView(gridtext);
        } else if(color == 2){
            gridlayout.setBackgroundColor(Color.GREEN);
            gridtext.setText("GREEN");
            gridlayout.addView(gridtext);
        }else if(color == 3){
            gridlayout.setBackgroundColor(Color.LTGRAY);
            gridtext.setText("LIGHTGREY");
            gridlayout.addView(gridtext);
        }else if(color == 4){
            gridlayout.setBackgroundColor(Color.BLUE);
            gridtext.setText("BLUE");
            gridlayout.addView(gridtext);
        }else if(color == 5){
            gridlayout.setBackgroundColor(Color.GRAY);
            gridtext.setText("GRAY");
            gridlayout.addView(gridtext);
        }else if(color == 6){
            gridlayout.setBackgroundColor(Color.WHITE);
            gridtext.setText("WHITE");
            gridlayout.addView(gridtext);
        }else if(color == 7){
            gridlayout.setBackgroundColor(Color.BLACK);
            gridtext.setText("BLACK");
            gridlayout.addView(gridtext);
        }else if(color == 8){
            gridlayout.setBackgroundColor(Color.CYAN);
            gridtext.setText("CYAN");
            gridlayout.addView(gridtext);
        }else if(color == 9){
            gridlayout.setBackgroundColor(Color.DKGRAY);
            gridtext.setText("DKGRAY");
            gridlayout.addView(gridtext);
        }else if(color == 10){
            gridlayout.setBackgroundColor(Color.MAGENTA);
            gridtext.setText("MAGENTA");
            gridlayout.addView(gridtext);
        }else if(color == 11){
            gridlayout.setBackgroundColor(Color.RED);
            gridtext.setText("RED");
            gridlayout.addView(gridtext);
        }
    }
}