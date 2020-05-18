package com.company.transport;

import java.util.Date;

public abstract class Transport {
    private String id;
    private String ownership;
    private Date dateOfPurchase;
    private String price;
    private String GPSPosition;

    public abstract void drivingMethod ();
    public abstract void load();
    public abstract void maintain();
    public abstract void addGas();
    public Transport() {
    }

    public Transport(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }
}