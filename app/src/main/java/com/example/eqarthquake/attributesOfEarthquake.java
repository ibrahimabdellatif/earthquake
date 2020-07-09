package com.example.eqarthquake;

public class attributesOfEarthquake {
private float mag;
private String date;
private String place;
public attributesOfEarthquake(float mmag , String mdate , String mplace){
    mag = mmag;
    date = mdate;
    place = mplace;
}

public float getMag(){
    return mag;
}
public String getDate(){return date;}
public String getPlace(){return place;}

}
