package com.example.eqarthquake;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Again";
    public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG , "onCreate: Started. ");
        ListView mListView = (ListView) findViewById(R.id.listView);
        // Array List for City
        ArrayList<attributesOfEarthquake> earthquakes = new ArrayList<attributesOfEarthquake>();
        earthquakes.add(new attributesOfEarthquake("7.2" , "Feb 2,2016","San Francusco"));
        earthquakes.add(new attributesOfEarthquake("6.1" , "July 20,2015" , "London"));
        earthquakes.add(new attributesOfEarthquake("3.9" , "Nov 10,2014" , "Tokyo"));
        earthquakes.add(new attributesOfEarthquake("5.4" , "May 3,2014" ,"Mexico City"));
        earthquakes.add(new attributesOfEarthquake("2.8" , "Jan 31,2013" , "Moscow"));
        earthquakes.add(new attributesOfEarthquake("4.9" , "Aug 19,2012" , "Rio de Janeiro"));
        earthquakes.add(new attributesOfEarthquake("1.6" , "Oct 30,2011" , "Paris"));

        attributeAdapter adapter = new attributeAdapter(this ,R.layout.adapter_view ,earthquakes);
        Log.d("this", "first");
        //the problem is here in listView definition
        mListView.setAdapter(adapter);
        Log.d("this" , "second log ");
    }
}