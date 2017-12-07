package com.nationalcharge.model;

import org.springframework.stereotype.Component;

@Component
public class Location {
    double latitude;
    double longitude;
    
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
