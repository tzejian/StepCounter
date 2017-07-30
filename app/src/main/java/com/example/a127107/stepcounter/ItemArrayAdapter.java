package com.example.a127107.stepcounter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ItemArrayAdapter extends ArrayAdapter<String[]> {
    private List<String[]> scoreList = new ArrayList<String[]>();

    static class ItemViewHolder {
        TextView year,physical,fruit,veg,gender;

    }

    public ItemArrayAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    @Override
    public void add(String[] object) {
        scoreList.add(object);
        super.add(object);
    }

    @Override
    public int getCount() {
        return this.scoreList.size();
    }

    @Override
    public String[] getItem(int index) {
        return this.scoreList.get(index);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ItemViewHolder viewHolder;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) this.getContext().
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.item_layout, parent, false);
            viewHolder = new ItemViewHolder();
            viewHolder.year = (TextView) row.findViewById(R.id.year);
            viewHolder.physical = (TextView) row.findViewById(R.id.physical);
            viewHolder.gender = (TextView) row.findViewById(R.id.gender);
            viewHolder.fruit = (TextView) row.findViewById(R.id.fruits_intake);
            viewHolder.veg = (TextView) row.findViewById(R.id.veg_intake);
            row.setTag(viewHolder);
        } else {
            viewHolder = (ItemViewHolder)row.getTag();
        }
        String[] stat = getItem(position);
        viewHolder.year.setText(stat[0] + " ");
        viewHolder.gender.setText(stat[1]);
        viewHolder.physical.setText(stat[2]);
        viewHolder.fruit.setText(stat[3]);
        return row;
    }
}
