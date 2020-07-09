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
    private static final String TAG = "attriby=utesOFEarthquake List Adapter";

    private Context mContext;
    private  int mResource;
    private  int lastPosition = -1;

    /**
     * Holds variables in a View
     */
    private static class ViewHolder {
        TextView place ;
        TextView date ;
        TextView mag ;
    }

    /**
     * Default constructor for the attributesEarthquakeAdapter
     * @param context
     * @param resource
     * @param objects
     */
    public attributeAdapter(@NonNull Context context, int resource ,ArrayList<attributesOfEarthquake> objects) {
        super(context,resource ,objects);
        mContext = context ;
        mResource = resource ;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String place = getItem(position).getPlace();
        String date = getItem(position).getDate();
        String mag = getItem(position).getMag();

        //create the attributes object with the information
        attributesOfEarthquake attributes = new attributesOfEarthquake(mag , date , place);

        //create the view result for showing the animation
        final View result;

        // ViewHolder object
        ViewHolder holder;


        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource , parent  , false);
            holder = new ViewHolder();
            holder.place = (TextView) convertView.findViewById(R.id.place);
            holder.date = (TextView) convertView.findViewById(R.id.date);
            holder.mag = (TextView) convertView.findViewById(R.id.mag);

            result =  convertView;
            convertView.setTag(holder);

        }
        else {
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        holder.place.setText(attributes.getPlace());
        holder.date.setText(attributes.getDate());
        holder.mag.setText(attributes.getMag());

        return convertView;

    }
}
