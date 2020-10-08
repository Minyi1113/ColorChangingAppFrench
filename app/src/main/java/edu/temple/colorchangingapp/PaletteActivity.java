package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.Spinner;

import java.util.ArrayList;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!= null)
            getSupportActionBar().setTitle("PaletteActivity");

        String[] color = {"RED","YELLOW","GREEN","LIGHTGREY","BLUE","GRAY","WHITE","BLACK", "CYAN","DRAKGREY","MAGENTA","RED"};

        final GridView gridview = (GridView) findViewById(R.id.gridview);
        final ColorAdapter adapter = new ColorAdapter(this, color);
        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                intent.putExtra("Color", position); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }
}
