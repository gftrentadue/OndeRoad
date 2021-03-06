package com.unimi.mobidev.onderoad.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

import java.io.Serializable;

/**
 * Created by Giuseppe Fabio Trentadue on 30/09/2016.
 */

public class SpotInfo implements Serializable, ClusterItem {

    private String regionSpot;
    private String provinceSpot;
    private String citySpot;
    private String title;
    private double latitudeSpot;
    private double longitudeSpot;
    private int ratingSpot;
    private String snippet;
    private SpotInfoTable tableSpot;

    public SpotInfo(){}

    public SpotInfo(String regionSpot, String provinceSpot, String citySpot, String title, double latitudeSpot, double longitudeSpot, int ratingSpot, String snippet, SpotInfoTable table) {
        this.regionSpot = regionSpot;
        this.provinceSpot = provinceSpot;
        this.citySpot = citySpot;
        this.title = title;
        this.latitudeSpot = latitudeSpot;
        this.longitudeSpot = longitudeSpot;
        this.ratingSpot = ratingSpot;
        this.snippet = snippet;
        this.tableSpot = table;
    }

    public String getRegionSpot() {
        return regionSpot;
    }

    public void setRegionSpot(String regionSpot) {
        this.regionSpot = regionSpot;
    }

    public String getProvinceSpot() {
        return provinceSpot;
    }

    public void setProvinceSpot(String provinceSpot) {
        this.provinceSpot = provinceSpot;
    }

    public String getCitySpot() {
        return citySpot;
    }

    public void setCitySpot(String citySpot) {
        this.citySpot = citySpot;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*public LatLng getLatLngSpot() {
        return new LatLng(this.latitudeSpot, this.longitudeSpot);
    }*/

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

    @Override
    public String getSnippet() {
        return this.snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public SpotInfoTable getTableSpot() {
        return tableSpot;
    }

    public void setTableSpot(SpotInfoTable tableSpot) {
        this.tableSpot = tableSpot;
    }

    public String toString() {
        return "SpotInfo: " +
                "\nSpot Region: " + this.regionSpot +
                "\nSpot Province: " + this.provinceSpot +
                "\nSpot City: " + this.citySpot +
                "\nSpot Name: " + this.title +
                "\nLatitude: " + this.latitudeSpot +
                "\nLongitude: " + this.longitudeSpot +
                "\nRating: " + this.ratingSpot +
                "\nDescription: " + this.snippet +
                "\n" + this.tableSpot.toString();
    }

    @Override
    public LatLng getPosition() {
        return new LatLng(this.latitudeSpot, this.longitudeSpot);
    }

}
