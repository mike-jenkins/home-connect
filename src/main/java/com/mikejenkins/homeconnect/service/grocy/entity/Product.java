package com.mikejenkins.homeconnect.service.grocy.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * @author Mike Jenkins
 * @version 1.0, 3/5/2020
 * @since 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product extends GrocyObject{
    @JsonAlias("location_id")
    private String locationId;

    private String barcode;

    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String[] getBarcodes() {
        return barcode.split(",");
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
