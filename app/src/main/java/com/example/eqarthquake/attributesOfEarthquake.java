package com.example.eqarthquake;

import java.text.SimpleDateFormat;
import java.util.Date;

public class attributesOfEarthquake {
        double mag;
        private String place;
        private long timeInMilliseconds ;
        private String mUrl;
        Date dateObject = new Date(timeInMilliseconds);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
        String dateToDisplay = dateFormatter.format(dateObject);
        public attributesOfEarthquake(double numOfMag , String mplace , long mtimeInMilliseconds , String Url){
        timeInMilliseconds = mtimeInMilliseconds ;
        mUrl = Url;
        mag = numOfMag;
        place = mplace;
        }

        public double getMag() {
                return mag;
        }

        public String getPlace(){
            return place;
        }
        public long getTimeInMilliseconds(){
                return timeInMilliseconds;
        }
        public String getUri(){
                return mUrl;
        }

}
