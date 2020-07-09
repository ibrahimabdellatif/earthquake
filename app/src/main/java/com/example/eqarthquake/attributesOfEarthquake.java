package com.example.eqarthquake;

public class attributesOfEarthquake {
        private String mag;
        private String date;
        private String place;
        public attributesOfEarthquake(String numOfMag , String mdate , String mplace){
        mag = numOfMag;
        date = mdate;
        place = mplace;
        }

        public String getMag()
        {
        return mag;
        }
        public void setMag(String mag){
        this.mag = mag;
        }
        public String getDate()
        {
            return date;
        }
        public void setDate(String date){
            this.date = date;
        }
        public String getPlace(){
            return place;
        }
        public void setPlace(String place){
            this.place = place;
        }

        }
