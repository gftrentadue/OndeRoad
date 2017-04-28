package com.unimi.mobidev.onderoad.model;

import com.google.android.gms.maps.model.LatLng;

import java.io.Serializable;

/**
 * Created by Giuseppe Fabio Trentadue on 30/09/2016.
 */

public class SpotInfo implements Serializable {

    private String nameSpot;
    private String regionSpot;
    private double latitudeSpot;
    private double longitudeSpot;
    private int ratingSpot;
    private String descriptionSpot;

    public SpotInfo(String nameSpot, String regionSpot, double latitudeSpot, double longitudeSpot, int ratingSpot, String descriptionSpot) {
        this.nameSpot = nameSpot;
        this.regionSpot = regionSpot;
        this.latitudeSpot = latitudeSpot;
        this.longitudeSpot = longitudeSpot;
        this.ratingSpot = ratingSpot;
        this.descriptionSpot = descriptionSpot;
    }

    public String getNameSpot() {
        return nameSpot;
    }

    public void setNameSpot(String nameSpot) {
        this.nameSpot = nameSpot;
    }

    public String getRegionSpot() {
        return regionSpot;
    }

    public void setRegionSpot(String regionSpot) {
        this.regionSpot = regionSpot;
    }

    public LatLng getLatLngSpot() {
        return new LatLng(this.latitudeSpot, this.longitudeSpot);
    }

    public double getLatitudeSpot() {
        return latitudeSpot;
    }

    public void setLatitudeSpot(double latitudeSpot) {
        this.latitudeSpot = latitudeSpot;
    }

    public double getLongitudeSpot() {
        return longitudeSpot;
    }

    public void setLongitudeSpot(double longitudeSpot) {
        this.longitudeSpot = longitudeSpot;
    }

    public int getRatingSpot() {
        return ratingSpot;
    }

    public void setRatingSpot(int ratingSpot) {
        this.ratingSpot = ratingSpot;
    }

    public String getDescriptionSpot() {
        return descriptionSpot;
    }

    public void setDescriptionSpot(String descriptionSpot) {
        this.descriptionSpot = descriptionSpot;
    }

    public String toString() {
        return "SpotInfo: " +
                "\nSpot Name: " + this.nameSpot +
                "\nLatitude: " + this.latitudeSpot +
                "\nLongitude: " + this.longitudeSpot +
                "\nRating: " + this.ratingSpot +
                "\nDescription: " + this.descriptionSpot;
    }
}
