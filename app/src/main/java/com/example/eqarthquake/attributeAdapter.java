package com.example.eqarthquake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class attributeAdapter extends ArrayAdapter<attributesOfEarthquake>  {
    public attributeAdapter(@NonNull Context context, ArrayList<attributesOfEarthquake> attributes) {
        super(context, 0 ,attributes );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            LayoutInflater listItem = LayoutInflater.from(getContext());
            convertView = listItem.inflate(R.layout.activity_main , parent  , false);
        }

         attributesOfEarthquake attributes =getItem(position);
        TextView places = convertView.findViewById(R.id.place);
        places.setText(attributes.getPlace());
        TextView dates = convertView.findViewById(R.id.date);
        dates.setText(attributes.getDate());
        TextView mag = convertView.findViewById(R.id.mag);
        mag.setText((int) attributes.getMag());

        return convertView;



    }
}
