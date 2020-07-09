package com.example.eqarthquake;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Array List for City
        ArrayList<attributesOfEarthquake> earthquakes = new ArrayList<attributesOfEarthquake>();
        earthquakes.add(new attributesOfEarthquake(7.2f , "Feb 2,2016","San Francusco"));
        earthquakes.add(new attributesOfEarthquake(6.1f , "July 20,2015" , "London"));
        earthquakes.add(new attributesOfEarthquake(3.9f , "Nov 10,2014" , "Tokyo"));
        earthquakes.add(new attributesOfEarthquake(5.4f , "May 3,2014" ,"Mexico City"));
        earthquakes.add(new attributesOfEarthquake(2.8f , "Jan 31,2013" , "Moscow"));
        earthquakes.add(new attributesOfEarthquake(4.9f , "Aug 19,2012" , "Rio de Janeiro"));
        earthquakes.add(new attributesOfEarthquake(1.6f , "Oct 30,2011" , "Paris"));
        attributeAdapter adapter =new attributeAdapter(this , earthquakes);
        Log.d("this", "first");
        //the problem is here in listView definition
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        Log.d("this" , "second log ");
    }
}