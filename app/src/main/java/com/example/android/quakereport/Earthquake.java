package com.example.android.quakereport;

public class Earthquake {
    private double magnitude;
    private String location;
    private Long timeInMilliseconds;
    private String Url;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(double magnitude, String location, Long timeInMilliseconds, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMilliseconds = timeInMilliseconds;
        this.Url = url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public Long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public String getUrl() {
        return Url;
    }
}
