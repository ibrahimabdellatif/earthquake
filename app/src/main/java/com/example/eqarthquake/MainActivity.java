package com.example.eqarthquake;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.view.View;
import android.widget.AdapterView;
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
        ListView earthquakeListView = (ListView) findViewById(R.id.listView);
        // Array List for City
        ArrayList<attributesOfEarthquake> earthquake = QueryUtils.extractEarthquakes();

        final attributeAdapter adapter = new attributeAdapter(this ,earthquake);

        Log.d("this", "first");
        //the problem is here in listView definition
        earthquakeListView.setAdapter(adapter);
        Log.d("this" , "second log ");
        earthquakeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Find the current earthquake that was clicked on
                attributesOfEarthquake currentEarthquake = adapter.getItem(position);
                Uri earthquakeUri = Uri.parse(currentEarthquake.getUri());

                Intent websiteIntent = new Intent(Intent.ACTION_VIEW , earthquakeUri);

                startActivity(websiteIntent);

            }
        });

    }
}