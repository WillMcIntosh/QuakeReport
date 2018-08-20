package com.example.android.quakereport;

public class Earthquake {
    private double mag;
    private String location;
    private String date;

    public Earthquake(double mag, String location, String date) {
        this.mag = mag;
        this.location = location;
        this.date = date;
    }

    public double getMag() {
        return mag;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }
}
