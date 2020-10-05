package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.Spinner;

import java.util.ArrayList;

public class PaletteActivity extends AppCompatActivity {


    private ArrayList<CustomColor> items = new ArrayList<>();
    private ColorAdapter adapter;
    private boolean first = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = (GridView) findViewById(R.id.gridview);

       // items = new ArrayList<>();
        addColor();

        adapter = new ColorAdapter(this, items);
        gridview.setAdapter(adapter);

        gridview.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if (first) {
                    first = false;
                    return;
                }
                Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                String color = items.get(position).getColor();
                intent.putExtra("color", color);
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void addColor() {
        items.add(new CustomColor(getString(R.string.white),"#FFFFFF"));
        items.add(new CustomColor(getString(R.string.blue),"#0000ff"));
        items.add(new CustomColor(getString(R.string.red),"#ff0000"));
        items.add(new CustomColor(getString(R.string.yellow),"#ffff00"));
        items.add(new CustomColor(getString(R.string.magenta),"#ff00ff"));
        items.add(new CustomColor(getString(R.string.lig),"#cccccc"));
        items.add(new CustomColor(getString(R.string.green),"#00ff00"));
        items.add(new CustomColor(getString(R.string.na),"#FFDEAD"));
        items.add(new CustomColor(getString(R.string.greenyellow),"#ADFF2F"));
        items.add(new CustomColor(getString(R.string.green),"#00ff00"));
        items.add(new CustomColor(getString(R.string.na),"#FFDEAD"));
        items.add(new CustomColor(getString(R.string.greenyellow),"#ADFF2F"));

    }



}