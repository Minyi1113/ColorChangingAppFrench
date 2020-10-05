package edu.temple.colorchangingapp;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class ColorAdapter extends BaseAdapter {

    Context context;
    ArrayList<CustomColor> items;
    int colors[];

    public ColorAdapter(Context context, ArrayList<CustomColor> items){
        this.context = context;
        this.items = items;

        colors = new int[11];
        colors[0] = Color.WHITE;
        colors[1] = Color.RED;
        colors[2] = Color.YELLOW;
        colors[3] = Color.GREEN;
        colors[4] = Color.LTGRAY;
        colors[5] = Color.BLUE;
        colors[6] = Color.GRAY;
        colors[7] = Color.BLACK;
        colors[8] = Color.CYAN;
        colors[9] = Color.DKGRAY;
        colors[10] = Color.MAGENTA;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView textView;
        if (convertView == null) {
            textView = new TextView(context);
            textView.setTextSize(20);
            textView.setPadding(8,8,8,8);
        }
        else
            textView = (TextView) convertView;

        textView.setText(getItem(position).toString());
        textView.setBackgroundColor(colors[position % colors.length]);
        return textView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View v = getView(position, convertView, parent);
        return v;
    }

}